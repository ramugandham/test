package com.ramu.java18features;

interface atm
{
	void balenq();
	void pinchng();
	void cashwithdra();
	default void cashdeposite() {
		System.out.println("to allow new feature for deposite");
	}
}
class sbi implements atm{

	@Override
	public void balenq() {
		System.out.println("balenq");
		
	}

	@Override
	public void pinchng() {
		System.out.println("pinchng");
		
		
	}

	@Override
	public void cashwithdra() {
		System.out.println("cashwithdra");
		
		
	}
	
}
class icic implements atm{

	@Override
	public void balenq() {
		// TODO Auto-generated method stub
		System.out.println("balenq");
	}

	@Override
	public void pinchng() {
		// TODO Auto-generated method stub
		System.out.println("pinchng");
	}

	@Override
	public void cashwithdra() {
		// TODO Auto-generated method stub
		System.out.println("cashwithdra");
		
	}
	
}



public class DefaultmethodTest {

	public static void main(String[] args) {
		sbi sbi=new sbi();
		sbi.balenq();
		sbi.pinchng();
		sbi.cashwithdra();
		sbi.cashdeposite();
	}

}
