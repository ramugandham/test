package com.rameshsoft.automation.seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlogTest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("selenium by ramesh anupati");
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ENTER).build().perform();
	
	WebElement blogLink = driver.findElement(By.xpath("//*[contains(text(),'Selenium : Selenium WebDriver By Ramesh Anapati')]"));
	blogLink.click();
	
	//List<WebElement> links = driver.findElements(By.tagName("a"));
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int enabledLinks = 0;
	int disabledLinks = 0;
	for(WebElement link : links)
	{
		if (link.isDisplayed()&&link.isEnabled()) {
			enabledLinks++;
		}
		else{
			disabledLinks++;
		}
	}
	System.out.println("Total noof links: " + links.size());
	System.out.println("Enabled links are: " + enabledLinks);
	System.out.println("Disabled links are: " + disabledLinks);
	driver.get("https://www.facebook.com");
	List<WebElement> eles = driver.findElements(By.xpath("//*"));
	int radioBtns=0;
	int dropDowns=0;
	for(WebElement ele : eles)
	{
		if (ele.getTagName().equalsIgnoreCase("select")) {
			System.out.println("DropDown ");
			dropDowns++;
		}
		if (ele.getAttribute("type").equalsIgnoreCase("radio")) {
			System.out.println("Radio button");
			radioBtns++;
		}
	}
	

	
	
	
	
	
	
}
}
