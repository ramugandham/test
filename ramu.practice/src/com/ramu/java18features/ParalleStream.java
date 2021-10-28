package com.ramu.java18features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class ParalleStream {

	public static void main(String[] args) {
		
		List<Integer> data=new ArrayList<Integer>();
		data.add(4);
		data.add(98);
		data.add(17);
		data.add(28);
		data.add(66);
		data.add(54);
		data.add(10);
		
		data.add(2);
		data.parallelStream().forEach(s->System.out.println(s));
		System.out.println("****");
		data.parallelStream().	skip(4).forEach(s->System.out.println(s));
		System.out.println("****");
		data.parallelStream().sorted().forEach(s->System.out.println(s));
		System.out.println("****");
		data.stream().forEach(s->System.out.println(s));
		
		}

}