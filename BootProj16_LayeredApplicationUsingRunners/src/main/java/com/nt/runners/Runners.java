package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.PayrollOperationsController;
import com.nt.models.Employee;

@Component
public class Runners implements CommandLineRunner{
	
	@Autowired
	private PayrollOperationsController controller;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Runners.run()");
		try {
		List<Employee> list=controller.showsEmployeeBydesg("CLERK", "MANAGER", "SALESMAN");
		list.forEach(emp->{
			System.out.println(emp);
		});

		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}

