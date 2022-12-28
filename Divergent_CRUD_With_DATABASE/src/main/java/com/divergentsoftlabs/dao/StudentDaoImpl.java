package com.divergentsoftlabs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.divergentsoftlabs.beans.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public String add(Student std) {
		String status="";
		 Student student=search(std.getSid());
		 if(student==null)
		 {
			 int check=jdbcTemplate.update("insert into student values('"+std.getSid()+"','"+std.getSname()+"','"+std.getSaddr()+"')");
			 if(check==1)
			 {
				 status="Student Insertion Sucess";
			 }
			 else
			 {
				 status="Student Insertion Failure";
			 }
		 }
		 else
		 {
			 status="Student Existed Already";
		 }
		return status;
	}

	@Override
	public Student search(String sid) {
		Student std=null;
		List<Student> list=jdbcTemplate.query("select * from student where sid='"+sid+"'", (rs,index)->{
			                          Student student=new Student();
			                          student.setSid(rs.getString("sid"));
			                          student.setSname(rs.getString("sname"));
			                          student.setSaddr(rs.getString("saddr"));
			                          return student;
		 							});
		if(!list.isEmpty())
			std=list.get(0);
		return std;
	}

	@Override
	public String delete(String sid) {
		String status="";
		 Student std=search(sid);
		 if(std==null)
		 {
			 status="Student Not Existed";
		 }
		 else
		 {
			 int check=jdbcTemplate.update("delete from student where sid='"+sid+"'");
			 if(check==1)
				 status="Student Deletion Sucess";
			 else
				 status="Student Deletion Failure";
		 }
		return status;
	}

	@Override
	public String update(Student std) {
		int check=jdbcTemplate.update("update student set sname='"+std.getSname()+"',saddr='"+std.getSaddr()+"' where sid='"+std.getSid()+"'");
		if(check==1)
			return "Student Updation Sucess";
		else
			return "Student Updation Failure";
	}

}
