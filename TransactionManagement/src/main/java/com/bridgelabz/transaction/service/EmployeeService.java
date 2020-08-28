package com.bridgelabz.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.transaction.model.Employee;
import com.bridgelabz.transaction.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	public void saveEmployee(Employee emp) {
		empRepo.save(emp);
	}
	
}

