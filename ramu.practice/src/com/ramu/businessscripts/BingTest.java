package com.ramu.businessscripts;

import org.testng.annotations.Test;

import com.ramu.basepage.BaseTest;

public class BingTest extends BaseTest {
	@Test
	public void loginTest() {
	getDriver().get("https://www.bing.com");

	}

}
