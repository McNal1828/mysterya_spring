package net.mcnal.mysterya.controller.player;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import net.mcnal.mysterya.entity.PlayerEntity;
import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.PlayerSummaryEntity;
import net.mcnal.mysterya.service.IPlayerListService;
import net.mcnal.mysterya.service.IPlayerSummaryService;

public class SummaryController implements Controller{
	
	private IPlayerSummaryService summaryService;
	private IPlayerListService listService;
	
	public void setSummaryService(IPlayerSummaryService service) {
		this.summaryService = service;
	}
	public void setListService(IPlayerListService service) {
		this.listService = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest reqs, HttpServletResponse resp) throws Exception {
		

		
		int pnumber = 0;
		int spnumber = 0;

		String number_ = reqs.getParameter("n");
		if(number_!= null && !number_.equals("")) {
			pnumber=Integer.parseInt(number_);
		}
		
		Cookie[] cookies = reqs.getCookies();
		if(cookies != null) {
			for(Cookie c: cookies) {
				if(c.getName().equals("mynum")) {
					if(c.getValue()!= null && !c.getValue().equals("")) {
						spnumber = Integer.parseInt(c.getValue());
					}
				}
			}
		}
		
		
		

		ModelAndView mav = new ModelAndView("player.summary");
		
		mav.addObject("mynum",pnumber);
		mav.addObject("smynum",spnumber);
		
		List<PlayerSummaryEntity> listleague = null;
		listleague = summaryService.getPlayerSummaryLeague(pnumber);
		mav.addObject("listLeague", listleague);
		
		List<PlayerSummaryEntity> listyear = null;
		listyear = summaryService.getPlayerSummaryYear(pnumber);
		mav.addObject("listYear", listyear);
		
		List<PlayerSummaryEntity> listsummary = null;
		listsummary = summaryService.getPlayerSummary(pnumber);
		mav.addObject("listsummary", listsummary);
		
		List<PlayerHitEntity> listPaBalltotal = null;
		listPaBalltotal = summaryService.getPaBalltotal(pnumber);
		mav.addObject("listPaBalltotal", listPaBalltotal);
		
		List<PlayerHitEntity> listPaDirection = null;
		listPaDirection = summaryService.getPaDirection(pnumber);
		mav.addObject("listPaDirection", listPaDirection);
		
		List<PlayerHitEntity> listPaOut = null;
		listPaOut = summaryService.getPaOut(pnumber);
		mav.addObject("listPaOut", listPaOut);
		
		List<PlayerHitEntity> listPaTobase = null;
		listPaTobase = summaryService.getPaTobase(pnumber);
		mav.addObject("listPaTobase", listPaTobase);
		
		List<PlayerHitEntity> listPaTurn = null;
		listPaTurn = summaryService.getPaTurn(pnumber);
		mav.addObject("listPaTurn", listPaTurn);
		
		List<PlayerHitEntity> listPaETC = null;
		listPaETC = summaryService.getPaETC(pnumber);
		mav.addObject("listPaETC", listPaETC);
		
		List<PlayerHitEntity> listPaBallcount = null;
		listPaBallcount = summaryService.getPaBallcount(pnumber);
		mav.addObject("listPaBallcount", listPaBallcount);
		
		PlayerEntity playerDetail= null;
		playerDetail = listService.getPlayerDetail(pnumber);
		mav.addObject("playerDetail", playerDetail);
		
		List<PlayerHitEntity> listPaHowbase = null;
		listPaHowbase = summaryService.getPaHowbase(pnumber);
		mav.addObject("listPaHowbase", listPaHowbase);
		
		return mav;
	}

}
