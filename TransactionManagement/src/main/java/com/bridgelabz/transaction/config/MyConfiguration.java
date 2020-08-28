package com.bridgelabz.transaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bridgelabz.transaction.model.Address;
import com.bridgelabz.transaction.model.Employee;

@Configuration
public class MyConfiguration {

	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
}