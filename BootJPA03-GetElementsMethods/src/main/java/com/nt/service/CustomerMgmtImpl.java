package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepo;

@Service("custService")
public class CustomerMgmtImpl implements ICustomerService {
	
	@Autowired
	private ICustomerRepo CustomerRepo;

	@Override
	public Iterable<Customer> showAllCustomersById(Iterable<Integer> ids) {
		
		Iterable<Customer> cust=CustomerRepo.findAllById(ids);
		return cust;
	}

	
	
	
	
	  public String registerCustomer(Customer customer) {
	  System.out.println("CustID(Before save)::"+customer.getCno());
	  
	  Customer cust =CustomerRepo.save(customer);
	  
	  return "Customer obj is saved with id value::"+cust.getCno();
	  }
	 


	public Customer showCustomerById(Integer id) {
		Customer cust=CustomerRepo.findById(id).orElseThrow();
		return cust;
	}
	
	/*@Override
	public Customer showCustomerById(Integer id) {
		Optional<Customer> opt=CustomerRepo.findById(id);
		if(opt.isPresent()) 
			return opt.get();
		else
			throw new IllegalArgumentException("invalid customer id");
		}  */
	
	
	
	
	public long fetchCustomerCount() {
		long cust=CustomerRepo.count();
		return cust;
	}




	public boolean CheckContainerAvailibilty(Integer id) {
	
		boolean cust=CustomerRepo.existsById(id);
		return cust;
	}
	
	public Iterable<Customer> showAllCustomers() {
		Iterable<Customer> cust=CustomerRepo.findAll();
		return cust;
	}
	

	}
	
	
	


