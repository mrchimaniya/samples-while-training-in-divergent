package com.kaizen.spring_env_example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration 
@Profile("development")
public class Development {
	
	@Autowired
	Environment env;
	
	public void setup() {

		//System.out.println(env.getProperty("spring.profiles.active"));
		System.out.println("Setting up datasource for DEV environment. ");
		System.out.println("Active Profiles Name: " +Arrays.deepToString(env.getActiveProfiles()));
	}
}
