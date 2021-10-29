package com.rameshsoft.automation.seleniumcore;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowTest {
public static void main(String[] args) {
	System.setProperty("webdriver.gecho.driver", "D:\\Ramesh soft\\Seleniumfrmework2\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bing.com");
	WebElement ele = driver.findElement(By.name("q"));
	ele.sendKeys("selenium");
	
	driver.findElement(By.linkText("MSN")).click();
	String curWin = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	List<String> list = new ArrayList<>(windows);
	//Approach1
	String win9 = list.get(8);
	driver.switchTo().window(win9);
	driver.switchTo().window(list.get(98));
	
	//Approach2
	for(String window : windows)
	{
	 if (!curWin.equalsIgnoreCase(window))
		driver.switchTo().window(window);
	}
}
}



