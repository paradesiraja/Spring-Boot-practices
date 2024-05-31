package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Service.ICustomerManagementService;
@Component
public class CustomerRunner implements CommandLineRunner{

	@Autowired
	private ICustomerManagementService service;
	@Override
	public void run(String... args) throws Exception {
	
		service.showCustomerByBillamtRange(1000.0, 100000.0).forEach(System.out::println);
		
	}

}
