package com.nt.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, String> {

	public List<Employee>findBySalaryBetween(double start,double end);
}
