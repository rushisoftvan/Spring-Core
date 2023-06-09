package com.learnspring.spring_core_annotationbased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnspring.spring_core_annotationbased.beans.Demo;

@Configuration
public class AppConfig {
    
	
	/*
	 * we can use this annotation for when we have no source code of class how we can tell to spring to create 
	 * obejct and manage it like restTemplate , for swagger configratuion.
	 * when   we have to do the swagger configration we can use @ bean to give the docket object to  
	 */
	@Bean
	public Demo getBean() {
		
		return  new Demo();
	}
	 
}
