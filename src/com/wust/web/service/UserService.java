package com.wust.web.service;

import java.util.Map;

import javax.servlet.http.HttpSession;


public interface UserService {
	
	//用户登录
	public Map<String, Object> login(String username, String password, HttpSession session);
}
