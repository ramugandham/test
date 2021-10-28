package com.corejavainreviewspgrms;

public class ReverseNum {

	public static void main(String[] args) {
		//1st way allgarithm
		int num=12345324;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
           System.out.println(rev);
          //2nd way string buffer  
           int num1=235648;
           System.out.println(new StringBuffer( String.valueOf(num1)).reverse());
          
           
	}

}
