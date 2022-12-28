package com.divergentsoftlabs.service;

import com.divergentsoftlabs.beans.Student;

public interface StudentService {

	  public String addStudent(Student std);
	  public Student searchStudent(String sid);
	  public String deleteStudent(String sid);
	  public String updateStudent(Student std);
}
