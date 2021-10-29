package com.ramu.pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ramu.basepage.BaseTest;

public class GmailPwdPage extends BaseTest{

	static
	{
		PageFactory.initElements(getDriver(), GmailPwdPage.class);
	}
	
	@FindBy(name="password")
	static public WebElement password;
	
	@FindBy(xpath="//*[@id='passwordNext']")
	static public WebElement signIn;
	;;;;;;;;;
	
	@FindBy(xpath="//*[contains(text(),'Wrong password. Try again or click Forgot password to rese')]")
	static public WebElement wrongPwdErrMsg;
	
	static public void enterPwd(String testData) {
		password.clear();
		password.sendKeys(testData);
	}
	
	static public void clickSignInBtn() {
		signIn.click();
	}
	public static String getPwdErrMsg()
	{
		return wrongPwdErrMsg.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
}
