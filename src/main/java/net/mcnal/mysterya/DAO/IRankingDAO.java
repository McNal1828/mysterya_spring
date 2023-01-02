package net.mcnal.mysterya.DAO;

import java.util.List;

import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.RankingEntity;

public interface IRankingDAO {
	
//	dispatcher-servlet 안쓸때
//	Connection getConnection();
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
