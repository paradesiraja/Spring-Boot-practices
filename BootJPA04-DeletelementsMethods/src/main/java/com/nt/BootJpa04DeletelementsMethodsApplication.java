package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Customer;
import com.nt.service.CustomerServiceImpl;

@SpringBootApplication
public class BootJpa04DeletelementsMethodsApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx= SpringApplication.run(BootJpa04DeletelementsMethodsApplication.class, args);
		
		CustomerServiceImpl customerImpl=ctx.getBean("custService",CustomerServiceImpl.class);
		try {
//			String result=customerImpl.customerDeleteBYId(101);
//			System.out.println(result);
			Customer customer=new Customer();
			customer.setCno(1); customer.setCname("raja");
			System.out.println(customerImpl.DeleteCustomer(customer));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
