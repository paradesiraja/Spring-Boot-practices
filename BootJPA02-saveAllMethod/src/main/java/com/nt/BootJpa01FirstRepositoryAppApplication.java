package com.nt;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Customer;
import com.nt.service.CustomerMgmtImpl;



@SpringBootApplication
public class BootJpa01FirstRepositoryAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootJpa01FirstRepositoryAppApplication.class, args);
		
		CustomerMgmtImpl service=ctx.getBean("custService",CustomerMgmtImpl.class);
		

		Customer cust=new Customer();
		cust.setCName("ragu");		cust.setCAddrs("bang");		cust.setBillAmt(1000.0f);
		Customer cust1=new Customer();
		cust1.setCName("ragu");		cust1.setCAddrs("bang");		cust1.setBillAmt(1000.0f);
		Customer cust2=new Customer();
		cust2.setCName("ragu");		cust2.setCAddrs("bang");		cust2.setBillAmt(1000.0f);
		
		//String result=service.GroupOfregisterCustomers(List.of(cust,cust1,cust2));
		/*Optional<Customer> result=service.getCustomerById(1);
		if(result.isPresent()) {
			System.out.println(result.get());
			
		}
		else {
			System.out.println("customer not found");
		}
		*/
		try {
			//System.out.println(service.updateCustomerBillAmountById(1, 10f));
			System.out.println(service.updateCustomerNewNameById(2, "ranga"));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
