package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.NokiaMoblie;

@SpringBootApplication
public class BootProj03StrategyDp2Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx=SpringApplication.run(BootProj03StrategyDp2Application.class, args);){
			
			//get target class bean obj
			NokiaMoblie mobile=ctx.getBean("moblie",NokiaMoblie.class);
			
			//get b.method
			mobile.InsertedSim(9848022338f, "Raja");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
