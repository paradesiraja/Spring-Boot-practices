package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.repository.IDrivingLicense;
import com.nt.repository.IPeronRepo;



@Service("perService")
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IDrivingLicense driRepo;
	@Autowired
	private IPeronRepo perRepo;
	
	@Override
	public String registerPersonWithDrivingLicense(Person person) {
		
		return "person with drivinglicense is saved with id value::"+perRepo.insert(person);
	}

	@Override
	public List<Person> fetchAllPersons() {
		
		return perRepo.findAll();
	}

	@Override
	public String registerDrivingLicenseWithPersion(DrivingLicense license) {
		
		return "DrivingLicense with Person is saved with id value::"+driRepo.save(license);
	}

}
