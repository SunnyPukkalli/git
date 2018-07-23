package com.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	
	@RequestMapping(value={"/main"})
	public ModelAndView hello(){
		
		ModelAndView map = new ModelAndView("Main");
		map.addObject("message", "Hello World");
		return map;
	}
	
	@RequestMapping("/")
	public String main(){
		
		return "index";
	}
	
	/* Login */
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public ModelAndView login(){
		
		ModelAndView model = new ModelAndView("login");
		
		model.addObject("Header", "Custom Login Page");
		
		
		return model;
	}
	/*
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public ModelAndView pLogin(){
		
		ModelAndView map = new ModelAndView("Main");
		map.addObject("message", "Hello World");
		return map;
	}*/
}
