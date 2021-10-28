package com.ramu.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.ramu.basepage.BaseTest;

public class GmailHomePage extends BaseTest{

	@FindBy(id="identifierId")
	static public WebElement userName;
	
	@FindBy(how=How.ID,using="identifierId")
	static public WebElement userName1;
	
	@FindBy(xpath="//*[@id='identifierNext']")
	static public WebElement next;
	;;;;;;;;;
	
	
	static public void enterUserName(String testData) {
		userName.clear();
		userName.sendKeys(testData);
	}
	
	static public void clickNextBtn() {
		next.click();
	}
	
	static
	{
	PageFactory.initElements(getDriver(), GmailHomePage.class);	
	}
	
}
