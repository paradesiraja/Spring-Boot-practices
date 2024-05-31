package com.nt.runner;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.service.IPersonService;
@Component
public class OTORunner implements CommandLineRunner {

	@Autowired
	private IPersonService service;
	@Override
	public void run(String... args) throws Exception {
		
//		try {
//			Person person=new Person(new Random().nextInt(1000),"ravi","hyd");
//			DrivingLicense dl=new DrivingLicense(555L,"4-wheeler",LocalDate.now());
//			person.setLicense(dl);
//			System.out.println(service.registerPersonWithDrivingLicense(person));
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		service.fetchAllPersons().forEach(per->{
//			System.out.println("parent::"+per);
//			DrivingLicense license=per.getLicense();
//			System.out.println("Child::"+license);
//		});
		
		try {
			Person person=new Person(new Random().nextInt(1000),"shiva","bang");
			DrivingLicense dl=new DrivingLicense(new Random().nextLong(1000),"4-wheeler",LocalDate.now());
			dl.setPersonDetails(person);
			System.out.println(service.registerDrivingLicenseWithPersion(dl));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
