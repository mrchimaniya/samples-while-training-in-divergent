package com.divergentsoftlabs.controller;

import java.util.Optional;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

class Student{
	public int a=1;
	public  int b=2;
}

@RestController
public class HomeController {

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@GetMapping("/get")
	public ResponseEntity hi()
	{
		Student std=new Student();  
		if(std.a==1)
     		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Hello People");
		
		//return ResponseEntity.of(Optional.of(std));
		return new ResponseEntity<Student>(std,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "status";  
		
	}
	
	@GetMapping("/good")
	public String good()  
	{   
		return "Good Morning";  
		
	}
}
