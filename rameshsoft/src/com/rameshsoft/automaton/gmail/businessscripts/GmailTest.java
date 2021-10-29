package com.rameshsoft.automaton.gmail.businessscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.excelant.util.ExcelAntEvaluationResult;
import org.openqa.selenium.By;
import org.testng.ITestListener;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseEngine;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesReusables;
import com.rameshsoft.automation.utilities.POJOUtility;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTest extends BaseEngine {

	@Test
	public void login() throws IOException, EncryptedDocumentException, InvalidFormatException {
		PropertiesReusables prConf = new PropertiesReusables(POJOUtility.getConfFilePath());
		String url = prConf.getPropertyValue("dev_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.INFO, "URL is entered as: "+url);
		PropertiesReusables prOr = new PropertiesReusables(POJOUtility.getOrFilePath());
		//String unId = prOr.getPropertyValue("gh_un_id");
		
		ExcelReader excelReader = new ExcelReader("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls");
		String unDtata = excelReader.getCellData("Sheet1", 0, 0);
		getDriver().findElement(By.id(prOr.getPropertyValue("gh_un_id"))).sendKeys(unDtata);
		getExtentTest().log(LogStatus.INFO, "DTA is done on UN with testdata: " +unDtata);
		
		getDriver().findElement(By.id(prOr.getPropertyValue("gh_next_id"))).click();
		getExtentTest().log(LogStatus.INFO, "Clicked on next button");
	
	}
	
}










