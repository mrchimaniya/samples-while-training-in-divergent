package com.divergentsoftlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.divergentsoftlabs.entity.Student;
import com.divergentsoftlabs.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/addform")
	public String getAddForm()
	{
		return "addform";
	}
	
	@RequestMapping(value="/searchform")
	public String getSearchForm()
	{
		return "searchform";
	}
	
	@RequestMapping(value="/updateform")
	public String getupdateForm()
	{
		return "updateform";
	}
	
	@RequestMapping(value="/editform")
	public String geteditForm()
	{
		return "editform";
	}
	
	@RequestMapping(value="/deleteform")
	public String getdeleteForm()
	{
		return "deleteform";
	}
	
	@RequestMapping(value="/add" , method = RequestMethod.POST)
	public String add(Model map, @RequestParam String sid, @RequestParam String sname, @RequestParam String saddr)
	{
		Student std=new Student();
		std.setSid(sid);
		std.setSname(sname);
		std.setSaddr(saddr);
		
		String status=studentService.addStudent(std);
		map.addAttribute("status",status);
		return "status";
	}
	
	@RequestMapping(value="/search" , method = RequestMethod.POST)
	public String search(Model map, @RequestParam String sid)
	{
        String status="";
		  Student std=studentService.searchStudent(sid);
		  if(std==null)
		  {
			  map.addAttribute("status","Student Not Existed");
			  status="status";
		  }
		  else
		  {
			  map.addAttribute("std", std);
			  status="studentdetails";
		  }
		return status;
	}
	
	@RequestMapping(value="/update" , method = RequestMethod.POST)
	public String update(Model map, @RequestParam String sid, @RequestParam String sname, @RequestParam String  saddr)
	{
		Student std=new Student();
		std.setSid(sid);
		std.setSname(sname);
		std.setSaddr(saddr);
		
        String status=studentService.updateStudent(std);
        map.addAttribute("status",status);
		return "status";		
	}
	
	@RequestMapping(value="/edit" , method = RequestMethod.POST)
	public String edit(Model map, @RequestParam String sid)
	{
        String status="";
		  Student std=studentService.searchStudent(sid);
		  if(std==null)
		  {
			  map.addAttribute("status","Student Not Existed");
			  status="status";
		  }
		  else
		  {
			  map.addAttribute("std",std);
			  status="editform";
		  }		
		return status;		
	}
	
	@RequestMapping(value="/delete" , method = RequestMethod.POST)
	public String delete(Model map, @RequestParam String sid)
	{
        String status=studentService.deleteStudent(sid);
        map.addAttribute("status",status);
		return "status";		
	}
	
}
