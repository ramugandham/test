package com.rameshsoft.automation.seleniumcore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListTest {
public static void main(String[] args) {
	Set s = new LinkedHashSet();
	s.add(1);
	s.add(10);
	s.add(8);
	System.out.println(s);  // [1 10 8]

	List l = new ArrayList(s);
	System.out.println(l);  // [1 10 8]
}
}
