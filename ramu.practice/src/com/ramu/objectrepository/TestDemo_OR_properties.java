package com.ramu.objectrepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestDemo_OR_properties {

	public static void main(String[] args) throws IOException {
		FileInputStream fip=new FileInputStream
				("D:\\Ramesh soft\\ramu.practice\\src\\com\\ramu\\objectrepository\\OR.properties");
		Properties properties=new  Properties();
		properties.load(fip);
		Set  keys=properties.keySet();
		HashMap<String, String>  data=new HashMap<>();
		/*for(Object a:keys) {
			String key = (String) a;
			String  value=(String) properties.get(key);
			data.put(key, value);
			
		}*/
		Iterator itr = keys.iterator();
		while(itr.hasNext())
		{
			String key = (String) itr.next();
			String value = properties.getProperty(key);
			System.out.println(key+" ....... "+value);
			data.put(key, value);
		}
		System.out.println(data);
	}

}
