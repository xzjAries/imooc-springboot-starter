package com.imooc.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTasks {
	private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

	// 定义每过3秒执行任务
	//@Scheduled(fixedRate = 3000)
	//@Scheduled(cron = "1/2 * * * * ?")
	public void reportCurrentTime() {
         System.out.println("现在时间："+dataFormat.format(new Date()));
	}
}
