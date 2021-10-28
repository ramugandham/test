package com.corejavainreviewspgrms;

public class Factorials {

	public static void main(String[] args) {
      int num=8;
      int  fact=1;
      for(int i=1;i<=num;i++) {
    	  fact=fact*i;
      }
      System.out.println("factorial is:"+num+" "+fact);
	}

}