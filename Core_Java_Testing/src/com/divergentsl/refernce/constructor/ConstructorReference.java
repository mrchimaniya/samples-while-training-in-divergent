package com.divergentsl.refernce.constructor;

public class ConstructorReference {
    public static void main(String[] args) {
		
    	/*Student std=new Student();
		std.getStudent();
		
		StudentProvider sp=()->{ return new Student(); };
		sp.provideStudent();
		
		Student s=sp.provideStudent();
		s.getStudent();*/
		
		StudentProvider sp1=Student::new;
		sp1.provideStudent();
	}
}
