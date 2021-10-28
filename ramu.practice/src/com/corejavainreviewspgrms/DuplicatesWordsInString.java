package com.corejavainreviewspgrms;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesWordsInString {

	public static void duplicatesWords(String inputstring) {
		// splite word
		String[] words = inputstring.split(" ");
		// create on hashmap
		HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
		// to cheack each word in given array
		for (String word : words) {
			// word is prsnt or not
			if (wordcount.containsKey(word)) {
				wordcount.put(word, wordcount.get(word) + 1);
			} else {
				wordcount.put(word, 1);
			}
		}
		// extracts all keys of map in wordcount
		Set<String> wordInString = wordcount.keySet();
		// loop all words in wordcount
		for (String word : wordInString) {
			if (wordcount.get(word) > 1) {
				System.out.println(word + " " + wordcount.get(word));

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicatesWords("hi hello java hi java hi selenium");
	}

}
