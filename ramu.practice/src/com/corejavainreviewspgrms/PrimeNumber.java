package com.corejavainreviewspgrms;

public class PrimeNumber {
	
	//reminder value is 1 to get prime number
	public static boolean isPrimeNum(int num) {
		if(num<=1) {
		return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	 
	public static void getPrimeNum(int num) {
		for(int i=2;i<num;i++) {
			if(isPrimeNum(i)) {
				System.out.println(i +"  ");
			}
	   }
	}	

	public static void main(String[] args) {
		System.out.println(isPrimeNum(7));
		getPrimeNum(60);

	}

}
