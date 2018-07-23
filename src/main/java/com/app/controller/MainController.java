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
	
	
	@RequestMapping(value={"/download"})
	public ModelAndView download(){
		
		ModelAndView map = new ModelAndView("download");
		map.addObject("message", "From Download Page");
		return map;
	}
	
	
	@RequestMapping(value={"/upload"})
	public ModelAndView upload(){
		
		ModelAndView map = new ModelAndView("upload");
		map.addObject("message", "From Upload Page");
		return map;
	}
	
	@RequestMapping(value={"/report"})
	public ModelAndView report(){
		
		ModelAndView map = new ModelAndView("report");
		map.addObject("message", "From Report Page");
		return map;
	}
	
	@RequestMapping(value={"/search"})
	public ModelAndView search(){
		
		ModelAndView map = new ModelAndView("search");
		map.addObject("message", "From Search Page");
		return map;
	}
}
