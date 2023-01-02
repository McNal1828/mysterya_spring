package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.RankingEntity;

public interface IRankingListService {
	List<HashMap<String, Object>> getRankingYearList();
	List<HashMap<String, Object>> getRankingLeagueList();
}
