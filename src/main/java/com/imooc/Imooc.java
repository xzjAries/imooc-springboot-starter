package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//徐志杰
@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.imooc.mapper")
@ComponentScan(basePackages= {"com.imooc"})
public class Imooc {

	public static void main(String[] args) {
		SpringApplication.run(Imooc.class, args);
	}
	

}

