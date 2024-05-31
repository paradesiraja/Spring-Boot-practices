package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Student;

@SpringBootApplication
public class BootProj11ConfigurationPropertiesYmLpropertyfileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj11ConfigurationPropertiesYmLpropertyfileApplication.class, args);
		
		Student student=ctx.getBean("stud",Student.class);
		
		System.out.println(student);
		((ConfigurableApplicationContext) ctx).close();
	}

}
