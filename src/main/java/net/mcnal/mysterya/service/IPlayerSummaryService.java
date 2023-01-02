package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

public interface IPlayerSummaryService {

	List<HashMap<String, Object>> getPlayerSummaryYear(int number);
	List<HashMap<String, Object>> getPlayerSummaryLeague(int number);
	List<HashMap<String, Object>> getPlayerSummary(int number);
	List<HashMap<String, Object>> getPaDirection(int number);
	List<List<HashMap<String, Object>>> getPaHowbase(int number);
	List<HashMap<String, Object>> getPaTurn(int number);
	List<HashMap<String, Object>> getPaBallcount(int number);
	List<HashMap<String, Object>> getPaBalltotal(int number);
	List<HashMap<String, Object>> getPaOut(int number);
	List<HashMap<String, Object>> getPaTobase(int number);
	List<HashMap<String, Object>> getPaETC(int number);
	HashMap<String, Object> getPlayerDetail(int number);
}
