package com.nt.repo.Runner;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Promotions.Offers;
import com.nt.model.prod.Product;
import com.nt.repo.prod.IProductRepo;
import com.nt.repo.promotions.IOfferRepo;
@Component
public class MultipleDataSourcesRunner implements CommandLineRunner {

	@Autowired
	private IProductRepo proRepo;
	@Autowired
	private IOfferRepo offerRepo;
	@Override
	public void run(String... args) throws Exception {
		//save objects
		proRepo.saveAll(Arrays.asList(new Product("table",100.0,6000.0),
				                      new Product("chair",1000.0,8000.0 )));
		System.out.println("products are saved");
		
		offerRepo.saveAll(Arrays.asList(new Offers("Buy-1-get-1","but-1",100.0,LocalDateTime.of(2024,12,12,12,12,2)),
				new Offers("Buy-1-get-2","but-2",200.0,LocalDateTime.of(2025,12,12,12,12,2))));
		System.out.println("offers are saved");
	}

}
