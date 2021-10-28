package com.ramu.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.ramu.supporters.ExcelReader;
import com.ramu.supporters.PropertiesUtilities;


public class POJOSupporters {
 private static ExcelReader excelReader;
 private static PropertiesUtilities propertiesUtilities;
	
 public static ExcelReader getExcelReader() throws EncryptedDocumentException, IOException {
	 excelReader=new ExcelReader(DriverUtility.excelPath);
	return excelReader;
}
 public static PropertiesUtilities getConfProperties() throws IOException {
	 propertiesUtilities=new PropertiesUtilities(DriverUtility.configPath);
	return propertiesUtilities;
}
 public static PropertiesUtilities getOrProperties() throws IOException {
	 propertiesUtilities=new PropertiesUtilities(DriverUtility.orPath);
	return propertiesUtilities;
	

}
	
	
}
