package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

public interface IPlayerListService {
	List<HashMap<String, Object>> getPlayerList(String cat, String input);
	HashMap<String, Object> getPlayerDetail(int pnumber);
}
