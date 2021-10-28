package com.ramu.java18features;

interface Testdemo{
	public void practice(String s) ;
		
}

public class NonStaticMRtest {
	public void job2(String s) {
		System.out.println("nonstatic method refrence:"+s);
		
	}

	public static void main(String[] args) {
		NonStaticMRtest nonStaticMRtest=new NonStaticMRtest();
		Testdemo testdemo=nonStaticMRtest::job2;
		testdemo.practice("java");
	}

}
