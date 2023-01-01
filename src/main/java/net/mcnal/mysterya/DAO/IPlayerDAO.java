package net.mcnal.mysterya.DAO;

import java.util.List;

import net.mcnal.mysterya.entity.PlayerEntity;
import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.PlayerSummaryEntity;

public interface IPlayerDAO {
	
//	dispatcher-servlet 안쓸때
//	Connection getConnection();
	List<PlayerSummaryEntity> getSummaryLeague(int number);
	List<PlayerSummaryEntity> getSummaryYear(int number);
	List<PlayerSummaryEntity> getSummary(int number);
	List<PlayerHitEntity> getPaBalltotal(int number);
	List<PlayerHitEntity> getPaDirection(int number);
	List<PlayerHitEntity> getPaOut(int number);
	List<PlayerHitEntity> getPaTobase(int number);
	List<PlayerHitEntity> getPaTurn(int number);
	List<PlayerHitEntity> getPaETC(int number);
	List<PlayerHitEntity> getPaBallcount(int number);
	List<PlayerEntity> getPlayerList();
	PlayerEntity getPlayerDetail(int number);
	List<PlayerHitEntity> getPaHowbase(int number);
}
