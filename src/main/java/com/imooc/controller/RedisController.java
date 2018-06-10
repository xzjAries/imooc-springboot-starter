package com.imooc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Videos;
import com.imooc.utils.JsonUtils;
import com.imooc.utils.RedisOperator;

@RestController
@RequestMapping("redis")
public class RedisController {
	@Autowired
	private StringRedisTemplate strRedis;
    
	@Autowired
	private RedisOperator redisOperator;
	
	@RequestMapping("/test")
	public IMoocJSONResult test() {
		strRedis.opsForValue().set("imooc-cache","hello 慕课网~~~");
		
		Videos videso = new Videos();
		videso.setAudioId("fasdf");
		videso.setCreateTime(new Date());
		videso.setStatus(1);
		strRedis.opsForValue().set("json:video",JsonUtils.objectToJson(videso));
        
		Videos jsonVideos = JsonUtils.jsonToPojo(strRedis.opsForValue().get("json:video"), Videos.class);
		
		return IMoocJSONResult.ok(jsonVideos);
	}
	
	
	@RequestMapping("/getVidosList")
	public IMoocJSONResult getVidosList() {
		Videos videos = new Videos();
		videos.setId(0);
		videos.setUserId("1806077D2SFG8N7C");
		videos.setVideoDesc("徐志杰0215");
		Videos videos1 = new Videos();
		videos1.setId(1);
		videos1.setUserId("1806077D2SFG8N7C");
		videos1.setVideoDesc("徐志杰0215");
		Videos videos2 = new Videos();
		videos2.setId(2);
		videos2.setUserId("1806077D2SFG8N7C");
		videos2.setVideoDesc("徐志杰0215");
		Videos videos3 = new Videos();
		videos3.setId(3);
		videos3.setUserId("1806077D2SFG8N7C");
		videos3.setVideoDesc("徐志杰0215");
		
		List<Videos> list = new ArrayList<>();
		list.add(videos);
		list.add(videos1);
		list.add(videos2);
		list.add(videos3);
		
		redisOperator.set("json:list", JsonUtils.objectToJson(list), 20000);
		
		List<Videos> listBean = JsonUtils.jsonToList(redisOperator.get("json:list"), Videos.class);
		
		return IMoocJSONResult.ok(listBean);
	}
}
