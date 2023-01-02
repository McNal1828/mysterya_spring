package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

public interface IRankingListService {
	List<HashMap<String, Object>> getRankingYearList();
	List<HashMap<String, Object>> getRankingLeagueList();
}
