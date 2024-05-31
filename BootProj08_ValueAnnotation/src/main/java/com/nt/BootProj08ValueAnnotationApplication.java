package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class BootProj08ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj08ValueAnnotationApplication.class, args);
		
		Hotel hotel=ctx.getBean("hotel",Hotel.class);
		
		System.out.println(hotel+" ");
		System.out.println(hotel.CalculateAmount(100));
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
