package com.imooc.service;

import java.util.List;

import com.imooc.pojo.Videos;

public interface VideoServiceCustom {
	
 List<Videos> queryVideosSimplyInfoById(String id);
}
