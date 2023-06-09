package com.learnspring.spring_core_annotationbased.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.learnspring.spring_core_annotationbased.dao.UserDao;

@Component
//@Scope("prototype")
public class UserService {
	
	/*
	 * 
	 * field level injection
	 * when we work on project we have to avoid the field level injection
	 * 
	 * 
	 */
	//@Autowired
	private UserDao userDao;
	
	/*
	 * If which cobject we have to inject it is mandatory use the constructor injection
	 * we should use constructor injection  
	 * 
	 */
    
	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
		System.out.println("<<<UserService :: Constructor>>>");
	}
	
	public void  saveUser() {
	    userDao.saveUser();	
	}
	
}
