package com.ramu.javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//duplicate of word in string
public class DuplicatesWordsofString {
	public static void DuplicatesWordsString(String str) {
		Map<String, Integer> map = new HashMap<>();
		String[] s = str.split(" ");
		for (String s1 : s) {
			if (map.containsKey(s1)) {
				map.put(s1, map.get(s1) + 1); 
			} else {
				map.put(s1, 1);
			}
		}
		Set<String> keys = map.keySet();
		for (String s2 : keys) {
			if (map.get(s2) > 1) {
				System.out.println(s2 + "   " + map.get(s2));
			}
		}

	}

	public static void main(String[] args) {
		DuplicatesWordsString("java selenium java selenium java");

	}

}
