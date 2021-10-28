package com.ramu.javapractice;

public class EvenOddnum {

	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4,5};
		for(int i=1;i<arr.length;i=i+2) {
			System.out.println("even num ;"+arr[i]);
		}
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println("odd num;"+arr[i]);
		}

	}

}
