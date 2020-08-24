package com.bridgelabz.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithoutXmlConfig {

	
	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationBeans.class);
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Person p =  context.getBean("person",Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getDepartment());
    }
	
}
