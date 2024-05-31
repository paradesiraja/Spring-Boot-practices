package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPersionManagmentService;
@Component
public class OTMRunner implements CommandLineRunner {

	@Autowired
	private IPersionManagmentService service;
	@Override
	public void run(String... args) throws Exception {
		//service.SaveDataUsingParent();
		//service.SaveDataUsingChild();
		service.loadDataUsingParent();
		
	}

}
