package com.di.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
//		Student s=new Student();
//		s.setName("sai");
	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
	Student stss=context.getBean("s",Student.class);
		
	stss.display();
	}
	
}

