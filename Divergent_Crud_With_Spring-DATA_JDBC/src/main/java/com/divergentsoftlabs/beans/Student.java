package com.divergentsoftlabs.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

public class Student implements Persistable<String> {
  
  @Id
  private String sid;
  private String sname,saddr;
  
  public static boolean isNew=false;

	public String getSid() {
		return sid;
	}
	
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getSaddr() {
		return saddr;
	}
	
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	@Override
	public String getId() {
		return sid;
	}

	@Override
	public boolean isNew() {
		return isNew;
	}
	  
}
