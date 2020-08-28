package com.bridgelabz.transaction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.transaction.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
