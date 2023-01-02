package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mcnal.mysterya.DAO.IPlayerDAO;

@Service
public class PlayerListService implements IPlayerListService{
	
	@Autowired
	private IPlayerDAO playerdao;

		
	public List<HashMap<String, Object>> getPlayerList() {
		List<HashMap<String, Object>> list = playerdao.getPlayerList();
		return list;
	}

	public HashMap<String, Object> getPlayerDetail(int pnumber) {
		HashMap<String, Object> player = playerdao.getPlayerDetail(pnumber);
		return player;
	}

}
