package com.imooc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import tk.mybatis.spring.annotation.MapperScan;

//徐志杰01--------fsd
@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.imooc.mapper")
@ComponentScan(basePackages= {"com.imooc","org.n3r.idworker"})

//定时任务开关
@EnableScheduling

//开启异步调用方法
@EnableAsync
public class Imooc { 

	public static void main(String[] args) {
		SpringApplication.run(Imooc.class, args);
	}
	

}

