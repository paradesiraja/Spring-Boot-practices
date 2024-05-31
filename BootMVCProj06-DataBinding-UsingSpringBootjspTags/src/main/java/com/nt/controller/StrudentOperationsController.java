package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.Model.Student;

@Controller
public class StrudentOperationsController {

	@GetMapping("/")
	public String ShowHomePage() {
		return "welcome";
		
	}
	@GetMapping("/register")
	public String registerPage(@ModelAttribute("stud") Student st) {
		
		return "Student_register";
		
	}
	@PostMapping("/register")
	public String ShowPage(Map<String,Object>map,@ModelAttribute("stud") Student st ){
		System.out.println("Student::"+st);
		map.put("studentInfo", st);
		return "Show_result";
		
	}
}
