package com.ramu.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FindMissingNum {

	public static void main(String[] args) {
		int[] ab = { 6, 9, 3, 1 };
		System.out.println(ab.length);
		TreeSet<Integer> ts = new TreeSet<>();
		for (Integer i : ab) {
			ts.add(i);
		}
		Arrays.sort(ab);
		List<Integer> missingNum = new ArrayList<>();
		for (int i = ab[0]; i < ab[ab.length - 1]; i++) {
			boolean b = ts.add(i);
			if (b) {
				missingNum.add(i);
			}
		}
		System.out.println("missing number are:" + missingNum);
	}

}
