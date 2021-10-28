package com.ramu.java18features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamExamples {

	public static void main(String[] args) {
		// 1st way
		String[] s={"hi","hello","java"};
		Stream<String> stream = Arrays.stream(s);
		stream.forEach(System.out::println);
		// 2nd way
		System.out.println("****");
		  Stream<String> stream2 =Stream.of("hello","java","ramu");
		  stream2.forEach(System.out::println);
		 
//3rd way
		List<String> list = new ArrayList<String>();
		  list.add("ramu");
		  list.add(" hello");
		  list.add("hi");
		  Stream<String> stream1 =list.stream();
		  stream1.forEach(System.out::println);
		  
		  

	}
}
