package com.bridgelabz.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.transaction.model.Address;
import com.bridgelabz.transaction.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepo;
	
	public void saveAddress(Address add) {
		addressRepo.save(add);
	}
}
