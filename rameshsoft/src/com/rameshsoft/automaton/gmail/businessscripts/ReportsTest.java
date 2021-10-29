package com.rameshsoft.automaton.gmail.businessscripts;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsTest {
public static void main(String[] args) {
	
	ExtentReports er = new ExtentReports("C:\\Users\\RAMESH\\Desktop\\firstapp\\Reports\\report.html");
	ExtentTest extentTest = er.startTest("ReportsTest");
	
	extentTest.log(LogStatus.INFO, "Browser is opened");
	extentTest.log(LogStatus.INFO, "url is entered");
	extentTest.log(LogStatus.INFO, "dta is done on UN");
	extentTest.log(LogStatus.INFO, "clicked on next button");
	
  er.flush();
  er.endTest(extentTest);
	
	
	
	
	
	
}
}
