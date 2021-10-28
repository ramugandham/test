package com.ramu.java18features;

import java.util.function.Predicate;
//1st way
class PredicateIMPL implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		boolean status=true;
		if(t==10) {
			System.out.println("equal");
			status=true;
		}
		else {
			System.out.println("not equal");
			status=false;
		}
		return status;
	}
	
}

public class PredicateTestFI {

	public static void main(String[] args) {
		Predicate<Integer> predicate=new PredicateIMPL();
		predicate.test(20);
		//2nd way lambda exp
		Predicate<Integer> predicate1=(a)->{ boolean status1=false;
		if(a==10) {
			System.out.println("equal");
			status1=true;
		}
		else {
			System.out.println("not equal");
			status1=false;
		}
		return status1;
	};
	
		System.out.println( predicate1.test(10));	
		
		

	}

}
