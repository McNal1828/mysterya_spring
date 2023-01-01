package net.mcnal.mysterya.service;

import java.util.List;

import net.mcnal.mysterya.entity.PlayerEntity;

public interface IPlayerListService {
	List<PlayerEntity> getPlayerList();
	PlayerEntity getPlayerDetail(int pnumber);
}
