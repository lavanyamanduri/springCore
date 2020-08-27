package com.bridgelabz.transaction.jdbc.service;

import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.transaction.jdbc.dao.CustomerDAO;
import com.bridgelabz.transaction.jdbc.model.Customer;

public class CustomerManagerImpl implements CustomerManager {

	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	@Transactional
	public void createCustomer(Customer cust) {
		customerDAO.create(cust);
	}

}
