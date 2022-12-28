package com.kaizen.spring_env_example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.kaizen.spring_env_example")
//@PropertySource("classpath:application.properties")
public class Config {

}
