package com.wust.web.service.impl;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.wust.web.mapper.UserMapper;
import com.wust.web.pojo.User;
import com.wust.web.service.UserService;
import com.wust.web.util.Tools;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	UserMapper userMapper;
	
	//用户登录
	public Map<String, Object> login(String username, String password, HttpSession session){
		Map<String, Object> map = new HashMap<String, Object>();
		User user = userMapper.selectByUsername(username);
		if(user != null && user.getPassword().equals(Tools.getMD5ToString(password))) {
			map.put("status", 0);
			map.put("msg", "登录成功");
			map.put("data", user);
		} else if(user == null) {
			map.put("status", 1);
			map.put("msg", "用户名不存在");
			map.put("data", null);
		} else {
			map.put("status", 2);
			map.put("msg", "密码错误");
			map.put("data", null);
		}
		return map;
	}

}
