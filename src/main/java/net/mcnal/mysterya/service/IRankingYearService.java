package net.mcnal.mysterya.service;

import java.util.HashMap;
import java.util.List;

public interface IRankingYearService {
	List<HashMap<String, Object>> getYearRanking(int year);
}
