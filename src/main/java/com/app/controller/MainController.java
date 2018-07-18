package com.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	
	@RequestMapping("/main")
	public ModelAndView hello(){
		
		ModelAndView map = new ModelAndView("Main");
		map.addObject("message", "Hello World");
		return map;
	}
	
	@RequestMapping("/")
	public String main(){
		
		return "index";
	}
	
	
	@RequestMapping(value = "/login1", method=RequestMethod.GET)
	public String login(){
		return "login";
	}
}
