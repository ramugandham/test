package com.ramu.java.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Rmv_dup_FindmissingNum {

	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(2);
		l.add(10);
		l.add(2);
		l.add(4);
		l.add(20);
		l.add(3);
		/*
		 * TreeSet t=new TreeSet<>(l); System.out.println(t);
		 */
		/*
		 * TreeSet t=new TreeSet<>(); for(Object ab:l) { //t.add(ab); t.addAll(l);
		 * System.out.println(t); }
		 */
		TreeSet t=new TreeSet<>(l);
		ArrayList l1 = new ArrayList<>(t);
		Integer fst = (Integer) l1.get(0);
		Integer lst=(Integer) l1.get(l1.size()-1);
		for(int i=(int) l1.get(0);i<lst;i++) {
			System.out.println(i);
		}
		System.out.println(fst);
		System.out.println(lst);
		
	}

}
