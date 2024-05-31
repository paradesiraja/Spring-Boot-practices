package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.PayrollOperationsController;
import com.nt.models.Employee;

@SpringBootApplication
public class BootProj05LayeredApplication {

//@Autowired
//private Environment env;
//	@Bean(name = "c3poDS")
//	@Profile("uat")
//	public ComboPooledDataSource createc3p0DS() throws Exception {
//		
//		ComboPooledDataSource cds=new ComboPooledDataSource();
//		cds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
//		cds.setJdbcUrl(env.getProperty("spring.datasource.url"));
//		cds.setUser(env.getProperty("spring.datasource.username"));
//		cds.setPassword(env.getProperty("spring.dataSource.password"));
////		cds.setMinPoolSize(Integer.parseInt(env.getProperty("spring.datasource.dbcp2.intial.size")));
////		cds.setMinPoolSize(Integer.parseInt(env.getProperty("spring.datasource.dbcp2.max.total")));
//		
//		return cds;
//		
//	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj05LayeredApplication.class, args);
//		SpringApplication sp=new SpringApplication(BootProj05LayeredApplication.class);
//		sp.setAdditionalProfiles("dev");
//		ApplicationContext ctx=sp.run(args);
		
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
