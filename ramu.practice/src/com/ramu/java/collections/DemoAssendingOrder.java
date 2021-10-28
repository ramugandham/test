package com.ramu.java.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class DemoAssendingOrder {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList<>();
        l.add("java");
        l.add("python");
        l.add("selenium");
        l.add("dotnet");
        TreeSet ts=new TreeSet<>(l);
       /* Iterator itr=ts.iterator();
        while(itr.hasNext()) {
     	   String str =(String) itr.next();
     	   System.out.println(str);
        }*/
      for(Object ab:ts) {
     	
     		
     		System.out.println("is work: "+ab);
     	
      }
        
	}

}
