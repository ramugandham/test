 package com.ramu.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class Actions_movetoele_keyboardoper_rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"F:\\drivers\\geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Actions action=new Actions(driver);
		WebElement moveToEle = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(moveToEle).build().perform();
		WebElement keyboard = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(keyboard).click().keyDown(Keys.SHIFT)
		.sendKeys("hello").contextClick().build().perform();
		
        //driver.close();
	}

}
