package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String login(){
		return "index.html";
	}
	
	/*@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginView(@RequestParam("username") String username,@RequestParam("password") String password, HttpServletResponse response) {
		boolean loginValidRes =  loginService.validateLogin(username, password);
		if(loginValidRes){
			return "dashboard";
		}else{
			return "login";
		}
		
	}
	@RequestMapping(value="/login/redirect", method=RequestMethod.GET)
	public String redirect(){
		return "login";
	}*/
}
