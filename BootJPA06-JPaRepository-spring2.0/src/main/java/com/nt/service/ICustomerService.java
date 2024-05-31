package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;

public interface ICustomerService {

	public String deleteCustomerByIdInBatch(List<Integer> ids);
	public Customer getCustomerById(int id);
	public List<Customer> showsCustomerExampleByID(Customer exCustomer,boolean ascOrder, String...properties);
	public String groupCustomerRegistration(List<Customer>list);
}
