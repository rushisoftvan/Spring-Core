package com.learnspring.spring_core_annotationbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnspring.spring_core_annotationbased.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("annoationbean.xml");
       UserService userService = context.getBean(UserService.class);
       //UserService userService1 = context.getBean(UserService.class);
        //System.out.println(userService.hashCode());
        System.out.print(userService.hashCode());
      // UserService bean = new UserService();
        userService.saveUser();
        
        BillProcess billProcess = context.getBean(BillProcess.class);
        billProcess.payBill(3000.00);
        
        
        
    }
}
