package com.ramu.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class AscendingOrder {

	public static void main(String[] args) {
		int[]a= {12,45,12,30,45,50,60};
             TreeSet<Integer>treeSet=new TreeSet<>();
             for(int i:a) {
            	treeSet.add(i);
             }
             System.out.println(treeSet);
             System.out.println("**********");
		Arrays.sort(a);
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println("**********");
		List<Integer>list=new ArrayList<>();
		for(int i:a) {
			list.add(i);
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
