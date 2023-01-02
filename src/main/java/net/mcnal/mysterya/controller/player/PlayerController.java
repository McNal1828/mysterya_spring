package net.mcnal.mysterya.controller.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.mcnal.mysterya.entity.PlayerEntity;
import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.PlayerSummaryEntity;
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
	@RequestMapping("summary")
	public String detail(Model model) {
		int pnumber=28;
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

		return "player.summary";
	}
}
