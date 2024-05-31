package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.models.Patient;

@Repository("pDAO")
public class PatientDAO implements IPatientDAO{
	
	private final static String GET_BY_PDETAILS_BY_PCITY="SELECT PID,PNAME,PCITY,PAGE FROM CORONAPATIENTS WHERE PCITY IN(?,?,?) ORDER BY PCITY";
	@Autowired
	private DataSource ds;

	@Override
	public List<Patient> getPatientDetailsByCity(String pcity1, String pcity2, String pcity3) throws Exception {
		List<Patient> list=null;
	
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_BY_PDETAILS_BY_PCITY)){
			
			ps.setString(1,pcity1);
			ps.setString(2,pcity2);
			ps.setString(3,pcity3);
			
			try(ResultSet rs=ps.executeQuery()){
				list=new ArrayList<Patient>();
				while(rs.next()) {
					Patient pnt=new Patient();
				pnt.setPid(rs.getInt(1));
				pnt.setPname(rs.getString(2));
				pnt.setPcity(rs.getString(3));
				pnt.setPage(rs.getInt(4));
				
				list.add(pnt);
				
				
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
