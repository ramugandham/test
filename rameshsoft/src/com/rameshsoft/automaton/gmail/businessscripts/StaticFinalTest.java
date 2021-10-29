package com.rameshsoft.automaton.gmail.businessscripts;

public class StaticFinalTest {
int a;
static String name = "JAVA";

public static void main(String[] args) {
	
	StaticFinalTest s1 = new StaticFinalTest();
	System.out.println(s1.name);
	StaticFinalTest s2 = new StaticFinalTest();
	s2.name = "selenium";
	StaticFinalTest s3 = new StaticFinalTest();
	
	StaticFinalTest s4 = new StaticFinalTest();
}
}
