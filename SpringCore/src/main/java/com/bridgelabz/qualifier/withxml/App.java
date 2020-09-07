package com.bridgelabz.qualifier.withxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new
    			 ClassPathXmlApplicationContext("qualifier.xml");
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
