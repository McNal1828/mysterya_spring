package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mcnal.mysterya.DAO.IPlayerDAO;

@Service
public class PlayerSummaryService implements IPlayerSummaryService {
	@Autowired
	private IPlayerDAO playerdao;
	
	public HashMap<String, Object> getPlayerDetail(int number){
		HashMap<String, Object> data = playerdao.getPlayerDetail(number);
		return data;
	}
	public List<HashMap<String, Object>> getPlayerSummary(int number){
		List<HashMap<String, Object>> list = playerdao.getSummary(number);
		return list;
	}
	public List<HashMap<String, Object>> getPlayerSummaryLeague(int number){
		List<HashMap<String, Object>> list = playerdao.getSummaryLeague(number);
		return list;
	}
	public List<HashMap<String, Object>> getPlayerSummaryYear(int number){
		List<HashMap<String, Object>> list = playerdao.getSummaryYear(number);
		return list;
	}
	public List<HashMap<String, Object>> getPaBalltotal(int number){
		List<HashMap<String, Object>> list = playerdao.getPaBalltotal(number);
		return list;
	} 
	public List<HashMap<String, Object>> getPaDirection(int number){
		List<HashMap<String, Object>> list = playerdao.getPaDirection(number);
		return list;
	} 
	public List<HashMap<String, Object>> getPaOut(int number){
		List<HashMap<String, Object>> list = playerdao.getPaOut(number);
		return list;
	} 
	public List<HashMap<String, Object>> getPaTobase(int number){
		List<HashMap<String, Object>> list = playerdao.getPaTobase(number);
		return list;
	} 
	public List<HashMap<String, Object>> getPaTurn(int number){
		List<HashMap<String, Object>> list = playerdao.getPaTurn(number);
		return list;
	} 
	public List<HashMap<String, Object>> getPaETC(int number){
		List<HashMap<String, Object>> list = playerdao.getPaETC(number);
		return list;
	} 
	public List<HashMap<String, Object>> getPaBallcount(int number){
		List<HashMap<String, Object>> list = playerdao.getPaBallcount(number);
		return list;
	}

	@Override
	public List<List<HashMap<String, Object>>> getPaHowbase(int number) {
		List<List<HashMap<String, Object>>> list = playerdao.getPaHowbase(number);
		return list;
	} 
}
