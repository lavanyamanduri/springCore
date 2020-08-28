package com.bridgelabz.transaction.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.transaction.model.Address;
import com.bridgelabz.transaction.model.Employee;
import com.bridgelabz.transaction.service.AddressService;
import com.bridgelabz.transaction.service.EmployeeService;

@RestController
@RequestMapping("/")
public class Controller {

	@Autowired
	private EmployeeService empSer;
	
	@Autowired
	private AddressService addSer;
	
	@Autowired
	private Address add;
	
	@Autowired
	private Employee emp;

	
	
	@Transactional(dontRollbackOn  = NumberFormatException.class)
	@RequestMapping("/setData")
	public String setData(){
		add.setDetails("Vizag");
		add.setId(2);		
		add.setPost(1002);
		
		emp.setId(2);
		emp.setName("Teja");
		emp.setAddress(add);
		
		addSer.saveAddress(add);

//		int a=0;
//		if(a==0) {
//			throw new NumberFormatException();
//		}
		empSer.saveEmployee(emp);
		
		return "Data Inserted";
	}
}
