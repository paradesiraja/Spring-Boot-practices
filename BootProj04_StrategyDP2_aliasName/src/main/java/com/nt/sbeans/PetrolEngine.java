package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pEngg")
@Lazy
public class PetrolEngine implements Engine {

	public PetrolEngine() {
	System.out.println("PetrolEngine.PetrolEngine()");
	}
	@Override
	public void start() {
	System.out.println("PetrolEngine.start()");
		
	}

	@Override
	public void end() {
	System.out.println("PetrolEngine.end()");
		
	}

	
}
