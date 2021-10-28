package com.ramu.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Ramesh soft\\selenium.rameshsoft.workspace\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium by ramesh anupati");
        Thread.sleep(3000);
        //driver.findElement(By.name("btnK")).submit();
        Actions actions =new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        WebElement ele = driver.findElement
        		(By.xpath("//*[contains(text(),'Selenium : Selenium WebDriver By Ramesh Anapati')]"));
        actions.contextClick(ele).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.RETURN).build().perform();
        
        
        
        
        
        
        
	}

}
