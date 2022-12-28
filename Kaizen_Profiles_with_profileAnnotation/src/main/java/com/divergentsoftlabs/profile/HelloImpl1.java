package com.divergentsoftlabs.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("h1")
public class HelloImpl1 implements Hello {
	
 @Override
 public String hello() {
	return "HelloImpl1";	
  }
}
