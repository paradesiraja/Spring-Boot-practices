package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.controller.PayrollOperationsController;
import com.nt.models.Employee;

@SpringBootApplication
public class BootProj05LayeredApplication {

	
	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj05LayeredApplication.class, args);
		
		PayrollOperationsController controller=ctx.getBean("payroll",PayrollOperationsController.class);
		
		try{
			List<Employee> list=controller.showsEmployeeBydesg("CLERK","MANAGER","SALESMAN");
			
			list.forEach(emp->{
				System.out.println(emp);
			});
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Internally problem--Try Again"+e.getMessage());
		}
		//close the container 
		((ConfigurableApplicationContext) ctx).close();
	}

}
