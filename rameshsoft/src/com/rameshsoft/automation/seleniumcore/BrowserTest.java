package com.rameshsoft.automation.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BrowserTest {
	WebDriver driver;
	@BeforeSuite
public void openBrowser() {
		System.out.println("BS");
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\firstapp\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	if (driver!=null) {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);	
	}
	else
		System.out.println("Driver is pointing to NULL....PLZ Check: openBrowser()");
}
@AfterSuite
public void closeBrowser() {
	System.out.println("AS");
	if (driver!=null) 
	driver.close();
	else
		System.out.println("Driver is pointing to NULL....PLZ Check: closeBrowser()");	
}
@Test
public void login() {
driver.get("https://www.gmail.com");	
//driver.findElement(By.id("1")).sendKeys("practice");
System.out.println("login()");
}
@Test
public void alogout() {
	System.out.println("logout()");
}

@BeforeClass
public void beforeClass() {
	System.out.println("BC");
}
@AfterClass
public void afterClass() {
	System.out.println("AC");
}
@BeforeTest
public void beforeTest() {
	System.out.println("BT");
}
@AfterTest
public void afterTest() {
	System.out.println("AT");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("BM");
}
@AfterMethod
public void afterMethod() {
	System.out.println("AM");
}


























}
