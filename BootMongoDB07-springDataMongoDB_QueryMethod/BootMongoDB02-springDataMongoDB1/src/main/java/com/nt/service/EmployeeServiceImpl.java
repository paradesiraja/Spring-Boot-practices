package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.nt.Repository.IEmployeeRepo;
import com.nt.document.Employee;
@Component("empService")
public class EmployeeServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepo empRepo;
	@Override
	public String saveEmployee(Employee e) {
		
		return "MangoDb Doc is saved with id value::"+empRepo.save(e).getEno();
	}
    @Override
	public List<Employee> showAllEmployees() {
		List<Employee> emp=empRepo.findAll();
		return emp;
	}
	
}
