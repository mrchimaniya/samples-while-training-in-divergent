package com.divergentsl.refernce.method;

public class MethodRefernce {
  public static void main(String[] args) {
	
	  VoidInterface vi=()->System.out.println("Lamda Void");
	  vi.voidValue();
	  
	  VoidInterface vi1=Stuff::doStatic;
	  vi1.voidValue();
	  
	  Stuff st=new Stuff();
	  VoidInterface vi2=st::doInstance;
	  vi2.voidValue();
	  
	  ReturnInterface ri=(s)->{return s;};
	  System.out.println( ri.returnValue("Lamda Return Value"));
	  
	  ReturnInterface ri1=Stuff::doStaticValue;
	  System.out.println( ri1.returnValue("Return Static Value"));
	  
	  Stuff st2=new Stuff();
	  ReturnInterface ri2=st2::doInstanceValue;
	  System.out.println( ri2.returnValue("Return Instance Value"));
	  
  }

}
