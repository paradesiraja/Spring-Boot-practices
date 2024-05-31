package com.nt.runner;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.ICustRepository;
import com.nt.view.IResultView;
@Component
public class CustomerRunner implements CommandLineRunner{
	

	@Autowired
	private ICustRepository custRepo;
	@Override
	public void run(String... args) throws Exception {

		custRepo.getByCnameEquals("ragu").forEach(System.out::println);
		System.out.println("======================================");
		custRepo.readByCnameIs("ragu").forEach(System.out::println);
		System.out.println("======================================");
		custRepo.findByCname("ragu").forEach(System.out::println);
		System.out.println("======================================");
		
		custRepo.findByBillamtGreaterThanAndBillamtLessThan(400f,40000f).forEach(System.out::println);;
		System.out.println("======================================");
		//custRepo.findByCAddrsInOrBillAmtBetween(List.of("raja","ragu"), 200.0,50000.0);
		
		
		List<IResultView> it=custRepo.findByCaddrsIn(List.of("bang"));
		it.forEach(cust->{
			System.out.println(cust.getcname()+"......"+cust.getbillamt());
		});
		
		//dynamic scalar
		Iterable<IResultView> it1=custRepo.findByBillamtBetween(200, 50000, IResultView.class);
		it1.forEach(data->{
			System.out.println(data.getcname()+"......"+data.getbillamt());
		});
	}

}
