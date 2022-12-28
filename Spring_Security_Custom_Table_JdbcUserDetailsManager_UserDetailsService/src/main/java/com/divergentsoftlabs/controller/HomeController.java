package com.divergentsoftlabs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@GetMapping("jsppage")
    public ModelAndView showLoginPage(){
		return new ModelAndView("jsppage");
    }
	
	@GetMapping("testjsp")
    public String showpage(){
		return "jsppage.jsp";
    }
	
	@GetMapping("/")
	public String main()
	{
		return "Welcome";
	}
	
	@GetMapping("/wish")
	public String wish()
	{
		return "Good Evening";
	}

	@GetMapping("/user")
	public String user()
	{
		return "<h1>User Area<br><a href='http://localhost:8080/logout'>logout</a></h1>";
	}
	
	@GetMapping("admin")
	public String admin()
	{
		return "<h1>Admin Area<br><a href='http://localhost:8080/logout'>logout</a></h1>";
	}
	
	
}

