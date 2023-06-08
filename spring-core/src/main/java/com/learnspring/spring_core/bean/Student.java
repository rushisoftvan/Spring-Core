package com.learnspring.spring_core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




public class Student {
    
	
	private String firstName;
	
	
	private Integer age;
	
	public Student() {
		System.out.println("<<<<<student read>>>>");
	}

	public String getFirstName() {
		return firstName;
	}
    
	@Value("abhi")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}
    
	@Value("23")
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", age=" + age + "]";
	}
	
	
}
