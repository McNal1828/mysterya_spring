package net.mcnal.mysterya.service;

import java.sql.Array;
import java.util.List;

import net.mcnal.mysterya.DAO.IPlayerDAO;
import net.mcnal.mysterya.entity.PlayerEntity;

public class PlayerListService implements IPlayerListService{

	private IPlayerDAO playerdao;
	
	public void setPlayerdao(IPlayerDAO playerdao) {
		this.playerdao = playerdao;
	}
		
	public List<PlayerEntity> getPlayerList() {
		List<PlayerEntity> list = playerdao.getPlayerList();
		return list;
	}

	public PlayerEntity getPlayerDetail(int pnumber) {
		PlayerEntity player = playerdao.getPlayerDetail(pnumber);
		return player;
	}

}
