package com.divergentsoftlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsoftlabs.beans.Student;
import com.divergentsoftlabs.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public String addStudent(Student std) {
		return studentDao.add(std);
	}

	@Override
	public Student searchStudent(String sid) {
		return studentDao.search(sid);
	}

	@Override
	public String deleteStudent(String sid) {
		return studentDao.delete(sid);
	}

	@Override
	public String updateStudent(Student std) {
		return studentDao.update(std);
	}

}
