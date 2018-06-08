package com.imooc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.pojo.Videos;

public interface VideosMapperCustom{
	List<Videos> queryVideosSimplyInfoById(@Param("userId")String userId,@Param("audioId")String audioId);
  //List<Videos> queryVideosSimplyInfoById(String userId,String audioId);
}