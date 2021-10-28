package com.corejavainreviewspgrms;

import java.util.Arrays;

public class Largest_SmallestNum_In_Array {

	public static void main(String[] args) {
	int numbers[]= {-2,0,4,8,-9,10,200,-55};
	int largest=numbers[0];
	int smallest=numbers[0];
	for(int i=1;i<numbers.length;i++) {
		if(numbers[i]>largest) {
			largest=numbers[i];
		}
		else if(numbers[i]<smallest) {
			smallest=numbers[i];
			
		}
	}
	System.out.println("\ngiven array elements;"+Arrays.toString(numbers));
	System.out.println("largest elements;"+largest);
	System.out.println("smallest array elements;"+smallest);
	}

}
