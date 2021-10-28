package com.ramu.utilities;

import com.ramu.basepage.BaseTest;

public interface DriverUtility {
	String iekeys="webdriver.chrome.driver";
	String firefoxkeys="webdriver.gecko.driver";
	String chromekeys="webdriver.chrome.driver";
	
	String ievalue=BaseTest.getUserCurDir()+"\\Drivers\\IEDriver.exe";
	String firefoxvalue=BaseTest.getUserCurDir()+"\\Drivers\\geckodriver.exe";
	String chromevalue=BaseTest.getUserCurDir()+"\\Drivers\\chromedriver.exe";
	
     String configPath=BaseTest.getUserCurDir()+"\\config.properties";
     String orPath = BaseTest.getUserCurDir()+"\\src\\com\\ramu\\objectrepository\\OR.properties";
     
	String excelPath = "D:\\Ramesh soft\\ramu.practice\\src\\com\\ramu\\testdata\\data1.xls";
}
