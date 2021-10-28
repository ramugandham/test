package com.ramu.java18features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Bifunction_BiconsumerFI {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer=(a,b)->{
			    int res=a+b;
			    System.out.println(res);
		};
		biConsumer.accept(27, 23);

		BiFunction<Integer, Integer, Integer> biFunction=(a,b)->{
			 int res1=a+b;
			 return res1;
			   
		};
		Integer res2 = biFunction.apply(24, 24);
		 System.out.println(res2);
	}

}
