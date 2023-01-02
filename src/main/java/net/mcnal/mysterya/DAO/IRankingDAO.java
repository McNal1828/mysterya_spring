package net.mcnal.mysterya.DAO;

import java.util.HashMap;
import java.util.List;

import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.RankingEntity;

public interface IRankingDAO {
	
	List<HashMap<String, Object>> getYearList();
	List<HashMap<String, Object>> getLeagueList();
	List<HashMap<String, Object>> getYearRanking(int number);
	List<HashMap<String, Object>> getLeagueRanking(int number);
}
