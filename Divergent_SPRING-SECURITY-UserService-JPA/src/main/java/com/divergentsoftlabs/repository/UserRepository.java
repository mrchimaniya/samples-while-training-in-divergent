package com.divergentsoftlabs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divergentsoftlabs.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
   
	Optional<User> findByUsername(String userName);
}
