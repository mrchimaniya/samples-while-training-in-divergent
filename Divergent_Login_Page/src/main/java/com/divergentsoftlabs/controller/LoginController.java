package com.divergentsoftlabs.controller;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
   
	private Logger logger=org.slf4j.LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="/loginpage", method = RequestMethod.GET)
	public String showLoginPage()
	{
		return "loginpage";
	}
	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public String login(@RequestParam String uname, @RequestParam String upwd)
	{
		if(uname.equals("aayush") && upwd.equals("aayush1233"))
			return "sucess";
		else
			{ String message="failure";		
		     	logger.error(message);
		    	 return message;
			}
		//return "failure"; }
	}
	
}
