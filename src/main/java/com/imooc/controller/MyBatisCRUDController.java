package com.imooc.controller;

import java.util.Date;

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
 public IMoocJSONResult saveUser() throws Exception{
	 
	 String id=sid.nextShort();
     Videos videos = new Videos();
     videos.setAudioId("12008");
     videos.setCoverPath("");
     videos.setCreateTime(new Date());
     videos.setLikeCounts(212);
     videos.setStatus(1);
     videos.setVideoDesc("今年流行的一个框架spootboot");
     videos.setVideoHeight(11);
     videos.setVideoPath("http://www.baidu");
     videos.setVideoSeconds(1000.0f);
     videos.setVideoWidth(808);
     videos.setUserId(id);
     videos.setId("121");
     
     videoService.saveVideo(videos);
	 return IMoocJSONResult.ok("保存成功");
	 
 }
}
