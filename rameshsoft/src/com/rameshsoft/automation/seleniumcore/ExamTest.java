package com.rameshsoft.automation.seleniumcore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExamTest {
public static void main(String[] args) {
	
	int[] a = {10,20,1,10,20,1,10,20,20};
	TreeSet t = new TreeSet<>();
	List l = new ArrayList<>();
	for(int i=0;i<a.length;i++)
	{
		boolean b = t.add(a[i]);
		if (b) {
			System.out.println(a[i]);
		}
		else{
			l.add(a[i]);
		}	
	}
	System.out.println("Duplicate elements are: " + l);
	System.out.println("After removing duplicates :" +t);
}
}

