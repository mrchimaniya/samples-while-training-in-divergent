package com.divergentsl.bean;

public class Country {
    private String name;
    private String state;
    
    public Country() {
		// TODO Auto-generated constructor stub
	}
 
    public Country(String name, String state) {
        this.name = name;
        this.state = state;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
 
}