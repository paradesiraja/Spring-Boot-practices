package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.IPatientDAO;
import com.nt.models.Patient;

@Service("pService")
public class PatientMgmtImpleService implements IPatientMgmtService{

	@Autowired
	private IPatientDAO pDAO;
	@Override
	public List<Patient> fetchALLDeatailsBYPcity(String pcity1, String pcity2, String pcity3) throws Exception {
		
		List<Patient> list=pDAO.getPatientDetailsByCity(pcity1, pcity2, pcity3);
		return list;
	}

}
