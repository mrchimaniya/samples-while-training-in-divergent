package com.divergentsoftlabs.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("h2")
public class HelloImpl2 implements Hello {
	
 @Override
 public String hello() {
	return "HelloImpl2";	
  }
}
