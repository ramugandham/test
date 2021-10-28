package com.ramu.java18features;

public final class CustomImmutableTest {
	private int rollno;
	private String instname;
	CustomImmutableTest(int rollno,String instname){
		this.rollno=rollno;
		this.instname=instname;
	}

	public int getRollno() {
		return rollno;
	}

	public String getInstname() {
		return instname;
	}
	
	public static void main(String[] args) {
		CustomImmutableTest CTest=new CustomImmutableTest(2, "ramu");
		System.out.println(CTest.getRollno());
		System.out.println(CTest.getInstname());
		
	}


	
}
