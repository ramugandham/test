package com.rameshsoft.automaton.gmail.businessscripts;

import java.math.MathContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		
		String target = "ABhellojava$ practice1 jav2a$ selenium java";
		
		Pattern pattern = Pattern.compile("java");
		Matcher matcher = pattern.matcher(target);
		
		int count = 0;
		while(matcher.find())
		{
			count++;
			//System.out.println(matcher.group());
		}
		
		System.out.println("Noof occurences of char a is: " +count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
