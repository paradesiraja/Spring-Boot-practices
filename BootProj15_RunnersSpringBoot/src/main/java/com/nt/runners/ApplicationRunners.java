package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component

public class ApplicationRunners implements ApplicationRunner,Ordered{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("non-options args values::"+args.getNonOptionArgs());
		
		System.out.println("option args names and values::");
		
		for(String name: args.getOptionNames()) {
			System.out.println("names+------>"+args.getOptionValues(name));
			
		}
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 10;
	}

}
