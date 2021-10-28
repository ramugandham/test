package com.ramu.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication_popup {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Ramesh soft\\ramu.practice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//https://username:password@google.com
		driver.get("https://admin:admin@the_internet.herokuapp.com/basic_auth");
		
		
	}

}
