package com.divergentsoftlabs.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class StudentController {

	@GetMapping(path="/hello")
	public RedirectView get()
	{
		//return "GET";
		
	   /* RedirectView rv=new RedirectView();
	    rv.setUrl("bye");
	    return rv;*/
		
		//return "redirect:/bye";
		
		RedirectView rv=new RedirectView();
		rv.setUrl("https://www.google.com");
		return rv;
		
	}
	
	@GetMapping("/bye")
	public String saybye()
	{
		return "BYE";
	}
	
	@PostMapping(path="hello")
	public String post()
	{
		return "POST";
	}
	
	@PutMapping(path="hello")
	public String put()
	{
		return "PUT";
	}
	
	@DeleteMapping(path="hello")
	public String delete()
	{
		return "DELETE";
	}
}
