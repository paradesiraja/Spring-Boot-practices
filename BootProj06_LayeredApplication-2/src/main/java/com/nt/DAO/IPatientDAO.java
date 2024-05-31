package com.nt.DAO;

import java.util.List;

import com.nt.models.Patient;

public interface IPatientDAO {

	List<Patient> getPatientDetailsByCity(String pcity1,String pcity2,String pcity3)throws Exception;
}
