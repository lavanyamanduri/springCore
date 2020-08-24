package com.bridgelabz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new
    			 ClassPathXmlApplicationContext("Beans.xml");
//    			        Student student = (Student) context.getBean("student");
//    			        System.out.println("Name : " + student.getName() );
//    			        System.out.println("Age : " + student.getAge() );
//    			        System.out.println("Branch : " + student.getBranch() );
    			        
    			        Profile profile = (Profile) context.getBean("profile");
    			          profile.printBranch();
    			          profile.printAge();
    			          profile.printName();
    			    

    }
}
