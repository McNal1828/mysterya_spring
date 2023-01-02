package net.mcnal.mysterya.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(@CookieValue(value = "mynum", required = false) Cookie myNumCookie, Model model) {
		if(myNumCookie != null) {
           String myNum = myNumCookie.getValue();
           model.addAttribute("mynum", myNum);
		}
		System.out.println("여기왓나1");
		return "root.index";
	}
	@PostMapping("/")
	public String setCookie(HttpServletResponse res,@RequestParam String mynum ) {
		System.out.println("여기왓나");
		Cookie myNumCookie = new Cookie("mynum",mynum);
		myNumCookie.setPath("/");
		myNumCookie.setMaxAge(7*24*60*60);
		myNumCookie.setPath("/");
		myNumCookie.setDomain("localhost");
		res.addCookie(myNumCookie);
		System.out.println(mynum);
		return "redirect:/";
	}
}
