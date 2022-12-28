package com.divergentsoftlabs;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.divergentsoftlabs.config.JavaConfig;
import com.divergentsoftlabs.profile.Hello;
import com.divergentsoftlabs.profile.HelloImpl1;
import com.divergentsoftlabs.profile.HelloImpl2;

@SpringBootApplication
public class ProfilesWithProfileAnnotationApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProfilesWithProfileAnnotationApplication.class, args);
       
		
		/*
		 * AnnotationConfigApplicationContext context=new
		 * AnnotationConfigApplicationContext(JavaConfig.class);
		 * context.getEnvironment().setActiveProfiles("h2");
		 * context.register(HelloImpl1.class,HelloImpl2.class); Hello
		 * h=context.getBean(Hello.class); System.out.println(h.hello());
		 * 
		 * Environment e=context.getEnvironment();
		 * System.out.println(e.containsProperty("TMP")); //environment variable
		 * property System.out.println(e.getProperty("TEMP")); //same
		 * 
		 * System.out.println(e.getProperty("name"));
		 * 
		 * context.close();
		 */
	}

}
