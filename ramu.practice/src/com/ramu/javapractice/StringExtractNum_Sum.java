 package com.ramu.javapractice;

public class StringExtractNum_Sum {

	public static void main(String[] args) {
		String s="ramu1223 ram23";
		char[] ch=s.toCharArray();
		int sum=0;
		for(Character c:ch) {
			if(Character.isDigit(c)) {
				sum=sum+Character.getNumericValue(c);
			}
		}
         System.out.println(sum);
	}

}
