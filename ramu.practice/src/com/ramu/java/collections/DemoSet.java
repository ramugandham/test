package com.ramu.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		// insertion order is not preserved
		HashSet hs=new HashSet<>();
		hs.add(9);
		hs.add(1);
		hs.add(5);
		hs.add("ABC");
		hs.add("XYZ");
		hs.add("PQR");
		System.out.println(hs);
	/*Iterator it = hs.iterator();
	while(it.hasNext()) {
		 Object st = it.next();
		System.out.println(st);
	}*/
		for(Object ob:hs) {
			System.out.println(ob);
		}
		
		
		LinkedHashSet hs1=new LinkedHashSet<>();
		// insertion order is preserved
		hs1.add(9);
		hs1.add(1);
		hs1.add(5);
		hs1.add("ABC");
		hs1.add("XYZ");
		hs1.add("PQR");
		System.out.println(hs1);
		// insertion order is not preserved &assending order is defaults
		
		TreeSet hs2=new TreeSet<>();
		hs2.add("ABC");
		hs2.add("XYZ");
		hs2.add("PQR");
		/*hs2.add(9);
		hs2.add(1);
		hs2.add(5);*/
		System.out.println(hs2);
	}

}
