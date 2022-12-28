package com.divergentsoftlabs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divergentsoftlabs.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, String>{
	
	//we have to leave it empty it takes care by jvm beacuse of repository marker interface
	
}
