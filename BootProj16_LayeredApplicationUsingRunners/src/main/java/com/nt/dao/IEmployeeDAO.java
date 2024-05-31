package com.nt.dao;

import java.util.List;

import com.nt.models.Employee;

public interface IEmployeeDAO {

	public List<Employee> getEmployeesByDesg(String desg1,String desg2,String desg3) throws Exception;
}
