package com.divergentsl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/donate")
	public String donate()
	{
		return "donate";
	}
	
	@GetMapping("/search")
	public String search()
	{
		return "search";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("unregister")
	public String unregister()
	{
		return "unregister";
	}
	
	@GetMapping("/support")
	public String support()
	{
		return "support";
	}
}
