package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("moblie")
public class NokiaMoblie {

	@Autowired
	@Qualifier("jSIM")
	private MobileSIM sim;
	
	public void InsertedSim(float number,String name) {
		
		sim.call();
		System.out.println("calling to sim::"+number+" "+name);
		
		sim.message();
		System.out.println("message to sim::"+number+" "+name);
	}
}
