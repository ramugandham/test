package com.corejavainreviewspgrms;

public class RemoveSplCharAtString_Junk_RegularExp {

	public static void main(String[] args) {
		String s="@#ramu$%JAVA*&1223 gandham";
		s=s.replaceAll("[^a-zA-Z0-9]","");//only prints letters&num
		/*s=s.replaceAll("[^a-z]","");//only print small letters
		s=s.replaceAll("[^A-Z]","");//only print cap letters
		s=s.replaceAll("[^0-9]","");//only print num
		/s=s.replaceAll("[a-zA-Z0-9]","");//only splchar print*/
		 
		 		System.out.println(s);

	}

}
