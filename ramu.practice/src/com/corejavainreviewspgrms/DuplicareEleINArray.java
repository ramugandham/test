 package com.corejavainreviewspgrms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class DuplicareEleINArray {

	public static void main(String[] args) {
		
		String []names= {"java","selenium","java","testing","selenium"};
		//1 compare to each word o(n*n)
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate elements;"+names[i]);
				}
			}
		}
		     //2 way using hashset in java collections
		        Set<String>store = new HashSet();
		        for(String name:names) {
		        	if(store.add(name)==false) {
		        		System.out.println("duplicate elements1;"+name);
		        	}
		        }
		        //3rd way hashmap
		        Map<String, Integer> storemap=new HashMap<String, Integer>();
		        for(String name:names) {
		        	Integer count = storemap.get(name);
		        	if(count==null) {
		        		storemap.put(name, 1);
		        	}
		        	else {
		        		storemap.put(name, ++count);
		        	}
		        }
		        Set<Entry<String,Integer>> entryset=storemap.entrySet();
		        for(Entry<String,Integer>entry: entryset){
		        	if (entry.getValue()>1) {
		        		System.out.println("duplicate elements2;"+entry.getKey());
		        	}
		        }
           
	}

}
