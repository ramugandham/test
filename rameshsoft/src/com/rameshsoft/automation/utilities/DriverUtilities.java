package com.rameshsoft.automation.utilities;

import com.rameshsoft.automation.base.BaseEngine;

public interface DriverUtilities {

	String chromeKey = "webdriver.chrome.driver";
	String ieKey = "webdriver.ie.driver";
	String firefoxKey = "webdriver.gecko.driver";
	
	
	String chromeValue = "\\Drivers\\chromedriver.exe";
	String ieValue = "\\Drivers\\IEDriverServer.exe";
	String firefoxValue = "\\Drivers\\geckodriver.exe";
	
	
	
	String chromeValue1 = BaseEngine.getBaseDir()+"\\Drivers\\chromedriver.exe";
	
	
	
	
	
	
	
}
