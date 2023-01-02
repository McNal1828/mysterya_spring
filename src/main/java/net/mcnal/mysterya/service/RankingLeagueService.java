package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.mcnal.mysterya.DAO.IRankingDAO;

public class RankingLeagueService implements IRankingLeagueService{
	
	@Autowired
	private IRankingDAO rankingdao;

	@Override
	public List<HashMap<String, Object>> getLeagueRanking(int leagueIndex) {
		List<HashMap<String, Object>> list = rankingdao.getLeagueRanking(leagueIndex);
		return list;
	}
	

}
