package com.ramu.java18features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableStreamSorting {

	public static void main(String[] args) {
		List<Integer> data=new ArrayList<>();
		data.add(25);
		data.add(1);
		data.add(99);
		data.add(32);
		data.add(88);
		Comparator<Integer> com=(a,b)->-a.compareTo(b);//reverse order to use
	
		List<Integer> data1 = data.stream().sorted(com).collect(Collectors.toList());
		for(Integer i:data1) {
			System.out.println(i);
		}
		data1.forEach(s->System.out.println(s));
	}

}
