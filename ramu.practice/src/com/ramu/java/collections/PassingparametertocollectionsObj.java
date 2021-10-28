package com.ramu.java.collections;

import java.util.ArrayList;
import java.util.List;

public class PassingparametertocollectionsObj {
	public void login(List<Object>data) {
		data.add(9);
		data.add(10);
		System.out.println(" hi");

	}

	public static void main(String[] args) {
		List l = new ArrayList<>();

		l.add(15);
		l.add(5);
		l.add(25);
		l.add(45);
		System.out.println(l);
		PassingparametertocollectionsObj  p=new PassingparametertocollectionsObj();
		p.login(l);
	}

}
