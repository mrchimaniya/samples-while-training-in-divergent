package com.divergentsoftlabs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.divergentsoftlabs.model.Car;
import com.divergentsoftlabs.repo.CarRepo;

@RestController
public class Home {
 
      @Autowired
      private CarRepo carRepo;
	
	  @GetMapping("car")
	  public Optional<Car> getCar(@RequestParam int id)
	  {
		  Optional<Car> car = carRepo.findById(id);
		  return car;
	  }
}
