package com.divergentsoftlabs.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsoftlabs.dao.StudentDao;
import com.divergentsoftlabs.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	@Override
	public String addStudent(Student std) {
		String status="";
		try {
			Student studentCheck=searchStudent(std.getSid());
			if(studentCheck==null)
			{   
				Student check=studentDao.save(std);
				if(check.getSid().equals(std.getSid()))
					status="Student Insertion Sucess";
				else
					status="Student Insetion Failure";
			}
			else
			{
				status="Student Existed Already";
			}
			
		}catch(Exception e)
		{   
			status="Student Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		Student std=null;
		try {
		 Optional<Student> opt=studentDao.findById(sid);
		   std=opt.get();
		 }
		catch(NoSuchElementException nsee)
		{ }
		catch(Exception e)
		  {
		    e.printStackTrace();
		  }
		return std;
	}

	@Transactional
	@Override
	public String deleteStudent(String sid) {
		String status="";
		try {
			Student studentCheck=searchStudent(sid);
			if(studentCheck==null)
			{   
				status="Student Not Existed";
			}
			else
			{
				studentDao.deleteById(sid); // it has void return type
				studentCheck=searchStudent(sid);
				if(studentCheck==null)
					status="Student Deletion Sucess";
				else
					status="Student Deletion Failure";
			}
			
		}catch(Exception e)
		{   
			status="Student Deletion Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Transactional
	@Override
	public String updateStudent(Student std) {
		String status="";
		try {
			Student studentCheck=searchStudent(std.getSid());
			if(studentCheck==null)
			{   
				status="Student Not Existed";
			}
			else
			{  
				Student check=studentDao.save(std);
				if(check==null)
					status="Student Updation Failure";
				else
					status="Student Updation Sucess";
			}
			
		}catch(Exception e)
		{   
			status="Student Updation Failure";
			e.printStackTrace();
		}		
		return status;
	}

}
