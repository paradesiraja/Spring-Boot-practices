package com.nt.Runner;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.PlayerInfo;
import com.nt.service.IEmployeeMgmtService;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	@Override
	public void run(String... args) throws Exception {

		PlayerInfo info=new PlayerInfo();
		info.setPno(new Random().nextInt(1000));
		info.setPname("jadeja"); info.setPadds("jaipur"); info.setNickNames(List.of("jaddu","jadu","sir"));
        info.setFriends(new String[] {"dhoni","yuvaraj","aswin","kohli"});
        info.setImpKnocks(Map.of("asia cup","35 runs","2019 worldcup","50 runs"));
        Properties props=new Properties();
        props.put("aadhar", "455252409891");
        props.put("pan", "DOLPR2148J");
        info.setIdDetails(props);
        System.out.println(service.registerPlayer(info));
	}

}
