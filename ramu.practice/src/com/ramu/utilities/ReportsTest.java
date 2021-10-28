package com.ramu.utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ReportsTest {
	public static void main(String[] args) {
		
	
	ExtentReports er=new ExtentReports("D:\\Ramesh soft\\ramu.practice\\Reports\\report.html");
    ExtentTest extentTest=er.startTest("login");
    extentTest.log(LogStatus.INFO,"BROWSER IS OPENED");
    extentTest.log(LogStatus.INFO, "URL is entered with: https://www.gmail.com");
    extentTest.log(LogStatus.INFO, "DTA is done on username with testdata: nagaramugandham");;
	er.flush();
	er.endTest(extentTest);
    
}
}
