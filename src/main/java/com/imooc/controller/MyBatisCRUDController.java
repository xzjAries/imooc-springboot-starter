package com.imooc.controller;

import java.util.Date;
import java.util.List;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Videos;
import com.imooc.service.VideoService;

@RestController
@RequestMapping("mybatis")
public class MyBatisCRUDController {

	@Autowired
	private VideoService videoService;

	@Autowired
	private Sid sid;

	@RequestMapping("/save")
	public IMoocJSONResult saveUser() throws Exception {

		String id = sid.nextShort();
		Videos videos = new Videos();
		videos.setAudioId("12008");
		videos.setCoverPath("");
		videos.setCreateTime(new Date());
		videos.setLikeCounts(212);
		videos.setStatus(1);
		videos.setVideoDesc("亚洲123333");
		videos.setVideoHeight(11);
		videos.setVideoPath("http://www.baidu");
		videos.setVideoSeconds(1000.0f);
		videos.setVideoWidth(808);
		videos.setUserId(id);

		videoService.saveVideo(videos);
		return IMoocJSONResult.ok("保存成功");

	}

	@RequestMapping("/update")
	public IMoocJSONResult update() {
		Videos videos = new Videos();
		videos.setId(2);
		videos.setUserId("1806077D2SFG8N7C");
		videos.setVideoDesc("徐志杰0215");

		videoService.updateVideo(videos);
		return IMoocJSONResult.ok("更新成功");
	}
	
	@RequestMapping("/queryUserListPaged")
	public IMoocJSONResult queryUserListPaged(Integer pageIndex) {
		if(pageIndex == null) {
			pageIndex = 1;
		}
		int pageSize = 10;
		Videos videos = new Videos();
		//videos.setVideoDesc("徐志杰0215");
		List<Videos> videosList = videoService.queryvideoListPaged(videos, pageIndex, pageSize);
		
		return IMoocJSONResult.ok(videosList);
	}
	

}
