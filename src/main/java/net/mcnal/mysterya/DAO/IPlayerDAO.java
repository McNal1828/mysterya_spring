package net.mcnal.mysterya.DAO;

import java.util.HashMap;
import java.util.List;

public interface IPlayerDAO {
	
	List<HashMap<String, Object>> getSummaryLeague(int number);
	List<HashMap<String, Object>> getSummaryYear(int number);
	List<HashMap<String, Object>> getSummary(int number);
	List<HashMap<String, Object>> getPaBalltotal(int number);
	List<HashMap<String, Object>> getPaDirection(int number);
	List<HashMap<String, Object>> getPaOut(int number);
	List<HashMap<String, Object>> getPaTobase(int number);
	List<HashMap<String, Object>> getPaTurn(int number);
	List<HashMap<String, Object>> getPaETC(int number);
	List<HashMap<String, Object>> getPaBallcount(int number);
	List<HashMap<String, Object>> getPlayerList(String cat, String input);
	HashMap<String, Object> getPlayerDetail(int number);
	List<List<HashMap<String, Object>>> getPaHowbase(int number);
}
