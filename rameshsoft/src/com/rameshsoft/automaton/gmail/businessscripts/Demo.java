package com.rameshsoft.automaton.gmail.businessscripts;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo {
public static void main(String[] args) {
	ExtentReports er = new ExtentReports("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automaton\\gmail\\businessscripts\\report.html");
	er.assignProject("JAVA");
	ExtentTest et = er.startTest("abc");
	et.log(LogStatus.INFO, "1");
	et.log(LogStatus.INFO, "1");
	et.log(LogStatus.INFO, "1");
	et.log(LogStatus.INFO, "1");
	er.flush();
	er.endTest(et);
	
	
	
	
	
	
	
	
	
	
	
}
}
