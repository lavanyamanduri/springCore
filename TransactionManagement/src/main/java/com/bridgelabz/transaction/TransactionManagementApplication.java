package com.bridgelabz.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.bridgelabz.transaction.config","com.bridgelabz.transaction.service","com.bridgelabz.transaction.controller"})
//@EntityScan("com.bridgelabz.transaction.model")
//@EnableJpaRepositories("com.bridgelabz.transaction.repository")
public class TransactionManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionManagementApplication.class, args);
	}

}
