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
	public List<Employee> searchEmployeeBySalaryRange(double start, double end) {
		List<Employee> list=empRepo.findBySalaryBetween(start, end);
		return list;
	}
	

}
