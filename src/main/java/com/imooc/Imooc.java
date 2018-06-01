package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//徐志杰
@SpringBootApplication
@ComponentScan(basePackages= {"com.imooc"})
public class Imooc {

	public static void main(String[] args) {
		SpringApplication.run(Imooc.class, args);
	}
	

}

