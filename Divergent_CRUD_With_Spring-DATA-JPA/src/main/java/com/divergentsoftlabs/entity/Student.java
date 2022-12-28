package com.divergentsoftlabs.entity;

import javax.persistence.Entity;  

import lombok.Data;

@Entity
@Data
public class Student{
  
  @javax.persistence.Id
  private String sid;
  private String sname,saddr;
}
