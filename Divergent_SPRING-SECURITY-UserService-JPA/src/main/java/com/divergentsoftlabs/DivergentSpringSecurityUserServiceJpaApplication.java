package com.divergentsoftlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = com.divergentsoftlabs.repository.UserRepository.class)
public class DivergentSpringSecurityUserServiceJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DivergentSpringSecurityUserServiceJpaApplication.class, args);
	}

}
