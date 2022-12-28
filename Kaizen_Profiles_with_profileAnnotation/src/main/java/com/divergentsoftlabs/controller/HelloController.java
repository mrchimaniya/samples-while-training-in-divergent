package com.divergentsoftlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divergentsoftlabs.profile.Car;


@RestController
public class HelloController {
 
	@Value("${ram.shyam}")
     String s;
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Autowired
	 Car car;

	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	@GetMapping("/hi")
	public String hi()
	{
		System.out.println(s);
        return car.getCar();
	}
}
