package com.wust.web.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.softeem.encrypt.MD5;

//工具类
public class Tools {
	//工具方法一般写成静态方法
	
	//MD5加密
	/**
	 * @param password 加密前的字符串
	 * @return 加密后的字符串
	 */
	public static String getMD5ToString(String password) {
		return new MD5().getMD5ofStr(password);
	}
	
	//获取UUID
	
	/**
	 * @return 获取UUID
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	/**
	 * @param date 需要转换的时间日期
	 * @param str 指定的格式
	 * @return 按照指定格式转出的日期字符串
	 */
	public static String dateToString(Date date,String str) {
		return new SimpleDateFormat(str).format(date); 
	}
}