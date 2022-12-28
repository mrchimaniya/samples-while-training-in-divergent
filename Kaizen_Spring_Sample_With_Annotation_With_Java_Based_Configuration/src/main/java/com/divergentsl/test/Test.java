package com.divergentsl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divergentsl.bean.Country;
import com.divergentsl.config.AppConfig;

public class Test {
  public static void main( String[] args )
	    {
	         ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	         Country country=context.getBean(Country.class);
	         String name = country.getName();
	        System.out.println("Country name: "+name);
	        String state = country.getState();
	        System.out.println("Country state: "+state);
	        System.out.println("Java Based Configuration");
	    }

}
