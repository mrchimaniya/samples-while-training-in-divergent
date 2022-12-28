package com.divergentsoftlabs.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	static Logger logger=LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping
	public String welcome()
	{
		logger.trace("Trace");
		logger.debug("Debug");
		logger.info("info");
		logger.warn("Warn");
		logger.error("error"); 
		return "Welcome";
	}
	
}
