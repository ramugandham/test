package com.ramu.java18features;

import java.util.function.Supplier;

public class SupplierTestIN implements Supplier<Double> {
//1st way
	@Override
	public Double get() {
		double d = Math.random();
		return d;
	}

	public static void main(String[] args) {
		Supplier<Double>supplier=new SupplierTestIN();
		 System.out.println(supplier.get());
		//2nd way lambda exp
		 Supplier<Double> supplier2=()->{
			 return Math.random();
		 };
		 System.out.println("hi:"+supplier2.get());
		 
	}

}
