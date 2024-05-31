package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.models.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("payroll")
public class PayrollOperationsController {

	@Autowired
	private IEmployeeMgmtService empService;
	
	public List<Employee> showsEmployeeBydesg(String desg1,String desg2,String desg3)throws Exception{
		System.out.println("PayrollOperationsController.showsEmployeeBydesg()");
		
		List<Employee> list=empService.fetchEmployeeByDesgn(desg1, desg2, desg3);
		return list;
		
	}
}
