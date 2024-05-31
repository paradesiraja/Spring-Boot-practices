package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vechile;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj02StrategyDpApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx=
				SpringApplication.run(BootProj02StrategyDpApplication.class, args);){
		//get target class bean obj
		Vechile vechile=ctx.getBean("vechile",Vechile.class);
		//get b.method 
		 vechile.move("Hyderbad","Bangalore");
		
		 
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
