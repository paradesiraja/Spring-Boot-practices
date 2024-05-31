package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.entity.Customer;

public interface ICustomerService {

	
	public String registerCustomer(Customer cust);
}
