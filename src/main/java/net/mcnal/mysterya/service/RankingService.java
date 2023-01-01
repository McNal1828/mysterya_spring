package net.mcnal.mysterya.service;

import java.util.List;

import net.mcnal.mysterya.DAO.IRankingDAO;
import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.RankingEntity;

public class RankingService implements IRankingService{
	
	private IRankingDAO rankingdao;
	

	public void setRankingdao(IRankingDAO rankingdao) {
		this.rankingdao = rankingdao;
	}

	@Override
	public List<RankingEntity> getYearList() {
		List<RankingEntity> list = rankingdao.getYearList();
		return list;
	}

	@Override
	public List<RankingEntity> getLeagueList() {
		List<RankingEntity> list = rankingdao.getLeagueList();
		return list;
	}

	@Override
	public List<RankingEntity> getSummary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaHowbase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaTurn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaBallcount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaBalltotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaTobase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaETC() {
		// TODO Auto-generated method stub
		return null;
	}

}
