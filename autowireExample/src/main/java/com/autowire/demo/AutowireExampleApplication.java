package com.autowire.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowireExampleApplication {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	
	       Car obj = (Car)context.getBean("car");
	       obj.drive();
	       
//	       Bike t=(Bike)context.getBean("vehicle");
//	       t.drive();
	}
	
		

}
