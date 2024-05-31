package com.nt.service;

import java.util.List;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;

public interface IPersonService{
	public String registerPersonWithDrivingLicense(Person person);
	public String registerDrivingLicenseWithPersion(DrivingLicense license);
	public List<Person> fetchAllPersons();
}
