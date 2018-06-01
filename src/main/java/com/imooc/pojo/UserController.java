package com.imooc.pojo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
	@RequestMapping("/getUserInfo")
	public User getUserInfo() {
		User user = new User();
		user.setAge(18);
		user.setBirthday(new Date());
		user.setName("wangjiayun");
		user.setPassword("111111");
		
	  return user;
	}
	
	@RequestMapping("/getIMoocUserJson")
	public IMoocJSONResult getIMoocUserJson() {
		User user = new User();
		user.setAge(18);
		user.setBirthday(new Date());
		user.setName("wangjiayun1111");
		user.setPassword("222222");
		
	  return IMoocJSONResult.ok(user);
	}
}
