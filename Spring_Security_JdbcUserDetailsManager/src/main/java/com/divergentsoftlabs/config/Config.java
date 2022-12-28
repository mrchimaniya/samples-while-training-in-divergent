package com.divergentsoftlabs.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class Config extends WebSecurityConfigurerAdapter {
 
	/*
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("user123").authorities("user")
		   .and().withUser("admin").password("admin123").authorities("admin")
		   .and().passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	*/
	
	/*
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		InMemoryUserDetailsManager userDetailsManager=new InMemoryUserDetailsManager();
		UserDetails user=User.withUsername("admin").password("admin123").authorities("admin").build();
		UserDetails user1=User.withUsername("user").password("user123").authorities("user").build();
		userDetailsManager.createUser(user);
		userDetailsManager.createUser(user1);
		auth.userDetailsService(userDetailsManager);
	}
	*/
	
	@Bean
	public UserDetailsService getuserDetailsService(DataSource dataSource)
	{
		return new JdbcUserDetailsManager(dataSource);
		//here use default users & authorities table
		//automatically identified username & authorites & password coloumn
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests(
				(requests) -> requests.antMatchers("/account").authenticated()
				                      .antMatchers("/balance").authenticated()
				                      .antMatchers("/main").permitAll()
				                      .antMatchers("/update").permitAll()
				);
		http.formLogin();
		http.httpBasic();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
}
