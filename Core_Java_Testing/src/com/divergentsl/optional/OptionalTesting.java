package com.divergentsl.optional;

import java.util.Optional;

public class OptionalTesting {
  public static void main(String[] args) {
   
	  Student std=new Student(1,"Aayush");
	  
	  Optional<Object> o=Optional.empty();
	  System.out.println(o);
	  
	  Optional<Student> o1=Optional.of(std);
	  System.out.println(o1);
	  
	  Optional<String> o2=Optional.of(std.getSname());
	  System.out.println(o2);
	  
	  
	  Student std1=new Student(2,null);
	  
	  Optional<String> o4=Optional.ofNullable(std1.getSname());
	  System.out.println(o4);
	  
	  Optional<String> o3=Optional.of(std1.getSname());
	  System.out.println(o3);
	  
	  

 }
}
