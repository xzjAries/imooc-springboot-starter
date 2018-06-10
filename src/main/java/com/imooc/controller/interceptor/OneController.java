package com.imooc.controller.interceptor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.TestSysUser;

@Controller
@RequestMapping("one")
public class OneController {

	@RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "thymeleaf-imooc");
        return "thymeleaf/index";
    }
	
	@RequestMapping("center")
    public String center() {
        return "thymeleaf/center/center";
    }
	
	@RequestMapping("test")
    public String test(ModelMap map) {
		
		TestSysUser u = new TestSysUser();
		u.setName("superadmin");
		u.setAge(18);
		u.setPassword("123465");
		u.setBirthday(new Date());
		u.setDesc("<font color='red'><b>EDU</b></font>");
		
		map.addAttribute("user", u);
		
		TestSysUser u1 = new TestSysUser();
		u1.setAge(19);
		u1.setName("imooc");
		u1.setPassword("123456");
		u1.setBirthday(new Date());
		
		TestSysUser u2 = new TestSysUser();
		u2.setAge(17);
		u2.setName("LeeCX");
		u2.setPassword("123456");
		u2.setBirthday(new Date());
		
		List<TestSysUser> userList = new ArrayList<>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		
		map.addAttribute("userList", userList);
		
        return "thymeleaf/test";
    }
	
	@PostMapping("postform")
    public String postform(TestSysUser u) {
		
		System.out.println("姓名：" + u.getName());
		System.out.println("年龄：" + u.getAge());
		
        return "redirect:/th/test";
    }
}