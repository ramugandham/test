package com.ramu.java18features;

import java.util.function.Consumer;

class Consumerimpl implements Consumer<Integer>{
//1st way
	@Override
	public void accept(Integer a) {
		System.out.println("consumer interface;"+a);
	}
	
 }
public class ConsumerINExmple {

	public static void main(String[] args) {
		Consumer<Integer> Consumer = new Consumerimpl();
       Consumer.accept(28);
       //2nd way lambda exp
       Consumer<Integer> Consumer1=(a)->{System.out.println("values of:"+a);};
       Consumer1.accept(24);
       
       
	}

}
