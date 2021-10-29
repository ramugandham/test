package com.rameshsoft.automation.utilities;

import com.rameshsoft.automation.base.BaseEngine;

public interface FilePaths {

	public static final String orPath = BaseEngine.getBaseDir()+"\\src\\com\\rameshsoft\\automation\\gmail\\objectrepository\\OR_Gmail.properties";
	
	String confPath = BaseEngine.getBaseDir()+"\\config.properties";
	
	String excelPath = BaseEngine.getBaseDir()+"\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls";

}
