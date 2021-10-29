package com.rameshsoft.automaton.gmail.businessscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.rameshsoft.automation.base.BaseEngine;
import com.rameshsoft.automation.pageobjects.GmailHomePage;
import com.rameshsoft.automation.pageobjects.GmailPwdPage;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesReusables;
import com.rameshsoft.automation.utilities.FilePaths;
import com.relevantcodes.extentreports.LogStatus;

public class POMGmailTest extends BaseEngine{

	@org.testng.annotations.Test
	public void login() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
		String errMsg = "Wrong, password. Try again or click Forgot password to reset it.";
		PropertiesReusables prConf = new PropertiesReusables(FilePaths.confPath);
		String url = prConf.getPropertyValue("dev_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.INFO, "ENTERED UR AS : " +url);
		
		ExcelReader excelReader = new ExcelReader(FilePaths.excelPath);
		String unData = excelReader.getCellData("Sheet1", 0, 0);
		GmailHomePage.enterUserName(unData);
		getExtentTest().log(LogStatus.INFO, "DATA TYPING ACTION IS DONE ON USERNAME WITH TESTDATA: " +unData);
		
		GmailHomePage.clickNextBtn();
		getExtentTest().log(LogStatus.INFO, "CLICKED ON NEXT BUTTON");
		
		Thread.sleep(3000);
		String pwdData = excelReader.getCellData("Sheet1", 0, 1);
		GmailPwdPage.enterPwd(pwdData);
		getExtentTest().log(LogStatus.INFO, "DATA TYPING ACTION IS DONE ON PWD WITH TESTDATA: " +pwdData);
		
		GmailPwdPage.clickSignInBtn();
		
		Assert.assertEquals(errMsg, GmailPwdPage.getPwdErrMsg());
		
		
		
	}
	
}
