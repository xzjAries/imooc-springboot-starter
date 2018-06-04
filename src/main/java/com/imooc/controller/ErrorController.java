package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.pojo.IMoocJSONResult;

@Controller
@RequestMapping("err")
public class ErrorController {
	@RequestMapping("/errorOK")
	public String erro() {
		int i = 0 / 1;
		return "thymeleaf/errorOK";
	}

	@RequestMapping("/ajaxerror")
	public String ajaxerror() {

		return "thymeleaf/ajaxerror";
	}

	@RequestMapping("/getAjaxerror")
	@ResponseBody
	public IMoocJSONResult getAjaxerror() {

		int a = 1 / 0;

		return IMoocJSONResult.ok();
	}

}
