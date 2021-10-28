package com.corejavainreviewspgrms;

public class ArmStrongNumber {
	//153=1*1*1*+5*5*5+3*3*3=1+125+27=153; 0, 1, 153, 370, 371, 407
	public static void isArmstrongNumber(int num) {
		System.out.println("given Numberis:"+num);
		int cube=0;
		int r;
		int t;
		t=num;
		 
		while(num>0) {
			r=num%10;
			num=num/10;
			//cube=cube+(r);
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("is armstrong num");
		}
		else {
			System.out.println("is not armstrong num");
		}
		
	}

	public static void main(String[] args) {
		
		isArmstrongNumber(407);

	}

}
