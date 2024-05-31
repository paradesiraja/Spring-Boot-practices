package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.entity.Customer;

public interface ICustomerService {

	
		//public String registerCustomer(Customer cust);
	//	public Customer showCustomerById(Integer id);
	//	public long fetchCustomerCount();
		
	//public boolean CheckContainerAvailibilty(Integer id);
//	public Iterable<Customer> showAllCustomers();
	public Iterable<Customer> showAllCustomersById(Iterable<Integer>ids);
}
