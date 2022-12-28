package com.divergentsl.learncodewithdurgesh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LearnCode {
  public static void main(String[] args) {
    List<Integer> list=new ArrayList<>();
    for(int i=1; i<=10; i++)
    	list.add(i);
    System.out.println(list);
    
    List<Integer> list2 = list.stream().filter(i->i<=5).collect(Collectors.toList());
    System.out.println(list2);
    
    list2=list.stream().map(i->i+=5).collect(Collectors.toList());
    System.out.println(list2);
    
    list.stream().forEach(i->System.out.println(i+=10));
    System.out.println(list);
 
    }
  
}
