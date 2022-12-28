package com.divergentsoftlabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
   
	@GetMapping(path = "/hello")
	public String getLoginPage()
	{
		return "Hello User";
	}
}
