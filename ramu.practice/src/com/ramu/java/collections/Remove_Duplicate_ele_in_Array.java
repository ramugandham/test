package com.ramu.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Remove_Duplicate_ele_in_Array {

	public static void main(String[] args) {

		int[] a = { 1, 2,3,4,3,5,4,5,6,4,5,6,7,8,7,9};
		List dup = new ArrayList<>();
		TreeSet t = new TreeSet<>(dup);
		for (int i : a) {
			boolean b = t.add(a[i]);

			if (b) {
				System.out.println("  ");
			} else {
				dup.add(a[i]);
			}

		}
		System.out.println("after remove dup;" + t);
		System.out.println("no of dup ele ;" + dup);
		/*System.out.println("minimum no is;"+t.first() );
		System.out.println("maximum no is:"+t.last());
*/
		List dup1 = new ArrayList<>(t);
		System.out.println(dup1.get(0));
		System.out.println(dup1.get(dup1.size()-1));
		
	}
}
