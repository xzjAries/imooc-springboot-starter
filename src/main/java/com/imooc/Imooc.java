package com.imooc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

//徐志杰
@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.imooc.mapper")
@ComponentScan(basePackages= {"com.imooc","org.n3r.idworker"})
public class Imooc { 

	public static void main(String[] args) {
		SpringApplication.run(Imooc.class, args);
	}
	

}

