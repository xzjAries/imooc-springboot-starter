package com.imooc.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.TestSysUser;

@RestController
public class UserController {
    
	@RequestMapping("/getUserInfo")
	public TestSysUser getUserInfo() {
		TestSysUser user = new TestSysUser();
		user.setAge(18);
		user.setBirthday(new Date());
		user.setName("wangjiayun");
		user.setPassword("111111");
		
	  return user;
	}
	
	@RequestMapping("/getIMoocUserJson")
	public IMoocJSONResult getIMoocUserJson() {
		TestSysUser user = new TestSysUser();
		user.setAge(18);
		user.setBirthday(new Date());
		user.setName("wangjiayun1111");
		user.setPassword("222222");
		
	  return IMoocJSONResult.ok(user);
	}
}
