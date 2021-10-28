package com.ramu.javapractice;

public class FactorialTest {

	public static void main(String[] args) {
		int num=7;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
         System.out.println("  factorial num is  " + num  + "  its result is  "+ fact);
	}

}
