package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepo;

@Service("custService")
public class CustomerMgmtImpl implements ICustomerService {
	
	@Autowired
	private ICustomerRepo CustomerRepo;

	@Override
	public String registerCustomer(Customer customer) {
		System.out.println("CustID(Before save)::"+customer.getCno());
		
		Customer cust =CustomerRepo.save(customer);
		
		return "Customer obj is saved with id value::"+cust.getCno();
	}

}
