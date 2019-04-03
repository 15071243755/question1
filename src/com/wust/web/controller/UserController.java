package com.wust.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wust.web.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(String username, String password, HttpSession session){
		Map<String,Object> map = new HashMap<String, Object>();
		map = userService.login(username, password, session);
		return map;
	}
}
