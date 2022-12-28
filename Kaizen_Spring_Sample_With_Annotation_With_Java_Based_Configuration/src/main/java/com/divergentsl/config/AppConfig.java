package com.divergentsl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.divergentsl.bean.Country;

@Configuration
public class AppConfig {

	@Bean
	public Country getCountry()
	{
		return new Country("America","Washington");
	}
}
