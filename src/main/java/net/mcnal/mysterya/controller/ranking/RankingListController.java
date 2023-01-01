package net.mcnal.mysterya.controller.ranking;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import net.mcnal.mysterya.entity.RankingEntity;
import net.mcnal.mysterya.service.IRankingService;

public class RankingListController implements Controller{

	private IRankingService service;
	
	public void setService(IRankingService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest reqs, HttpServletResponse resp) throws Exception {
		
		
		ModelAndView mv = new ModelAndView("ranking.list");
		
		List<RankingEntity> listLeague = service.getLeagueList();
		mv.addObject("listLeague", listLeague);
		List<RankingEntity> listyear = service.getYearList();
		mv.addObject("listyear", listyear);
		
		
		
		return mv;
	}

}
