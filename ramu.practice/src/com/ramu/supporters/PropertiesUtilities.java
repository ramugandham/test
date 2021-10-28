package com.ramu.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesUtilities {
	private String filepath;
	private FileInputStream fip;
	private Properties properties;

	public PropertiesUtilities(String filepath) throws IOException {
		this.filepath = filepath;
		fip = new FileInputStream(filepath);
		properties = new Properties();
		properties.load(fip);
	}

	public String getPropertyValue(String key) {
		String value = " ";
		if (properties != null) {
			value = properties.getProperty(key);
		}

		else {
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
		}
		return value;

	}

	public String getPropertyValue(String key, String defaultValue) {
		String value = " ";
		if (properties != null) {
			value = properties.getProperty(key);
			if (value == null) {
				value = defaultValue;
			}
		}
		return value;

	}

	public String getPropertyValue(Object key) {
		String value = " ";
		if (properties != null) {
			value = (String) properties.get(key);
		}

		else {
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
		}
		return value;

	}

	public String getPropertyValue(Object key, Object defaultValue) {
		String value = "";
		if (properties != null) {
			value = (String) properties.getOrDefault(key, defaultValue);
			if (value == null) {
				value = (String) defaultValue;
			}
		} 
		else
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
		return value;

	}
	public void setKeyValue(String key,String value) throws FileNotFoundException, IOException {
		properties.setProperty(key, value);
		properties.store(new FileOutputStream(filepath), "file is asaved succesfully");
	}
	public void setKeyValue(Object key,Object value) throws FileNotFoundException, IOException {
		properties.put(key, value);
		properties.store(new FileOutputStream(filepath), "file is asaved succesfully");
	}
	
	public void removeKeyValue(Object key) throws FileNotFoundException, IOException {
		properties.remove(key);
		properties.store(new FileOutputStream(filepath), "file is asaved succesfully");
	}
	public Map<String,String> getTotalData()
	{
		Map<String, String> data = new HashMap<>();
		if (properties!=null) {
			Set keys = properties.keySet();
			
			for(Object ab : keys)
			{
				String key = (String) ab;
				String value = properties.getProperty(key);
				data.put(key, value);
			}
		}
		return data;
	}	
	

}
