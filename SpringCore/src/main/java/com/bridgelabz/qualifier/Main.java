package com.bridgelabz.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	 public static void main(String[] args) {
	      AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext();

	      // Scan beans
	      context.scan("com.bridgelabz.qualifier");
	    
	      context.refresh();

	      VehicleService vehicle = context.getBean(VehicleService.class);
	      vehicle.service();

	      context.close();
	   }
}
