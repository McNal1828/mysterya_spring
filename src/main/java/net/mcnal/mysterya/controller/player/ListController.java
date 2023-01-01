package net.mcnal.mysterya.controller.player;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import net.mcnal.mysterya.entity.PlayerEntity;
import net.mcnal.mysterya.service.IPlayerListService;

public class ListController implements Controller{

	@Autowired
	private IPlayerListService listService;
	
	public void setListService(IPlayerListService service) {
		this.listService = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest reqs, HttpServletResponse resp) throws Exception {
		
		int spnumber = 0;
		
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
		
		
		ModelAndView mv = new ModelAndView("player.list");
		List<PlayerEntity> listPlayer = null;
		listPlayer=listService.getPlayerList();
		mv.addObject("listPlayer", listPlayer);
		mv.addObject("smynum",spnumber);
		
		return mv;
	}

}
