package net.mcnal.mysterya.service;

import java.sql.Array;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mcnal.mysterya.DAO.IPlayerDAO;
import net.mcnal.mysterya.entity.PlayerEntity;

@Service
public class PlayerListService implements IPlayerListService{
	
	@Autowired
	private IPlayerDAO playerdao;

		
	public List<PlayerEntity> getPlayerList() {
		List<PlayerEntity> list = playerdao.getPlayerList();
		return list;
	}

	public PlayerEntity getPlayerDetail(int pnumber) {
		PlayerEntity player = playerdao.getPlayerDetail(pnumber);
		return player;
	}

}
