package com.rameshsoft.automation.utilities;

import java.io.IOException;

import com.rameshsoft.automation.base.BaseEngine;
import com.rameshsoft.automation.supporters.PropertiesReusables;

public class POJOUtility {

	private static String orFilePath = BaseEngine.getBaseDir()+"\\src\\com\\rameshsoft\\automation\\gmail\\objectrepository\\OR_Gmail.properties";
	private static String confFilePath = BaseEngine.getBaseDir()+"\\config.properties";
	private static String excelFilePath = BaseEngine.getBaseDir()+"\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls";
	private static String txtFilePath = "";
	
	public static String getOrFilePath() {
		return orFilePath;
	}

	public static String getExcelFilePath() {
		return excelFilePath;
	}

	
	public static String getConfFilePath() {
		return confFilePath;
	}

	public void setConfFilePath(String confFilePath) {
		this.confFilePath = confFilePath;
	}
	
	public void setExcelFilePath(String excelFilePath) {
		this.excelFilePath = excelFilePath;
	}

	public String getTxtFilePath() {
		return txtFilePath;
	}

	public void setTxtFilePath(String txtFilePath) {
		this.txtFilePath = txtFilePath;
	}

	public void setOrFilePath(String orFilePath) {
		this.orFilePath = orFilePath;
	}
	
	public PropertiesReusables getPropertiesReusablesObj(String filePath) throws IOException {
		PropertiesReusables pr = new PropertiesReusables(filePath);
		return pr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
