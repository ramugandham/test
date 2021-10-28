package com.ramu.javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// using api
		String str = "ramu";
		StringBuffer stringBuffer = new StringBuffer(str);
		String rev = stringBuffer.reverse().toString();
		System.out.println("before reverse string    "+str);
		System.out.println("after reverse string    "+rev);
		//with out api
		String str1="selenium";
		String rev1=" ";
		for(int i=str1.length()-1;i>=0;i--) {
			rev1=rev1+str1.charAt(i);
		}
		System.out.println("before reverse string    "+str1);
		System.out.println("after reverse string    "+rev1);
		//using collections
	       String str2="practice";
	       char[] ch = str2.toCharArray();
	       List<Character>list=new ArrayList<>();
	       for(char c:ch) {
	    	   list.add(c); 
	       }
	       Collections.reverse(list);
	       for(char c:list) {
	    	   System.out.print(c);
	       }
	}
	
}
