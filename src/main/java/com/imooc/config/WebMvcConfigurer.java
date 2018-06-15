package com.imooc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.imooc.controller.interceptor.OneInterceptor;

@SuppressWarnings("deprecation")
@Configuration 
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 拦截器按照顺序执行
		 */
		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
													 //.addPathPatterns("/one/**");
		//registry.addInterceptor(new  TwoInterceptor()).addPathPatterns("/one/**");
		
		super.addInterceptors(registry);
	}
	
	

}
