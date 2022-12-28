package com.divergentsoftlabs.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.divergentsoftlabs.entity.Customer;
import com.divergentsoftlabs.repo.CustomerRepo;

@Service
public class CustomAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		UsernamePasswordAuthenticationToken authenticationToken=null;
		
		String email=authentication.getName();
		String password=authentication.getCredentials().toString();
		
		List<Customer> list= customerRepo.findByEmail(email);
		if(!list.isEmpty())
		{   Customer customer=list.get(0);
			if(email.equals(customer.getEmail()) && BCrypt.checkpw(password, customer.getPwd() ))
			{
				Collection<GrantedAuthority> grantedAuthorities=getGrantedAuthorities(customer);
				authenticationToken=new UsernamePasswordAuthenticationToken(
						new org.springframework.security.core.userdetails.User(email,password,grantedAuthorities),password,grantedAuthorities
						);
			}
			else
			{
				throw new UsernameNotFoundException("Email :"+email+" Not Found");
			}
		}
		return authenticationToken;		
	}
	
	private Collection<GrantedAuthority> getGrantedAuthorities(Customer customer)
	{
		Collection<GrantedAuthority> grantedAuthorities=new ArrayList<>();
		if(customer.getRole().equals("admin"))
		{
			grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		}
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return grantedAuthorities;
	}
	
	    @Override
	    public boolean supports(Class<?> authentication) {
	        return authentication.equals(UsernamePasswordAuthenticationToken.class);
	        }

}
