package com.ahad.util;

import com.ahad.dao.UserDao;
import com.ahad.dao.UserDaoImpl;
import com.ahad.service.UserService;
import com.ahad.service.UserServiceImpl;

public class ServiceProvider {
	private static UserDao userDao;
	private static UserService userService;
	public static UserDao getUserDao() {
		System.out.println("get user dao");
		if(userDao==null) {
			userDao = new UserDaoImpl();
		}
		return userDao;
	}
	public static UserService getUserService() {
		System.out.println("GET user service");
		if(userService == null) {
			userService = new UserServiceImpl();
		}
		return userService;
	}

}
