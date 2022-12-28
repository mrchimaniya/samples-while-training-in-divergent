package com.divergentsoftlabs.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.divergentsoftlabs.entity.User;
import com.divergentsoftlabs.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user=userRepository.findByUsername(username);
		
		/*user.orElseThrow( ()-> new UsernameNotFoundException("Not Found: "+username) );
		
		return user.map(MyUserDetails::new).get();*/
		            if(user.get()==null)
					{
					  throw new UsernameNotFoundException("Not Found: "+username);
					}
					else
					{
						User u=user.get();
						return new MyUserDetails(u);
					}
	}

}
