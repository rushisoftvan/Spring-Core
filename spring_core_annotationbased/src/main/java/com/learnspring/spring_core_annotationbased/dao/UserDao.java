package com.learnspring.spring_core_annotationbased.dao;

import org.springframework.stereotype.Repository;

@Repository
 public class UserDao {
  
	public UserDao() {
		System.out.println("<<<<<<UserDao :::: Constructor>>>>>>>>");
	}
	
	public boolean saveUser() {
		System.out.println("user saved in : db");
		return true;
	}
}
