package com.nt.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;

@Service("custService")
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerRepository custRepo;
	
	@Override
	public String customerDeleteBYId(Integer id) {
		Optional<Customer> opt=custRepo.findById(id);
		if(opt.isPresent()) {
			custRepo.deleteById(id);
			return id +"customer is deleted";
		}
		else {
			return id +"customer not found for deleted";
		}
	}

	@Override
	public String DeleteCustomer(Customer customer) {
		Optional<Customer> opt=custRepo.findById(customer.getCno());
		if(opt.isEmpty()) {
			return customer.getCno()+"customer is not available";
		}
		else {
			custRepo.delete(opt.get());
			return customer.getCno()+"customer is deleted";
		}
		
	}


	
	

}
