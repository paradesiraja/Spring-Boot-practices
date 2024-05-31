package com.nt.runner;

import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Medol;
import com.nt.document.Player;
import com.nt.document.Sport;
import com.nt.service.IPlayerService;
@Component
public class OTMRunner implements CommandLineRunner {

	@Autowired
	private IPlayerService service;
	@Override
	public void run(String... args) throws Exception {
		
//		try {
//	
//			Sport sport1=new Sport(new Random().nextInt(1000),"badmitton",new String[] {"rocket","sock","net"});
//			Sport sport2=new Sport(new Random().nextInt(1000),"tennis",new String[] {"rocket","tball","net"});
//			
//			Medol medol1=new Medol("Olympic_game","gold","Tokyo_olymplic","Tokyo");
//			Medol medol2=new Medol("Olympic_game","silver","japan_olymplic","japan");
//			
//			Player player=new Player(new Random().nextInt(),"Sindhu","hyd",Set.of(sport1,sport2),Map.of("medol1",medol1,"medol2",medol2));
//			System.out.println(service.registerPlayerWithSportsAndMedol(player));
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		service.fetchByAll().forEach(play->{
			System.out.println("parent::"+play);
			
			Set<Sport> sports=play.getSports();
			sports.forEach(sport->{
				System.out.println("child1::"+sport);
			});
			Map<String,Medol> medols=play.getMedals();
			medols.forEach((type,medol)->{
				System.out.println("child2::"+type+"......."+medol);
			});
		
		});
	}

}
