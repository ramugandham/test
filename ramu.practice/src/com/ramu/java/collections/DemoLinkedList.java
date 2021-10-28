package com.ramu.java.collections;

import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		list.add("hi");
		list.add("hello");
		list.add("how are you");
		list.add("i am fine");
		list.add("u");
		System.out.println(list);
		list.addFirst("java");
		list.addLast("selenium");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.err.println("is"+list);



	}

}
