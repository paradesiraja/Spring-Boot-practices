package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.Repository.IEmployeeRepo;
import com.nt.document.PlayerInfo;


@Component("empService")
public class EmployeeServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepo empRepo;

	
	public String registerPlayer(PlayerInfo info) {
		
		return "player is saved with id::"+empRepo.insert(info).getPno();
	}
	
}
