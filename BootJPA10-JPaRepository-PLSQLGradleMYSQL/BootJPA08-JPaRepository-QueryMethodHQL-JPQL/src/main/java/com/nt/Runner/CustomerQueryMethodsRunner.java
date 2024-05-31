package com.nt.Runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Repository.CustomerRepository;
import com.nt.entity.Customer;
@Component
public class CustomerQueryMethodsRunner implements CommandLineRunner {
	@Autowired
	private CustomerRepository custRepo;

	@Override
	public void run(String... args) throws Exception {
		
		//custRepo.showsCustomerBillamtRange(200.0, 40000.0).forEach(System.out::println);
		//custRepo.searchCustomerByCaddrs("hyd", "bang").forEach(System.out::println);
	
		custRepo.searchCustomerDataByBillamtRange(5000.0, 10000000.0).forEach(cust->
		System.out.println(Arrays.toString(cust)));


		custRepo.searchCustomerDataByBillamt(50000.0, 1000000.0).forEach(System.out::println);
		
		//aggregate operation
		int count=custRepo.fetchCustomerNamesCount();
		System.out.println(count);
		
		Object[] aggregate=(Object[]) custRepo.fetchAgrregateData();
		System.out.println("count all::"+aggregate[0]);
		System.out.println("MAx billamt::"+aggregate[1]);
		System.out.println("Min billamt::"+aggregate[2]);
		System.out.println("Avg billamt::"+aggregate[3]);
		System.out.println("Sum billamt::"+aggregate[4]);
		
		
		//Non-select operation
		int count1=custRepo.HikeCustomerBillamtByAddrs(10.0,"hyd", "bang");
		System.out.println(count1);
		
		int count2=custRepo.removecustomerByBillamtRange(50000.0, 10000000.0);
		System.out.println(count2);
	}

}
