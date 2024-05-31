package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.PatientController;
import com.nt.models.Patient;

@SpringBootApplication
public class BootProj06LayeredApplication2Application {

	public static void main(String[] args)  {
		ApplicationContext ctx=SpringApplication.run(BootProj06LayeredApplication2Application.class, args);
		
		PatientController controll=ctx.getBean("corona",PatientController.class);
		
		try{
			List<Patient> list=controll.takeAllDetailsByPcity("HYD","BANG","CHENNAI");
		
		
		list.forEach(pnt->{
			System.out.println(pnt);
		});
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Internally--Problem----Try Again"+e.getMessage());
		}
	}

}
