package com.learnspring.spring_core.configrationfilebased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
         
	  /*
	   * there is we have created to same bean so we have to say to spring like which bean you need by otherwise it will give the error 
	   * No qualifying bean of type 'com.learnspring.spring_core.configrationfilebased.Employee' available: expected single matching bean but found 2: st,st1
	   */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*Employee bean = context.getBean("st",Employee.class);
		System.out.println(bean);
		System.out.println(bean.hashCode());
		Employee bean1 = context.getBean("st1",Employee.class);
		System.out.println(bean1);
		System.out.println(bean1.hashCode());
		*/
		
	    /*
	     * when we set the scope prototype what will happen let,s see
	     * 
	     * if we change the scope of our bean then spring it will give the clone object of our object
	     * there bean1 have hascode value = 1528195520   
	     * there second bean have hascode value = 2028265136
	     * 
	     * that means 
	     */
		
		Employee bean1 = context.getBean(Employee.class);
		System.out.println(bean1);
		context.getBean(Employee.class);
		
		System.out.println(bean1.hashCode());
		
		Employee secondbean = context.getBean(Employee.class);
		context.getBean(Employee.class);
		System.out.println(secondbean.hashCode());
	}
}
