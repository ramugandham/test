package com.ramu.javapractice;

import java.util.Date;

public class StringCurntData_Year {

	public static void main(String[] args) {
		String s="11 06 2019";
		String year=s.substring(6, 10);
		Date date=new Date();
		int curYear=date.getYear();
		Integer expectedyear=Integer.parseInt(year);
		System.out.println(curYear+"   "+expectedyear);
		

	}

}
