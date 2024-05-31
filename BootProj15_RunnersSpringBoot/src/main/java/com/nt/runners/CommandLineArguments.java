package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order()
public class CommandLineArguments implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineArguments.run()"+Arrays.toString(args));
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 5;
	}

}
