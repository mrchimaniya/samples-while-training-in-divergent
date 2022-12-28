package com.divergentsoftlabs.dao;

import org.springframework.data.repository.CrudRepository;

import com.divergentsoftlabs.beans.Student;

public interface StudentDao extends CrudRepository<Student, String>{
	
	//we have to leave it empty
	
}
