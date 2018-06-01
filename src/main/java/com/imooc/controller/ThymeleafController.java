package com.imooc.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.Resource;

@Controller
@RequestMapping("th")
public class ThymeleafController {
	@Autowired
	private Resource resource;
	
	@RequestMapping("/index")
	public String index(ModelMap map) {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		map.addAttribute("name","xuzhijie-thymeleaf-imooc");
		map.addAttribute("bean",bean);
		return "thymeleaf/index";
	}
	
	@RequestMapping("center")
	public String center(){
		
		return "thymeleaf/center/center";
	}

}
