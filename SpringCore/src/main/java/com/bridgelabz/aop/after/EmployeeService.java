package com.bridgelabz.aop.after;

public class EmployeeService {

//	public void addEmployee()
//	{
//		System.out.println("Add Employee ");
//	}
	
	public String addEmployee()
	{
		System.out.println("Add Employee");
		String name = "SDFGH";
//		String name = null;
		name.toLowerCase();
		return "Employee Peter information is added successfully";
	}
	
	public String addEmployee(String name)
	{
		System.out
				.println("addEmployee(String name) method is called");
		return "Employee Peter information is added successfully";
	}
	
	public void modifyEmployee()
	{
		System.out.println("Modify Employee");
	}
	
	public void deleteEmployee()
	{
		System.out.println("Delete Employee");
	}
	
	
}
