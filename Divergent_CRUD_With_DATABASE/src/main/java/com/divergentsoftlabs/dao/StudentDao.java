package com.divergentsoftlabs.dao;

import com.divergentsoftlabs.beans.Student;

public interface StudentDao {
  public String add(Student std);
  public Student search(String sid);
  public String delete(String sid);
  public String update(Student std);
}
