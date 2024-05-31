package com.nt.service;

import java.util.List;

import com.nt.models.Patient;

public interface IPatientMgmtService {

	List<Patient> fetchALLDeatailsBYPcity(String pcity1,String pcity2,String pcity3)throws Exception;
}
