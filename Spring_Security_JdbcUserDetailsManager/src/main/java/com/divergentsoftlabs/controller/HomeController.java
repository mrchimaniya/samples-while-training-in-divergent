package com.divergentsoftlabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  
	@GetMapping("/main")
	public String main()
	{
		return "This Is Main Page";
	}
	
	@GetMapping("update")
	public String update()
	{
		return "This Is Updated Info";
	}

	@GetMapping("/balance")
	public String balance()
	{
		return "Your Balance Is 3 Lakh";
	}
	
	@GetMapping("account")
	public String account()
	{
		return "You Are In Your Account";
	}
}

