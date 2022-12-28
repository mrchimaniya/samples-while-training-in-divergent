package com.divergentsoftlabs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divergentsoftlabs.model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
  
}
