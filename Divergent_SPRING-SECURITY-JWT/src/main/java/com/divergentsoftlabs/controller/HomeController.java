package com.divergentsoftlabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HomeController {

	 @GetMapping("/")
	public String welcome()
	{
		return "welcome";
	}
	
   @GetMapping("/hello")
   public String hello()
   {
	   return "Hello Home";
   }
}
