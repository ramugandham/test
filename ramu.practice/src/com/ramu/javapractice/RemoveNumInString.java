package com.ramu.javapractice;

import java.util.ArrayList;
import java.util.List;

public class RemoveNumInString {

	public static void main(String[] args) {
		String s="java1 selenium23 practice4";
		char[] ch=s.toCharArray();
		List<Character>list=new ArrayList<>();
		for(Character c:ch) {
			if(!Character.isDigit(c)) {
				list.add(c);
			}
			
		}
           System.out.println(list);
	}
	
    
}
