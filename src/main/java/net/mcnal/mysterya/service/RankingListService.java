package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mcnal.mysterya.DAO.IRankingDAO;
import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.RankingEntity;

@Service
public class RankingListService implements IRankingListService{
	
	@Autowired
	private IRankingDAO rankingdao;

	@Override
	public List<HashMap<String, Object>> getRankingYearList() {
		List<HashMap<String, Object>> list = rankingdao.getYearList();
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getRankingLeagueList() {
		List<HashMap<String, Object>> list = rankingdao.getLeagueList();
		return list;
	}

}
