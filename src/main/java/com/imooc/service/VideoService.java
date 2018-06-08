package com.imooc.service;


import java.util.List;

import com.imooc.pojo.Videos;


public interface VideoService {
	
  public void saveVideo(Videos videos) throws Exception;
  public void deleteVideo(Videos videos);
  public void updateVideo(Videos videos);
  public Videos queryVideoById(String id);
  public List<Videos> queryVideoList(Videos videos);
  public List<Videos> queryvideoListPaged(Videos videos,Integer pageIndex,Integer pageSize);
  public Videos queryUserByIdCustom(String userId,String audioId);
}
