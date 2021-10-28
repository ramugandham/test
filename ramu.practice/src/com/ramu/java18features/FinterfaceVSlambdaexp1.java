package com.ramu.java18features;

interface One{
	void job();
}
//1st way
class Two implements One{

	@Override
	public void job() {
		System.out.println("functional interface");
	}
}
//2nd way using lambda exp
public class FinterfaceVSlambdaexp1 {
	public static void main(String[] args) {
		//1st
		One one=new Two();
		one.job();
       //2nd way
		One one1= ()-> {System.out.println("hi");};
		one1.job();
		
		
	}

}
