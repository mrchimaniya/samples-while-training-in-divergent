package com.divergentsoftlabs.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
 
	@GetMapping("/")
	public String home()
	{
		return "Welcome";
	}
	
	@GetMapping("/wish")
	public String wish()
	{
		return "Good Morning";
	}
	
	@GetMapping("/user")
	public String user()
	{
		System.out.println("User name :: " + SecurityContextHolder.getContext().getAuthentication().getName());
		return "User Area";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "Admin Area";
	}
}
