package net.mcnal.mysterya.controller.player;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.mcnal.mysterya.service.IPlayerListService;
import net.mcnal.mysterya.service.IPlayerSummaryService;


@Controller
@RequestMapping("/player/")
public class PlayerController {
	
	@Autowired
	private IPlayerListService listService;
	@Autowired
	private IPlayerSummaryService summaryService;
	
	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("listPlayer", listService.getPlayerList());
		return "player.list";
	}
	@RequestMapping({"summary/{number}","summary"})
	public String detail(Model model, @PathVariable(required = false) String number) {
		int pnumber=0;
		if(number != null) {
			pnumber=Integer.parseInt(number);
			model.addAttribute("listLeague", summaryService.getPlayerSummaryLeague(pnumber));
			model.addAttribute("listYear", summaryService.getPlayerSummaryYear(pnumber));
			model.addAttribute("listsummary", summaryService.getPlayerSummary(pnumber));
			model.addAttribute("listPaBalltotal", summaryService.getPaBalltotal(pnumber));
			model.addAttribute("listPaDirection", summaryService.getPaDirection(pnumber));
			model.addAttribute("listPaOut", summaryService.getPaOut(pnumber));
			model.addAttribute("listPaTobase", summaryService.getPaTobase(pnumber));
			model.addAttribute("listPaTurn", summaryService.getPaTurn(pnumber));
			model.addAttribute("listPaETC", summaryService.getPaETC(pnumber));
			model.addAttribute("listPaBallcount", summaryService.getPaBallcount(pnumber));
			model.addAttribute("playerDetail", summaryService.getPlayerDetail(pnumber));
			model.addAttribute("listPaHowbase", summaryService.getPaHowbase(pnumber));
		}else {
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("number","0000");
			data.put("name","메인페이지에서 번호를 정해주세요");
			data.put("support", "KBO");
			model.addAttribute("playerDetail",data);
		}
		return "player.summary";
	}
	
}