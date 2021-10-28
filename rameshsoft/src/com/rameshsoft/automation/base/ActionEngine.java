package com.rameshsoft.automation.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ActionEngine extends BaseEngine {
	static private WebElement element;
	static private List<WebElement> elements;
	
	static public WebElement identifyElement(String locMech,String locType) {
		switch(locType)
		{
		case "id": element = getDriver().findElement(By.id(locMech));
		if (element.isDisplayed()&&element.isEnabled()) {
			System.out.println("It is enabled");
		}
		else{
			System.out.println("Disabled");
		}
		break;
		
		case "name":element = getDriver().findElement(By.name(locMech));
		if (element.isDisplayed()&&element.isEnabled()) {
			System.out.println("It is enabled");
		}
		else{
			System.out.println("Disabled");
		}
		break;
		case "class":element = getDriver().findElement(By.className(locMech));
		if (element.isDisplayed()&&element.isEnabled()) {
			System.out.println("It is enabled");
		}
		else{
			System.out.println("Disabled");
		}
		break;
		case "xpath":element = getDriver().findElement(By.xpath(locMech));
		if (element.isDisplayed()&&element.isEnabled()) {
			System.out.println("It is enabled");
		}
		else{
			System.out.println("Disabled");
		}
		break;
		case "css":element = getDriver().findElement(By.cssSelector(locMech));
		if (element.isDisplayed()&&element.isEnabled()) {
			System.out.println("It is enabled");
		}
		else{
			System.out.println("Disabled");
		}
		break;
		case "tagName":element = getDriver().findElement(By.tagName(locMech));
		if (element.isDisplayed()&&element.isEnabled()) {
			System.out.println("It is enabled");
		}
		else{
			System.out.println("Disabled");
		}	
		break;
	case "linkText":element = getDriver().findElement(By.linkText(locMech));
	if (element.isDisplayed()&&element.isEnabled()) {
		System.out.println("It is enabled");
	}
	else{
		System.out.println("Disabled");
	}
	break;
	case "partialLinkText":element = getDriver().findElement(By.partialLinkText(locMech));
	if (element.isDisplayed()&&element.isEnabled()) {
		System.out.println("It is enabled");
	}
	else{
		System.out.println("Disabled");
	}
	break;
	}
		return element;
	}
	
	static public List<WebElement> identifyElements(String locMech,String locType) {
		switch(locType)
		{
		case "id": elements = getDriver().findElements(By.id(locMech));
		
		break;
		
		case "name":element = getDriver().findElement(By.name(locMech));
		
		break;
		case "class":element = getDriver().findElement(By.className(locMech));
		
		break;
		case "xpath":element = getDriver().findElement(By.xpath(locMech));
		
		break;
		case "css":element = getDriver().findElement(By.cssSelector(locMech));
		
		break;
		case "tagName":element = getDriver().findElement(By.tagName(locMech));
			
		break;
	case "linkText":element = getDriver().findElement(By.linkText(locMech));
	
	break;
	case "partialLinkText":element = getDriver().findElement(By.partialLinkText(locMech));
	
	break;
	}
		return elements;
	}
	
	public static void clickElement(String locMech,String locType) {
		element = identifyElement(locMech, locType);
		element.click();
	}
	
	public static void clickActions() {
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	
	public static void clickActions(String locMech,String locType) {
		element = identifyElement(locMech, locType);
		Actions actions = new Actions(getDriver());
		actions.sendKeys(element,Keys.ENTER).build().perform();
	}
	
	public static void clickActions(String... locMech) {
		element = identifyElement(locMech[0],locMech[1]);
		Actions actions = new Actions(getDriver());
		actions.click(element).build().perform();
	}
	
	public static void DTA(String locMech,String locType,String testData) {
		element = identifyElement(locMech, locType);
		element.sendKeys(testData);
	}
	
	public static void enterUrl(String url) {
		getDriver().get(url);
	}
}









