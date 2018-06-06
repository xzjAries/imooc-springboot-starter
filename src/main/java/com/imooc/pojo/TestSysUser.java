package com.imooc.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class TestSysUser {
	private String name;
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a",locale="zh",timezone="GMT+8")        
	private Date birthday;
	@JsonInclude(Include.NON_NULL)
	private String desc;
	private Integer age;
	@JsonIgnore
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) { 
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
