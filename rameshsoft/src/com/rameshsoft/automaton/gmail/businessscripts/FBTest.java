package com.rameshsoft.automaton.gmail.businessscripts;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseEngine;

public class FBTest extends BaseEngine {

	@Test
	public void fbTest() {
		getDriver().get("https://www.facebook.com");
	}
}
