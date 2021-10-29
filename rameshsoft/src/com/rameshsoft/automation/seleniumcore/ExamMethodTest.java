package com.rameshsoft.automation.seleniumcore;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExamMethodTest {	
	@Test
	@Parameters({"un","pwd"})
	//@Parameters({"s","hello"})
	public void login(@Optional("hello")String un,@Optional("practice")String pwd) {
	System.out.println(un+"......"+pwd);	
	}
	
}






