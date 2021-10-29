package com.rameshsoft.automation.seleniumcore;

import java.util.TreeMap;

public class TMTest {
public static void main(String[] args) {
	
	TreeMap t = new TreeMap<>();
	t.put("hello", "java");
	t.put("java", 1);
	t.put("job", 123456789);
	t.put("123", 123456789);
	System.out.println(t);//{123=123456789, hello=java, java=1, job=123456789}
	
	TreeMap t1 = new TreeMap<>();
	t1.put("hello", "java");
	t1.put("java", "selenium");
	t1.put("job", "easy");
	System.out.println(t1);//{hello=java, java=selenium, job=easy}
	
	TreeMap t2 = new TreeMap<>();
	t2.put("hello", "java");
	t2.put(1, "selenium");
	t2.put("job", "easy");
	System.out.println(t2);//RE: ClassCastException-
	
	
	
	
	
	
	
	
}
}
