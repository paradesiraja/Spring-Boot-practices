package com.nt.Runner;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;
@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		Employee emp1=new Employee();
		emp1.setEno(new Random().nextInt(1000));
		emp1.setEname("raghu");
		emp1.setEadd("bang"); 
		emp1.setSalary(90000.0); 
		emp1.setIsVaccinated(true);
		System.out.println(service.saveEmployee(emp1));
		
		service.showAllEmployees().forEach(System.out::println);
//		
//		try {
//			Employee emp1=new Employee();
//			emp1.setEno(102);
//			emp1.setEname("raghu"); 
//			emp1.setIsVaccinated(true);
//			
//			Employee emp2=new Employee(1006,"suresh","vizag",899999.0,true);
//			String idVal[]=service.registerEmployees(List.of(emp1,emp2));
//			System.out.println("saved does id values are ::"+Arrays.toString(idVal));
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		

		
	}

}
