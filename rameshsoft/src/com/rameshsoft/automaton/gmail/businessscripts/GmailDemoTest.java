package com.rameshsoft.automaton.gmail.businessscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import com.rameshsoft.automation.base.BaseEngine;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesReusables;
import com.rameshsoft.automation.utilities.FilePaths;
import com.relevantcodes.extentreports.LogStatus;

public class GmailDemoTest extends BaseEngine{

	@org.testng.annotations.Test
	public void loginTest() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
		PropertiesReusables prConf = new PropertiesReusables(FilePaths.confPath);
		getDriver().get(prConf.getPropertyValue("dev_url"));
		getExtentTest().log(LogStatus.INFO, "ENTERED URL AS :" +prConf.getPropertyValue("dev_url"));
		
		
		PropertiesReusables prOr = new PropertiesReusables(FilePaths.orPath);
		//getDriver().findElement(By.id(prOr.getPropertyValue("gh_un_id")));
		String unValue = prOr.getPropertyValue("gh_un_id");
		
		ExcelReader er = new ExcelReader(FilePaths.excelPath);
		String unData = er.getCellData("Sheet1", 0, 0);
		getDriver().findElement(By.id(unValue)).sendKeys(unData);
		
		getExtentTest().log(LogStatus.INFO, "DTA is done on UN with test data: " +unData);
		
		getDriver().findElement(By.id(prOr.getPropertyValue("gh_next_id"))).click();
		getExtentTest().log(LogStatus.INFO, "clicked on next button");
		Thread.sleep(3000);
		
		getDriver().findElement(By.name(prOr.getPropertyValue("gh_pwd_name"))).sendKeys(er.getCellData("Sheet1", 0, 0));
		getExtentTest().log(LogStatus.INFO, "DTA is done on UN with test data: " +er.getCellData("Sheet1", 0, 0));
		getDriver().findElement(By.id(prOr.getPropertyValue("gh_signin_id"))).click();
		getExtentTest().log(LogStatus.INFO, "clicked on sigin button");
		
		
		
		
		
		
		
		
		
		
	}
	
}
