package com.divergentsl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController {

	@GetMapping("/good")
	public String good()
	{
		return "Good Morning";
	}
}
