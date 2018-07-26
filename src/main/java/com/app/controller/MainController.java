package com.app.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView main(){
		
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		//System.out.println();
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("username", name);
		return model;
	}
	
	/* Login */
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public ModelAndView login(@RequestParam(value="error",required=false) String error){
		
		ModelAndView model = new ModelAndView();
		
		
		if(error!=null){
			model.addObject("error", "wrong credentails");
		}
		model.setViewName("login");
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
	
	@RequestMapping(value={"/admin"})
	public ModelAndView admin(){
		
		ModelAndView map = new ModelAndView("admin");
		map.addObject("message", "From Admin Page");
		return map;
	}
	
	@RequestMapping(value={"/allusers"})
	public ModelAndView allUsers(){
		
		ModelAndView map = new ModelAndView("admin");
		map.addObject("users", "all users");
		return map;
	}
	
	@RequestMapping(value={"/logout"})
	public String logout(HttpServletRequest request, HttpServletResponse response){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if(auth!=null){
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		
		return "redirect:/login";
	}
	
	
	@RequestMapping(value="/accessDenied")
	public ModelAndView accessDenied(){
		ModelAndView map = new ModelAndView("403");
		map.addObject("message","Access Denied");
		return map;
	}
}
