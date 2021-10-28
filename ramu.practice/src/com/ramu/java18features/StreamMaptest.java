package com.ramu.java18features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMaptest {

	public static void main(String[] args) {
		List<Integer> data=new ArrayList<>();
		data.add(25);
		data.add(1);
		data.add(99);
		data.add(32);
		List<Integer> data1 = data.stream().map(a->a*2).collect(Collectors.toList());
		data1.forEach(s->System.out.println(s));
	}

}
