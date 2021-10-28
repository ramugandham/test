package com.ramu.java18features;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FunctionINtestSele {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ram\\ramu.practice\\Drivers\\chromedriver.exe ");
		
		RemoteWebDriver  driver=new ChromeDriver();
		driver.get("https://gmail.com");
		WebElement element=driver.findElement(By.id("identifierId"));
		Function<WebElement, String>function1=(ele)->{
			String idval = ele.getAttribute("id");
		return idval;
		};
		System.out.println(function1.apply(element));

	}

}
