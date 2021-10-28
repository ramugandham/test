
package com.ramu.javapractice;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
	}

}
