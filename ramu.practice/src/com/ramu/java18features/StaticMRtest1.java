package com.ramu.java18features;

import java.util.function.BiFunction;

public class StaticMRtest1 {
	
	public static int add(int a,int b) {
		int res=a+b;
		return res;
		
	}

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>biFunction=StaticMRtest1::add;
		Integer res1 = biFunction.apply(100, 125);
		System.out.println(res1);

	}

}
