package net.mcnal.mysterya.controller.ranking;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.mcnal.mysterya.service.IRankingLeagueService;
import net.mcnal.mysterya.service.IRankingListService;
import net.mcnal.mysterya.service.IRankingYearService;

@Controller
@RequestMapping("/ranking")
public class RankingController {
	
	@Autowired
	private IRankingListService listService;
	@Autowired
	private IRankingLeagueService leagueService;
	@Autowired
	private IRankingYearService yearService;
	
	@RequestMapping("/list")
	public String list(Model model, @CookieValue(value = "mynum",required = false) Cookie myNumCookie) {
		model.addAttribute("listyear", listService.getRankingYearList());
		model.addAttribute("listLeague", listService.getRankingLeagueList());
		if(myNumCookie != null) {
			String myNum = myNumCookie.getValue();
			model.addAttribute("mynum", myNum);
		}
		return "ranking.list";
	}
	@RequestMapping("/year/{year}")
	public String yearRanking(Model model, @CookieValue(value = "mynum",required = false) Cookie myNumCookie, @PathVariable(required = true) int year) {
		model.addAttribute("year", yearService.getYearRanking(year));
		if(myNumCookie != null) {
			String myNum = myNumCookie.getValue();
			model.addAttribute("mynum", myNum);
		}
		return "ranking.year";
	}
	@RequestMapping("/league/{leagueIndex}")
	public String leagueRanking(Model model, @CookieValue(value = "mynum",required = false) Cookie myNumCookie, @PathVariable(required = true) int leagueIndex) {
		model.addAttribute("league", leagueService.getLeagueRanking(leagueIndex));
		if(myNumCookie != null) {
			String myNum = myNumCookie.getValue();
			model.addAttribute("mynum", myNum);
		}
		return "ranking.league";
	}

}
