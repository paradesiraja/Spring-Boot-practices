package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Player;
import com.nt.repository.IMedolRepo;
import com.nt.repository.IPlayerRepo;
import com.nt.repository.ISportRepo;



@Service("perService")
public class PlayerServiceImpl implements IPlayerService {

	@Autowired
	private IPlayerRepo playRepo;
	@Autowired
	private ISportRepo sportRepo;
	@Autowired
	private IMedolRepo medolRepo;
	@Override
	public String registerPlayerWithSportsAndMedol(Player player) {
		
		return "Player with sports and medols is saved with id value::"+playRepo.save(player);
	}
	@Override
	public List<Player> fetchByAll() {
		
		return playRepo.findAll();
	}
	
	
	

}
