package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.models.Employee;
@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService{

	@Autowired
	private IEmployeeDAO empDAO;
	@Override
	public List<Employee> fetchEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeMgmtService.fetchEmployeeByDesgn()");
		//use DAO
		List<Employee> list=empDAO.getEmployeesByDesg(desg1,desg2,desg3);
		return list;
	}

}
