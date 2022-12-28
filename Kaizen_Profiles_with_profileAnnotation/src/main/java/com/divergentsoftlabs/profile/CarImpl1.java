package com.divergentsoftlabs.profile;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("c1")
public class CarImpl1 implements InitializingBean, Car {

	@Override
	public String getCar() {
		return "Polo";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("this is from c1");
	}
}
