package com.ramu.java18features;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop {

	public static void main(String[] args) {
		List<String> data=new ArrayList<String>();
		data.add("ramu");
		data.add("mu");
		data.add("ra");
		data.add("rmu");
		//1.5v
		for(String str:data) {
			System.out.println(str);
		}
		//1.8v
		System.out.println("*****");
		data.forEach(s->System.out.println(s));

	}

}
