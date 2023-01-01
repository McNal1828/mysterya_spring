package net.mcnal.mysterya.service;

import java.util.List;

import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.RankingEntity;

public interface IRankingService {
	List<RankingEntity> getYearList();
	List<RankingEntity> getLeagueList();
	List<RankingEntity> getSummary();
	List<PlayerHitEntity> getPaDirection();
	List<PlayerHitEntity> getPaHowbase();
	List<PlayerHitEntity> getPaTurn();
	List<PlayerHitEntity> getPaBallcount();
	List<PlayerHitEntity> getPaBalltotal();
	List<PlayerHitEntity> getPaOut();
	List<PlayerHitEntity> getPaTobase();
	List<PlayerHitEntity> getPaETC();
}
