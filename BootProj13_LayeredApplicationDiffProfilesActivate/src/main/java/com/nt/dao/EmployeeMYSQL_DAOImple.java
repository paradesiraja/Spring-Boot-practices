package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.models.Employee;
@Repository("MYSQL_DAO")
@Profile({"dev","test"})
public class EmployeeMYSQL_DAOImple implements IEmployeeDAO{

	private static final String GET_EMP_BY_DESG="SELECT EID,ENAME,DESG,SALARY,DEPTNO FROM EMPLOYEE WHERE DESG IN(?,?,?) ORDER BY DESG";
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Employee> getEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAOImple.getEmployeesByDesg()");
		System.out.println(ds.getClass());
		List<Employee> list=null;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMP_BY_DESG)){
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs=ps.executeQuery()){
				list=new ArrayList();
				while(rs.next()) {
					Employee emp=new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					//add employee obj to list collection
					list.add(emp);
					
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
