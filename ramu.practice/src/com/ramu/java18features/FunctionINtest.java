package com.ramu.java18features;

import java.util.function.Function;

public class FunctionINtest implements Function<String, Integer>  {
	//1st way
	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
		
		
	}
	public static void main(String[] args) {
		Function<String, Integer>function=new FunctionINtest();
		Integer length = function.apply("rameshsoft");
		System.out.println(length);
		//2nd way lambda
		Function<String, Integer>function1=(s)->{
			int len = s.length();
			return len;
		};
		Integer len1 = function1.apply("javaselenium");
		System.out.println(len1);
	}

}
