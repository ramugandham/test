
package com.ramu.javapractice;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		//print numbers
		for (int i = 0; i <num; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(+j+"  ");
			}
			System.out.println();
		}

	}

}
