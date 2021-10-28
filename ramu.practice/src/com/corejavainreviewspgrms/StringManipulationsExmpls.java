package com.corejavainreviewspgrms;

public class StringManipulationsExmpls {

	public static void main(String[] args) {
		String str="hello java selenium java selectj";
		String str1="hello Java selenium java Selectj";
		System.out.println(str.length());//length 31
		System.out.println(str.charAt(4));//o
		System.out.println(str.indexOf('j'));//j char position 6
		System.out.println(str.indexOf('j', str.indexOf('j')+1));//to find 1st j position and 2nd j position
		System.out.println(str.indexOf("java"));//position of word strats
		System.out.println(str.indexOf("testing"));//testing is not in str but o/p is -1
		System.out.println(str.equals(str1));//case sensitive its false , caps letters in str
		System.out.println(str.equalsIgnoreCase(str1));//true only its cheacks letters same or not
		System.out.println(str.substring(0, 4));//hell
		String s="  java selenium   ";
		System.out.println(s.trim());//java selenium to remove spaces in 1st&last
		
		System.out.println(s.replace(" ", ""));//remove middle spaces in word javaselenium
		String date="01-02-1993";
		System.out.println(date.replace("-", "/"));//01/02/1993
		
		String s1="java_selenium_testing";
		String[] val = s1.split("_");
		for(int i=0;i<val.length;i++) {
		System.out.println(val[i]);//remove the _ symbols
		
		}
		String s2="java selenium";
		System.out.println(s2.concat("nnn"));//add str in nnn
		
		String x="testing";
		String y="selenium";
		int a=100;
		int b=200;
		System.out.println(x+y);   //testingselenium
		System.out.println(a+b);   // 300
		System.out.println(a+b+x+y);// 300testingselenium

		System.out.println(x+y+a+b);//testingselenium100200
		System.out.println(x+y+(a+b));//testingselenium300     
	}                          
                                        
		
		

}
