package com.kaizen.spring_env_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class App {
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	ConfigurableEnvironment environment = context.getEnvironment();
    	//System.out.println(environment.getProperty("spring.profiles.active"));
    	environment.setActiveProfiles("production");
    	context.register(Development.class, Production.class, DefaultData.class);
    	//DatabaseConfig databaseConfig = context.getBean(DatabaseConfig.class);
    	//databaseConfig.setup();
//    	DefaultData defaultData = context.getBean(DefaultData.class);
//    	defaultData.setup();    	
//    	Development development = context.getBean(Development.class);
//    	development.setup();
    	Production production = context.getBean(Production.class);
    	production.setup();
//    	Development development = context.getBean(Development.class);
//    	development.setup();
    	
//    	Person person = context.getBean(Person.class);
//    	System.out.println(person.getType());
    	
//    	System.out.println("Active Profiles Name: " +Arrays.deepToString(environment.getActiveProfiles()));
    	//context.refresh(); 	
    }
}
