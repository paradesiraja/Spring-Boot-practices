package com.nt.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Employee;

@Controller
public class ShowDataRendering {

//	@GetMapping("/report")
//	public String ShowData(Map<String,Object>map) {
//		map.put("favColors", new String[] {"red","blue","yellow"});
//		map.put("nickNames", List.of("raja","raj","yuvaraj"));
//		map.put("phoneNumbers", Set.of(898988989,787878878));
//		map.put("idDetails", Map.of("aadhar",8888889,"voterId",8988989));
//		
//		return "show_report";
//		
//	}
	
	//Passing Model Class obj
//	@GetMapping("/report")
//	public String ShowData(Map<String,Object>map) {
//		Employee emp=new Employee();
//		emp.setEno(101);emp.setEname("raja");emp.setSalary(45000.0); emp.setIsVaccinated(true);
//		map.put("empInfo", emp);
//		return "show_report";
//		
//	}
	
	@GetMapping("/report")
	public String ShowData(Map<String,Object>map) {
		List<Employee> emp=List.of(new Employee(101,"raja",45000.0,true),new Employee(102,"raghu",45000.0,true),new Employee(103,"radha",45000.0,true));
		map.put("empInfo", emp);
		
		return "show_report";
		
	}
}
