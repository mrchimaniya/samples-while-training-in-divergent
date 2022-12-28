package com.divergentsl.refernce.method;

public class Stuff {
   public static void doStatic()
   {
	   System.out.println("Static Method Without Return Value");
   }
   
   public void doInstance()
   {
	   System.out.println("Instance Method Without Return Value");
   }
   
   public static String doStaticValue(String str)
   {
	   return str;
   }
   
   public String doInstanceValue(String str)
   {
	   return str;
   }
}
