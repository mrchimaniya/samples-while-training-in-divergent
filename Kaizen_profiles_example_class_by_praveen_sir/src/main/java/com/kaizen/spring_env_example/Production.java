package com.kaizen.spring_env_example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Profile("production")
public class Production {

	@Autowired
	Environment env;
	
	public void setup() {
		
		if(env.containsProperty("testProfileName")) {
			System.out.println(env.getProperty("testProfileName"));
		}
		//System.out.println(env.containsProperty("testProfileName"));
		
		System.out.println(env.getProperty("JAVA_HOME"));
		System.out.println("Setting up datasource for PROD environment. ");	
		System.out.println("Active Profiles Name: " +Arrays.deepToString(env.getActiveProfiles()));
	}
}
