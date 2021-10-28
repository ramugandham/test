package com.ramu.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegExUtility {
	
	public static boolean isValidPhNum(String target)
	{
		boolean status = true;
		String input = "(0|[+]?91)?[6-9][0-9]{9}";
		
		Pattern pattern = Pattern.compile(input);
		Matcher matcher = pattern.matcher(target);
		
		if (matcher.find()&&matcher.group().equalsIgnoreCase(target)) {
			System.out.println("Valid Mobile Num");
		}
		else{
			System.out.println("Invalid Mobile Num");
			status = false;
		}
		return status;	
	}
public static void main(String[] args) {
	System.out.println(isValidPhNum("1234567899"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
