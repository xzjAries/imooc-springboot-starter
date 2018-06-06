package com.imooc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.mapper.VideosMapper;
import com.imooc.pojo.Videos;
import com.imooc.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService{
    
	@Autowired
	private VideosMapper videosMapper;

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


  
}
