package com.learnspring.spring_core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.learnspring.spring_core.bean.Student;

/**
 * Hello world!
 *  Spring provide the default scope is singletone
 */
public class App 
{ 
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
        // Bean Factory It is the old
      //BeanFactory classPathXmlApplicationContext = new  ClassPathXmlApplicationContext("beans.xml");           
        
        //Student student = (Student) classPathXmlApplicationContext.getBean("student");
        
        ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
        Student bean = context.getBean(Student.class);
        
        System.out.println(bean);
        
             Student bean2 = context.getBean(Student.class);
        System.out.print(bean2);
          
    }
}
