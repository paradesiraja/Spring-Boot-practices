package com.nt.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Document.StockDetails;
import com.nt.Service.IStockMgmtService;
@Component
public class StockDetailsRunner implements CommandLineRunner {

	@Autowired
	private IStockMgmtService service;
	@Override
	public void run(String... args) throws Exception {
//		StockDetails details=new StockDetails(new Random().nextInt(1000),"ICICI",99999.9,"BSE");
//		System.out.println(service.registerStcakDetails(details));
		
//		StockDetails details1=new StockDetails(new Random().nextInt(),"ICICI",88888.9,"BSE");
//		StockDetails details2=new StockDetails(new Random().nextInt(),"ICICI",77777.9,"BSE");
//		StockDetails details3=new StockDetails(new Random().nextInt(),"ICICI",666666.9,"BSE");
//		System.out.println(service.registerAllStcakDetails(List.of(details1,details2,details3)));
		
		//service.fetchstackDetailsByPriceRange(200.0,200000.0).forEach(System.out::println);
		//System.out.println(service.fetchAndUpdateStockDetailsById(993, 11111.1, "NSE"));
		System.out.println(service.fetchAndUpdateStockDetailsByPriceRange(1000.0, 5000000.0, "NNSE"));
	}

}
