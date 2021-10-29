package com.rameshsoft.automaton.gmail.businessscripts;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseEngine;

public class FPTest extends BaseEngine{

	@Test
	public void flipkartTest() {
		getDriver().get("https://www.flipkart.com");
	}
	
}
