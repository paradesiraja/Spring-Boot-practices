package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.CustomerMgmtImpl;
import com.nt.service.ICustomerService;

@Component
public class CustomerController implements CommandLineRunner{

	@Autowired
	private ICustomerService customerService;
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("CustomerController.run()");
		
		Customer cust=new Customer();
		cust.setCName("ragu");
		cust.setCAddrs("bang");
		cust.setBillAmt(1000.0f);
		
		String service=customerService.registerCustomer(cust);
	System.out.println(service);
	}

}
