package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("eEngg")
@Lazy
public class ElectricEngine implements Engine {

	public ElectricEngine() {
	
		System.out.println("ElectricEngine.ElectricEngine()");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

	
}
