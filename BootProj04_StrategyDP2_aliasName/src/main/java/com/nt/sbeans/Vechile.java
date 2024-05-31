package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vechile")
public class Vechile {

	@Autowired
	@Qualifier("motor")
	private Engine engine;
	
	//b.method
	public void move(String sourcePlace,String destPlace) {
		engine.start();
		System.out.println("jouney start from::"+sourcePlace);
		System.out.println("jouney is going on......");
		engine.end();
		System.out.println("jouney end from::"+destPlace);
	}
}
