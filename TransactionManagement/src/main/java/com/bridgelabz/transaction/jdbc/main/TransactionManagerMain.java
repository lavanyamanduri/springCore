package com.bridgelabz.transaction.jdbc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.transaction.jdbc.model.Address;
import com.bridgelabz.transaction.jdbc.model.Customer;
import com.bridgelabz.transaction.jdbc.service.CustomerManager;
import com.bridgelabz.transaction.jdbc.service.CustomerManagerImpl;

public class TransactionManagerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
System.out.println("-------------");
		CustomerManager customerManager = ctx.getBean("customerManager",
				CustomerManagerImpl.class);
		System.out.println("qqqqqqqqqqqqqqq");
		Customer cust = createDummyCustomer();
		customerManager.createCustomer(cust);

		ctx.close();
	}

	private static Customer createDummyCustomer() {
		Customer customer = new Customer();
		customer.setId(2);
		customer.setName("Pankaj");
		Address address = new Address();
		address.setId(2);
		address.setCountry("India");
		// setting value more than 20 chars, so that SQLException occurs
		address.setAddress("Albany Dr, San Jose, CA 95129");
		customer.setAddress(address);
		return customer;
	}

}
