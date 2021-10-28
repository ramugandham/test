package com.ramu.java18features;

import java.util.Optional;
//avoid null pointer exception only isnullable&of(); only
public class OptionalTest {

	public static void main(String[] args) {
		String s=null;
		//Optional<String> optional=Optional.of(s);// not accept null values
		Optional<String> optional=Optional.ofNullable(s);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		else {
			System.out.println("not  present");
		}
		
		String []s1= {"java",null,"selenium"};
		for(int i=0;i<s1.length;i++) {
			Optional<String> optiona2=Optional.ofNullable(s1[i]);
			if(optiona2.isPresent()) {
				System.out.println(optiona2.get().toUpperCase());
			}
			else {
				System.out.println("not  present");
			}
		}
		

	}

}
