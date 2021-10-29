package com.rameshsoft.automaton.gmail.businessscripts;

interface Family
{
	void parents();
	void brothers();
	void sisters();
	default void marriage()
	{
		System.out.println("Marriage");
	}
	public static void greetings()
	{
		System.out.println("IT IS READ ONLY BUT NOT WRITE");
	}
}
class FamilyImpl implements Family
{
	@Override
	public void parents() {
		System.out.println("PARENTS");
	}
	@Override
	public void brothers() {
		System.out.println("BROTHERS");
	}
	@Override
	public void sisters() {
		System.out.println("SISTERS");
	}
	@Override
	public void marriage()
	{
		System.out.println("My own implementations");
	}
}
public class EnhancecInterfaceTest {
public static void main(String[] args) {
	
FamilyImpl imp = new FamilyImpl();
imp.marriage();
Family.greetings();
	
	Family a = new FamilyImpl();
	a.marriage(); //default method
	
	
	
	
	
	
	
	
}
}
