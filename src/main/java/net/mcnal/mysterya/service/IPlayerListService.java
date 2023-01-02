package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

public interface IPlayerListService {
	List<HashMap<String, Object>> getPlayerList();
	HashMap<String, Object> getPlayerDetail(int pnumber);
}
