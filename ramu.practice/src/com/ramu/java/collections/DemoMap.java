package com.ramu.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoMap {

	public static void main(String[] args) {
	   
           HashMap map=new HashMap<>();
           map.put(1, "java");
           map.put(2, "python");
           map.put(3, null);
           map.put(4, 25);
            Set keys = map.keySet();
          /*Iterator itr = keys.iterator();
          while(itr.hasNext()) {
        	  Object i = itr.next();
        	 Object val = map.get(i);
        	System.out.println(i+"        "+val);
          }*/
            for(Object ab:keys) {
            	//Object i = ab;
            	Object va = map.get(ab);
            	System.out.println(ab+ "..... "+va);
            }
           
           System.out.println(map);
	}

}
