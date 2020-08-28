package com.bridgelabz.transaction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.transaction.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer>{

}
