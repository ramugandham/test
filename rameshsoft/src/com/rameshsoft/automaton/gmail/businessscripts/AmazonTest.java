package com.rameshsoft.automaton.gmail.businessscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.rameshsoft.automation.base.BaseEngine;
import com.rameshsoft.automation.supporters.TextReusables;

public class AmazonTest extends BaseEngine{

	@org.testng.annotations.Test
	public void amazonTest() throws IOException {
		getDriver().get("https://www.amazontest.com");
		WebElement depts = getDriver().findElement(By.xpath("//span[conatins(@class,'nav-line-2')]"));
		
		Actions actions = new Actions(getDriver());
		actions.moveToElement(depts).build().perform();
		
		String text = depts.getText();
		TextReusables tr = new TextReusables("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\elementtext\\abc.txt");
		
		tr.writeData(text);
		
		
		
		
		
		
		
		
	}
	
}
