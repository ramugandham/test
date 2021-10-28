package com.ramu.java18features;

import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PredicateTestFISele {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ram\\ramu.practice\\Drivers\\chromedriver.exe ");
		
		RemoteWebDriver  driver=new ChromeDriver();
		driver.get("https://gmail.com");
		WebElement ele = driver.findElement(By.id("identifierId"));
		Predicate  predicate=(ele1)->{ boolean status1=true;
		if(ele.isDisplayed()&&ele.isEnabled()) {
			ele.clear();ele.sendKeys("ramugandham");
			System.out.println("displayed");
		
		}
		else {
			System.out.println("not displayed");
			 status1=false;
		}
			return status1;
			
		};
		System.out.println(predicate.test(ele));

	}

}
