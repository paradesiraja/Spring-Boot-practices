package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.models.Patient;
import com.nt.service.IPatientMgmtService;

@Controller("corona")
public class PatientController {

	@Autowired
	private IPatientMgmtService pService;
	
	public List<Patient> takeAllDetailsByPcity(String pcity1,String pcity2,String pcity3) throws Exception{
		List<Patient> list=pService.fetchALLDeatailsBYPcity(pcity1, pcity2, pcity3);
		return list;
		
	}
}
