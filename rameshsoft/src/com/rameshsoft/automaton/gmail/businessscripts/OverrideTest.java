package com.rameshsoft.automaton.gmail.businessscripts;

class A
{
	public void hello() {
		System.out.println("Hello:A");
	}
}
class B extends A
{
	public void hello() {
		System.out.println("Hello:B");
	}
}
public class OverrideTest {
public static void main(String[] args) {
	
	A a = new B();
	a.hello();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
