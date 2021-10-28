package com.ramu.java.collections;

import java.util.Comparator;

public class Mycomparator implements Comparator {

	@Override
	public int compare(Object a, Object b) {
		int a1=  (int) a;
		int a2=(int) b;
		/*String a1=(String) a.toString();
		String a2=(String) b.toString();*/
		return a2;
		
	}

}
