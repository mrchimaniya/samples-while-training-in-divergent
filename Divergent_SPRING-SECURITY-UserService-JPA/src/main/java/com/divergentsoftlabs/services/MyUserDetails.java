package com.divergentsoftlabs.services;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.divergentsoftlabs.entity.User;

public class MyUserDetails implements UserDetails {

	private String userName,pass;
	private boolean active;
	private List<GrantedAuthority> authroties;
	
	public MyUserDetails(User user)
	{
		this.userName=user.getUsername();
		this.pass=user.getPass();
		this.active=user.isActive();
		this.authroties=Arrays.stream(user.getRoles().split(","))
				         .map(SimpleGrantedAuthority::new)
				         .collect(Collectors.toList());
				        
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authroties;
	}

	@Override
	public String getPassword() {
		return pass;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return active;
	}

}
