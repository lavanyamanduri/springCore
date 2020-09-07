package com.bridgelabz.aop.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"after.xml");

		System.out.println("---------------------------------------");

		EmployeeService employeeService = context
				.getBean("employeeService", EmployeeService.class);

		employeeService.addEmployee();
		employeeService.addEmployee("Peter");

		employeeService.modifyEmployee();

		employeeService.deleteEmployee();

	}
	
}
