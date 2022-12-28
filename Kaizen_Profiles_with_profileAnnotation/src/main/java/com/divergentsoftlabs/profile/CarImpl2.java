package com.divergentsoftlabs.profile;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("c2")
public class CarImpl2 implements Car, InitializingBean{

	@Override
	public String getCar() {
		return "Swift";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("this is from c2");
	}
	
	

}
