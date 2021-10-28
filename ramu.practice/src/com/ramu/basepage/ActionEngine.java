package com.ramu.basepage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ActionEngine extends BaseTest {
	private static WebElement element;
	private static List<WebElement> elements;
	private static WebDriverWait wait = new WebDriverWait(getDriver(), 89);

	public static WebElement identifyElement(String locMech, String locValue) {
		switch (locMech) {
		case "id":
			element = getDriver().findElement(By.id(locValue));
			/*
			 * if (element.isDisplayed()&&element.isEnabled()) {
			 * System.out.println("It is enabled"); } else{ System.out.println("Disabled");
			 * }
			 */
			// boolean status = (element.isDisplayed()&&element.isEnabled());
			break;
		case "name":
			element = getDriver().findElement(By.name(locValue));
			break;
		case "class":
			element = getDriver().findElement(By.className(locValue));
			break;
		case "xpath":
			element = getDriver().findElement(By.xpath(locValue));
			break;
		case "css":
			element = getDriver().findElement(By.cssSelector(locValue));
			break;
		case "linkText":
			element = getDriver().findElement(By.linkText(locValue));
			break;
		case "partialLinkText":
			element = getDriver().findElement(By.partialLinkText(locValue));
			break;
		case "tagName":
			element = getDriver().findElement(By.tagName(locValue));
			break;
		}

		return element;
	}

	static public List<WebElement> identifyElements(String locMech, String locValue) {

		switch (locMech) {
		case "id":
			elements = getDriver().findElements(By.id(locValue));
			break;
		// boolean status = (element.isDisplayed()&&element.isEnabled());
		case "name":
			elements = getDriver().findElements(By.name(locValue));
			break;
		case "class":
			elements = getDriver().findElements(By.className(locValue));
			break;
		case "xpath":
			elements = getDriver().findElements(By.xpath(locValue));
			break;
		case "css":
			elements = getDriver().findElements(By.cssSelector(locValue));
			break;
		case "linkText":
			elements = getDriver().findElements(By.linkText(locValue));
			break;
		case "partialLinkText":
			elements = getDriver().findElements(By.partialLinkText(locValue));
			break;
		case "tagName":
			elements = getDriver().findElements(By.tagName(locValue));
			break;
		}

		return elements;

	}

	public static void click(String locMech, String locValue) {
		element = identifyElement(locMech, locValue);
		if (element.isDisplayed() && element.isEnabled()) {
			element.click();

		} else {
			// throw exception
		}
	}

	public static void dTA(String locMech, String locValue, String testData) {

		element = identifyElement(locMech, locValue);
		if (element.isDisplayed() && element.isEnabled()) {
			element.clear();
			element.sendKeys(testData);

		} else {
			// throw exception
		}
	}

	public static void mouseHover(String locMech, String locValue) {

		element = identifyElement(locMech, locValue);
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).build().perform();

	}

	public static void rightClick(String locMech, String locValue) {
		element = identifyElement(locMech, locValue);
		Actions actions = new Actions(getDriver());
		actions.contextClick(element).sendKeys(Keys.ARROW_DOWN, Keys.RETURN).build().perform();
	}

	public static void switchToFrameByIdOrName(String frameIdOrName) {
		TargetLocator targetLocator = getDriver().switchTo();
		targetLocator.frame(frameIdOrName);

	}

	public static void switchToFrameByIdOrName(int index) {
		TargetLocator targetLocator = getDriver().switchTo();
		targetLocator.frame(index);

	}

	public static void switchToFrameByIdOrName(String locMech, String locValue) {

		element = identifyElement(locMech, locValue);

		TargetLocator targetLocator = getDriver().switchTo();
		targetLocator.frame(element);

	}

	public static void switchToFrameToWindow() {
		TargetLocator targetLocator = getDriver().switchTo();
		targetLocator.defaultContent();
	}

	public static void windowHandlingforTwoWindows() {
		String curWindow = getDriver().getWindowHandle();
		Set<String> windows = getDriver().getWindowHandles();
		for (String window : windows) {
			if (!curWindow.equalsIgnoreCase(window)) {
				getDriver().switchTo().window(window);
			}

		}
	}

	public static void windowHandlingforWindows(int windowIndex) {
		String curWindow = getDriver().getWindowHandle();
		Set<String> windows = getDriver().getWindowHandles();
		List<String> windows1 = new ArrayList<String>(windows);
		String windowName = windows1.get(windowIndex);
		getDriver().switchTo().window(windowName);

	}

	static public List<WebElement> getTotalDropDownElements(String locMech,String locValue) {
		List<WebElement> eles=null;
        element=identifyElement(locMech, locValue);
        String actualTagName=element.getTagName();
        if(actualTagName.equalsIgnoreCase("select")) {
        	Select select=new Select(element);
        	eles = select.getOptions();
		}
		else{
			eles = identifyElements(locMech, locValue);
		}
		return eles;	
	}
	static public boolean isVisible(WebElement element) {
		boolean status = true;
		if (element.isDisplayed()&&element.isEnabled()) 
			status = true;
		else
			status = false;
		return status;
	}
	public static void explicitVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	static public void inVisible(String locMech,String locValue) {
		switch(locMech) {
		case"id":wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locValue)));
		break;
        //boolean status = (element.isDisplayed()&&element.isEnabled());
case "name":wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(locValue)));
break;
case "class":wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(locValue)));
break;
case "xpath":wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locValue)));
break;
case "css":wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locValue)));
break;
case "linkText":wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(locValue)));
break;
case "partialLinkText":wait.until(ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText(locValue)));
break;
case "tagName":wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(locValue)));
break;
		}
	
	}
	
	public static void validateTitleSoftAssert(String expectedValue) {
		String actualValue=getDriver().getTitle();
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals(actualValue, expectedValue);
	}
	static public void validateTitleHardAssert(String expectedValue) {
		String actualValue = getDriver().getTitle();
		Assert.assertEquals(actualValue, expectedValue);
	}
	static public void enterUrl(String url) {
		getDriver().get(url);
	}
	public static void main(String[] args) {
		WebElement  ele=identifyElement("id", "identifierId");
		ele.sendKeys("hello");
           mouseHover("xpath", "//*[text()='Departments']");
		
		switchToFrameByIdOrName("hello");
		windowHandlingforTwoWindows();
		windowHandlingforWindows(8);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

	}
