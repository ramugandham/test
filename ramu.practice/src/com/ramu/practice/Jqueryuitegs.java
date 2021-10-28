package com.ramu.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jqueryuitegs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Ramesh soft\\selenium.rameshsoft.workspace\\Drivers\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.manage().window().maximize();
		          driver.get("https://www.jqueryui.com");
		driver.findElement(By.linkText("Autocomplete")).click();
        driver.switchTo().frame(0);
       WebElement ele = driver.findElement(By.id("tags"));
       ele.sendKeys("java");
       Actions actions =new Actions(driver);
       actions.sendKeys(ele, Keys.ARROW_DOWN).build().perform();
	}

}
