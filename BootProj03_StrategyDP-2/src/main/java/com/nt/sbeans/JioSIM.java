package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("jSIM")
public class JioSIM implements MobileSIM {

	public JioSIM() {
		System.out.println("JioSIM.JioSIM()");
	}
	
	@Override
	public void call() {
		System.out.println("JioSIM.call()");
		
	}

	@Override
	public void message() {
		System.out.println("JioSIM.message()");
		
	}

}
