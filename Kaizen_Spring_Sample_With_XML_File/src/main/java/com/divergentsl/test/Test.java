package com.divergentsl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divergentsl.bean.Country;

public class Test {
  public static void main( String[] args )
	    {
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        
	        Country country = (Country)context.getBean("country");
	        String name = country.getName();
	        System.out.println("Country name: "+name);
	        String state = country.getState();
	        System.out.println("Country state: "+state);
	        System.out.println("XML configuration");
	    }

}
