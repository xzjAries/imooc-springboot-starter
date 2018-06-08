package com.imooc.tasks;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
public class AsyncTask {
  @Async
  public Future<Boolean> doTask11() throws Exception{
	  long start = System.currentTimeMillis();
	  Thread.sleep(1000);
	  long end = System.currentTimeMillis();
	  
	  System.out.println("耗时任务1：" + (end - start)+"毫秒");
	  return new AsyncResult<Boolean>(true);
	  
  }
  
  @Async
  public Future<Boolean> doTask22() throws Exception{
	  long start = System.currentTimeMillis();
	  Thread.sleep(600);
	  long end = System.currentTimeMillis();
	  
	  System.out.println("耗时任务2：" + (end - start)+"毫秒");
	  return new AsyncResult<Boolean>(true);
	  
  }
  
  
  @Async
  public Future<Boolean> doTask33() throws Exception{
	  long start = System.currentTimeMillis();
	  Thread.sleep(700);
	  long end = System.currentTimeMillis();
	  
	  System.out.println("耗时任务3：" + (end - start)+"毫秒");
	  return new AsyncResult<Boolean>(true);
	  
  }
  
}
