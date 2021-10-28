package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesReusables {

	private String filePath;
	private FileInputStream fip;
	private Properties properties;
	/*
	  ;;;;;;;;
	 */
	
	public PropertiesReusables(String filePath) throws IOException{
		fip = new FileInputStream(filePath);
		properties = new Properties();
		properties.load(fip);
		if (properties!=null) {
			System.out.println("PROPERTIES OBJECT is available");
		}
		else{
			//throw exception
		}
	}
	
	public String getPropertyValue(String key) {
		String value = properties.getProperty(key);
		return value;
	}
	
	public String getPropertyValue(String key,String defaultValue) {
		String value = properties.getProperty(key);
		if (value == null) {
			value = defaultValue;
			System.out.println("key is not available with value: "+value);
		}
		else{
			System.out.println("key is available with value: "+value);
		}
		return value;
	}
	
	public String getProperty(Object key) {
		String value = (String) properties.get(key);
		return value;
	}
	//this is ur assignment
	public String getProperty(Object key,Object defaultValue) {
		String value = (String) properties.get(key);
		return value;
	}
	public void setPropertyKeyValue(String key,String value) throws IOException {
		properties.setProperty(key, value);
		FileOutputStream fop = new FileOutputStream(filePath);
		properties.store(fop, "Data added succesfully");
	}
	
	public void removeEntry(Object key) throws IOException {
		properties.remove(key);
		FileOutputStream fop = new FileOutputStream(filePath);
		properties.store(fop, "After Removeing file saved succesfully");
	}
	
	public void removeEntry(Object key,Object value) throws IOException {
		properties.remove(key, value);
		FileOutputStream fop = new FileOutputStream(filePath);
		properties.store(fop, "After Removeing file saved succesfully");
	}
	
	public Map<String, String> getAllEntries() {
		Map<String, String> map = new LinkedHashMap<>();
		
		Set<Object> keys = properties.keySet();
		for(Object key : keys){
			//String value = (String) properties.get(key);
			String key1 = (String) key;
			String value = properties.getProperty(key1);
			map.put(key1, value);
		}
		return map;
	}
	public static void main(String[] args) throws IOException {
		PropertiesReusables pr = new PropertiesReusables("");
		Map<String, String> entries = pr.getAllEntries();
		
		Set<String> keys = entries.keySet();
		for(String key : keys)
		{
			if (key.equalsIgnoreCase("job")||key.equalsIgnoreCase("practice")) {
				String value = pr.getPropertyValue(key);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
