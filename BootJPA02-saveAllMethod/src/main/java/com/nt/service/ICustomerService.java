package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.entity.Customer;

public interface ICustomerService {

	
	public String GroupOfregisterCustomers(Iterable<Customer> customers);
	public Optional<Customer> getCustomerById(Integer id);
	public String updateCustomerBillAmountById(Integer Id,Float Discount);
	public String updateCustomerNewNameById(Integer Id,String Cname);
}
