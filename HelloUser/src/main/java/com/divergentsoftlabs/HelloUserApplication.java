package com.divergentsoftlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
		System.out.println("Login Application");
	}

}
