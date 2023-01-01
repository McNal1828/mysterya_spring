package net.mcnal.mysterya.service;

import java.util.List;

import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.PlayerSummaryEntity;
//interface를 만드는이유는 이거를 기반으로 class들을 만들고 그거를 그냥 조립만하기위해
//나중에 구조를바꿀때 다 불러오기만하고 다시만들면되니까 더쉬움, 결합력낮춤
//새로만들고 하나하나일일이안바꿔주고 xml에서 이름만바꿔주면됨
public interface IPlayerSummaryService {

	List<PlayerSummaryEntity> getPlayerSummaryYear(int number);
	List<PlayerSummaryEntity> getPlayerSummaryLeague(int number);
	List<PlayerSummaryEntity> getPlayerSummary(int number);
	List<PlayerHitEntity> getPaDirection(int number);
	List<PlayerHitEntity> getPaHowbase(int number);
	List<PlayerHitEntity> getPaTurn(int number);
	List<PlayerHitEntity> getPaBallcount(int number);
	List<PlayerHitEntity> getPaBalltotal(int number);
	List<PlayerHitEntity> getPaOut(int number);
	List<PlayerHitEntity> getPaTobase(int number);
	List<PlayerHitEntity> getPaETC(int i);
}
