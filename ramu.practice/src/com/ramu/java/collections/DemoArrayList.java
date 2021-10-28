package com.ramu.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoArrayList {

	public static void main(String[] args) {

		ArrayList<Object> l = new ArrayList<Object>();

		l.add(1);
		l.add("hello");
		l.add("how are you");
		l.add("i am fine");
		l.add("hello");
       
		System.out.println(l);
		l.remove("hello");
		l.remove(3);
		System.out.println(l);
		ArrayList l1 = new ArrayList<>();
		l1.addAll(l);
		l1.add("java");
		System.out.println(l1);
		// l1.removeAll(l1);
		System.out.println(l1.get(1));
		System.out.println(l1.toArray());
		System.out.println(l1.size());
		System.out.println(l1.contains("java"));
		System.out.println(l1.containsAll(l));
		l1.clear();
		System.out.println(l1);
	}
}