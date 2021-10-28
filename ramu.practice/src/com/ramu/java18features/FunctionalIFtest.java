package com.ramu.java18features;

@FunctionalInterface
interface Practice{
	void job();
	public static void display() {
		System.out.println("practice to get job");
	}
	default void sal() {
		System.out.println("hello");
	}
}
/*//@FunctionalInterface
interface Job extends Practice{
	
	
}*/
class test implements Practice{

	@Override
	public void job() {
		// TODO Auto-generated method stub
		
	}
	
}


public class FunctionalIFtest {

	public static void main(String[] args) {
		Practice p=new test();
		p.job();
		p.sal();
	

	}

}
