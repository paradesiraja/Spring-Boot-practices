package com.nt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service("seasonService")
public class SeasonFinderImpl implements SeasonFinderServer {

	@Override
	public String findSeason() {
		//get system date
		LocalDate ld=LocalDate.now();
		
		//get month
		int month=ld.getMonthValue();
		//find season
		if(month>=3 && month<=6) 
			return "Summer season";
		else if(month>=7 && month<=10) 
			return "Rainy season";
		else 
			return "Winter season";
		
	}

}
