package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.Model.Student;

@Controller
public class StrudentOperationsController {
//
//	@GetMapping("/page")
//	public String process(@RequestParam("sno")int no,@RequestParam("sname") String name) {
//		System.out.println(no+".........."+name);
//		return "show_result";
//		
//	}
//	@GetMapping("/page")
//	public String process(@RequestParam int sno,@RequestParam(required = false) String sname) {
//		System.out.println(sno+".........."+sname);
//		return "show_result";
//	}
	@GetMapping("/page")
	public String process(@RequestParam int sno,@RequestParam(defaultValue = "rrr")String sname) {
		System.out.println(sno+".........."+sname);
		return "show_result";
	}
}
