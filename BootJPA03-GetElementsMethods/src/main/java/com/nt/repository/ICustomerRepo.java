package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Customer;

public interface ICustomerRepo extends CrudRepository<Customer,Integer> {

	
}
