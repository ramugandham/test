package com.ramu.javapractice;

import java.util.Scanner;

public class Number_positive_negitive {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
       double num = scanner.nextDouble();
       if(num>=0.0) {
    	   System.out.println("Number"+num+"is +ve");
       }
       else if(num<=0.0) {
    	   System.out.println("Number"+num+"is -ve");
       }
       
	}

}
