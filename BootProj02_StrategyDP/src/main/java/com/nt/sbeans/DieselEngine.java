package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dEngg")
@Lazy
public class DieselEngine implements Engine {

	public DieselEngine() {
	
		System.out.println("DieselEngine.DieselEngine()");
	}
	@Override
	public void start() {
	System.out.println("DieselEngine.start()");
		
	}

	@Override
	public void end() {
		System.out.println("DieselEngine.end()");
		
	}

	
}
