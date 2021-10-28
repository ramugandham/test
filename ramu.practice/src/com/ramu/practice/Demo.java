package com.ramu.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("WebDriver.driver.chrome","F:\\Ramesh soft\\ramu.practice\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
	}

}
