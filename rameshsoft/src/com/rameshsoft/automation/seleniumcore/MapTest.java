package com.rameshsoft.automation.seleniumcore;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
public static void main(String[] args) {
	
	LinkedHashMap map = new LinkedHashMap<>();
	map.put("hello", "plz practice");
	map.put(1, 123);
	map.put("job", 456789);
	map.put(123.456, "JAVA");
	
	map.put(12, "JAVA");
	
	map.put("1", "selenium");
	
	System.out.println(map);
	
	System.out.println(map.get("1"));//selenium
	System.out.println(map.get("123456"));//null
	System.out.println(map.getOrDefault("123456", "123456789"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
