package com.ramu.javapractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularexpofCharatString {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("java");
		Matcher matcher=pattern.matcher("java selenium java java");
		int count=0;
		while(matcher.find()) {
			count++;
		}
       System.out.println("no of occurence java is::"+count);
	}

}
