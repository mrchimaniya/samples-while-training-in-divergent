package com.divergentsoftlabs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divergentsoftlabs.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    
	List<Customer> findByEmail(String email);
	
}
