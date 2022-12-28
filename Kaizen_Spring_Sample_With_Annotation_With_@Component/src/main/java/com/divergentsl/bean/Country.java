package com.divergentsl.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Country")
public class Country {
	
	@Value("India")
    private String name;
	
	@Value("M.P.")
    private String state;
    
    public Country() {
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