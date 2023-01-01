package net.mcnal.mysterya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mcnal.mysterya.DAO.IPlayerDAO;
import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.PlayerSummaryEntity;

@Service
public class PlayerSummaryService implements IPlayerSummaryService {
	@Autowired
	private IPlayerDAO playerdao;
	
	public List<PlayerSummaryEntity> getPlayerSummary(int number){
		List<PlayerSummaryEntity> list = playerdao.getSummary(number);
		return list;
	}
	public List<PlayerSummaryEntity> getPlayerSummaryLeague(int number){
		List<PlayerSummaryEntity> list = playerdao.getSummaryLeague(number);
		return list;
	}
	public List<PlayerSummaryEntity> getPlayerSummaryYear(int number){
		List<PlayerSummaryEntity> list = playerdao.getSummaryYear(number);
		return list;
	}
	public List<PlayerHitEntity> getPaBalltotal(int number){
		List<PlayerHitEntity> list = playerdao.getPaBalltotal(number);
		return list;
	} 
	public List<PlayerHitEntity> getPaDirection(int number){
		List<PlayerHitEntity> list = playerdao.getPaDirection(number);
		return list;
	} 
	public List<PlayerHitEntity> getPaOut(int number){
		List<PlayerHitEntity> list = playerdao.getPaOut(number);
		return list;
	} 
	public List<PlayerHitEntity> getPaTobase(int number){
		List<PlayerHitEntity> list = playerdao.getPaTobase(number);
		return list;
	} 
	public List<PlayerHitEntity> getPaTurn(int number){
		List<PlayerHitEntity> list = playerdao.getPaTurn(number);
		return list;
	} 
	public List<PlayerHitEntity> getPaETC(int number){
		List<PlayerHitEntity> list = playerdao.getPaETC(number);
		return list;
	} 
	public List<PlayerHitEntity> getPaBallcount(int number){
		List<PlayerHitEntity> list = playerdao.getPaBallcount(number);
		return list;
	}

	@Override
	public List<PlayerHitEntity> getPaHowbase(int number) {
		List<PlayerHitEntity> list = playerdao.getPaHowbase(number);
		return list;
	} 
}
