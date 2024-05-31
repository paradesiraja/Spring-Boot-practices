package com.nt.service;

import java.util.List;

import com.nt.document.Player;

public interface IPlayerService{
	public String registerPlayerWithSportsAndMedol(Player player);
	public List<Player> fetchByAll();
}
