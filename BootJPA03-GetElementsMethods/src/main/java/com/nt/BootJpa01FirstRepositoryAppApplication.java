package com.nt;

import java.util.Iterator;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Customer;
import com.nt.service.CustomerMgmtImpl;

@SpringBootApplication
public class BootJpa01FirstRepositoryAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootJpa01FirstRepositoryAppApplication.class, args);

		CustomerMgmtImpl customerService = ctx.getBean("custService", CustomerMgmtImpl.class);

		/*Customer cust=new Customer();
		cust.setCName("ragu");
		cust.setCAddrs("bang");
		cust.setBillAmt(1000.0f);*/

		/*Customer service=customerService.showCustomerById(101);
		System.out.println(service);*/
		/*try {
		
		System.out.println("count of records::"+customerService.fetchCustomerCount());
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			
			System.out.println("201 id customer exists::"+customerService.CheckContainerAvailibilty(201));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Iterable<Customer> shows=customerService.showAllCustomers();
			shows.forEach(cust->{
				System.out.println(cust);
				
				
			});
				
		for (Customer customer : shows) {
			System.out.println(customer);
		}
		
			//shows.forEach(cust->{ System.out.println(cust);});
		//			shows.forEach(cust->System.out.println(cust));
		//			shows.forEach(System.out::println);
			Iterator<Customer> it=shows.iterator();
			while(it.hasNext()) {
			System.out.println(it.next());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		try {
			/*Iterable<Customer> cust=customerService.showAllCustomersById(List.of(1,2,52,102,101,222));
				
			cust.forEach(System.out::println);*/
			
			customerService.showAllCustomersById(List.of(1,2,52,102,101,222)).forEach(System.out::println);
		}

		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
