package com.rameshsoft.automaton.gmail.businessscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseEngine;

public class AlertTest extends BaseEngine {

	@Test
	public void alertTest() throws IOException {
		getDriver().get("file:///C:/Users/RAMESH/Downloads/alerts4/WindowUploadfile.html");
		
		getDriver().findElement(By.id("1")).click();
		
		Runtime.getRuntime().exec(getBaseDir()+"\\PopUps\\WindowPopUp.exe");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
