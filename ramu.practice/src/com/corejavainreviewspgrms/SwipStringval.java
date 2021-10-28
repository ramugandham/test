package com.corejavainreviewspgrms;

public class SwipStringval {

	public static void main(String[] args) {
		String a="hello";
		String b="java";
		System.out.println(a+"...before swipe values... "+b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+"...after swipe values... "+b);

	}

}
