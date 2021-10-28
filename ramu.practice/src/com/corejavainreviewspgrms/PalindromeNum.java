package com.corejavainreviewspgrms;

public class PalindromeNum {
	// to give num 151 to reverse same number will show
	public static void isPalindromeNum(int num) {
		System.out.println("given Numberis:"+num);
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		isPalindromeNum(190);

	}

}
