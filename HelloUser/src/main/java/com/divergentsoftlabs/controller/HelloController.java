package com.divergentsoftlabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String getHelloPage()
	{
		return "hellopage";
	}
	
	@RequestMapping(value="/wish", method = RequestMethod.POST)
	public String wish(@RequestParam String uname, ModelMap map)
	{
		map.addAttribute("uname",uname);
		return "wish";
	}
}
