package com.ramu.javapractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[]a= {12,45,12,30,45,50,60};
      Set<Integer>set=new HashSet();
      Arrays.sort(a);
      for(int i:a) {
    	  set.add(i);
    	         }
      System.out.println(set);
	}
	


}
