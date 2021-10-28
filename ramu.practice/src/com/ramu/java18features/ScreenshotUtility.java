package com.ramu.java18features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface ScreenshotUtility {
	public static void screenshot (WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\ram\\ramu.practice\\Screenshots\\demo.jpeg"));
		
		
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ram\\ramu.practice\\Drivers\\chromedriver.exe ");
		
		RemoteWebDriver  driver=new ChromeDriver();
		driver.get("https://gmail.com");
		screenshot(driver);
	}

}
