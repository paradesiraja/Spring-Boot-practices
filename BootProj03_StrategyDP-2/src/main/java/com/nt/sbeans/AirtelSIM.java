package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("aSIM")
public class AirtelSIM implements MobileSIM {

	public AirtelSIM() {
		System.out.println("AirtelSIM.AirtelSIM()");
	}
	
	@Override
	public void call() {
		System.out.println("AirtelSIM.call()");
		
	}

	@Override
	public void message() {
		System.out.println("AirtelSIM.message()");
		
	}

}
