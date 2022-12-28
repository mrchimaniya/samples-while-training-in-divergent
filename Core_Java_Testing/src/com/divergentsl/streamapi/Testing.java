package com.divergentsl.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testing {
  public static void main(String[] args) {
    
	  List<Integer> list1=List.of(1,2,3,4,5);
	  System.out.println(list1);
	  
	  List<String> list2=new ArrayList<>();
	  list2.add("Aayush");
	  list2.add("Deepa");
	  list2.add("Maani");
	  list2.add("Ram");
	  System.out.println(list2);

	  List<Integer> list3=Arrays.asList(6,7,8,9,10);
	  System.out.println(list3);
	  
	  List<Integer> list4=list1.stream().filter(i-> i<4).collect(Collectors.toList());
	  System.out.println(list4);
	  
	  List<Integer> list5=list1.stream().map(i-> i*i).collect(Collectors.toList());
	  System.out.println(list5);
	  
	  list1.stream().map(i->i*i*i).forEach(System.out::print);
	  System.out.println();
	  list1.stream().map(i->i*i*i).forEach((t -> System.out.print(t+" ")));
	  
	  
	  System.out.println();
	  List<Integer> list6=list3.stream().sorted().collect(Collectors.toList());
	  System.out.println(list6);
	  
	  Integer i=list3.stream().max((o1, o2) -> o1.compareTo(o2)).get();
	  System.out.println(i);
	  
	  Stream s=Stream.empty();
	  Stream s1=Stream.builder().build();
	  
	  
 }
}
