package com.nt.controller;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationsController {
	
	@Autowired
	private IEmployeeMgmtService service;
	
	@GetMapping("/")
	public String ShowHome() {
		return "welcome";
		
	}
	@GetMapping("/emp_report")
	public String ShowEmployeereport(Map<String,Object>map) {
		//use service
		List<Employee> itInfo=service.getAllEmployees();
		map.put("empInfo", itInfo);
		//return LVN
		return "show_employee_report";
		
	}
	@GetMapping("/emp_add")
	public String showFormSaveEmployee(@ModelAttribute("emp")Employee emp) {
		
		//return LVN
		return "register_employee";
		
	}
	@PostMapping("/emp_add")
	public String SaveEmployeeEditDetails(Map<String,Object>map,@ModelAttribute("emp")Employee emp) {
		//use service
		String msg=service.registerEmployee(emp);
		
		map.put("resultMsg", msg);
		//return LVN
		return "redirect:emp_report";

}
}
