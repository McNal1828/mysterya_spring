package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

public interface IRankingLeagueService {
	List<HashMap<String, Object>> getLeagueRanking(int leagueIndex);
}
