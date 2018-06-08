package com.imooc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.imooc.mapper.VideosMapper;
import com.imooc.mapper.VideosMapperCustom;
import com.imooc.pojo.Videos;
import com.imooc.service.VideoService;

import tk.mybatis.mapper.entity.Example;

@Service
public class VideoServiceImpl implements VideoService{
    
	@Autowired
	private VideosMapper videosMapper;
    
	@Autowired
	private VideosMapperCustom videosMapperCustom;
	
	@Override
	public void saveVideo(Videos videos) throws Exception {
		videosMapper.insert(videos);
	}

	@Override
	public void deleteVideo(Videos videos) {
		videosMapper.delete(videos);
	}

	@Override
	public void updateVideo(Videos videos) {
		videosMapper.updateByPrimaryKeySelective(videos);
		
	}

	@Override
	public Videos queryVideoById(String id) {
		return videosMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Videos> queryVideoList(Videos videos) {
		return videosMapper.select(videos);
	}

	@Override
	public List<Videos> queryvideoListPaged(Videos videos, Integer pageIndex, Integer pageSize) {
		//开始分页
		PageHelper.startPage(pageIndex, pageSize);
		
		Example example = new Example(Videos.class);
		Example.Criteria criteria = example.createCriteria();
		if(!StringUtils.isEmptyOrWhitespace(videos.getVideoDesc())) {
			criteria.andLike("videoDesc", "%"+videos.getVideoDesc()+"%");
		}
		example.orderBy("createTime").desc();
		List<Videos> videosList = videosMapper.selectByExample(example);
		return videosList;
	}

	@Override
	public Videos queryUserByIdCustom(String userId, String audioId) {
		List<Videos> videosList = videosMapperCustom.queryVideosSimplyInfoById(userId,audioId);
	     if(videosList!=null && !videosList.isEmpty()) {
	    	 return (Videos)videosList.get(0);
	     }
		return null;
	}


  
}
