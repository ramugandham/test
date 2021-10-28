package com.ramu.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ArrayList_Assending_order_Desending {

	public static void main(String[] args) {
		// using Collections to perform assending order&desending
		List l = new ArrayList<>();

		l.add(15);
		l.add(5);
		l.add(25);
		l.add(45);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Comparator<Object> c = Collections.reverseOrder();
	      Collections.sort(l,c);
	      System.out.println("Sorted list using Comparator : " + l);
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);

		TreeSet s = new TreeSet<>();
		s.add("abc");
		s.add("pqr");
		s.add("def");
		s.add("xyz");
		System.out.println(s);
		// desending order
		Mycomparator mc = new Mycomparator();
		TreeSet s1 = new TreeSet<>(mc);
		s1.add("abc");
		s1.add("pqr");
		s1.add("def");
		s1.add("xyz");
		System.out.println(s1);

	}

}
