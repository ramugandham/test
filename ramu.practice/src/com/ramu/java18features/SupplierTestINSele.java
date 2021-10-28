package com.ramu.java18features;

import java.util.function.Supplier;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SupplierTestINSele {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ram\\ramu.practice\\Drivers\\chromedriver.exe ");
		
		RemoteWebDriver  driver=new ChromeDriver();
		driver.get("https://gmail.com");
		Supplier<String>supplier=()->{ String actval = driver.getTitle();
			return actval;
		};
		String val = supplier.get();
		System.out.println(val);
	}

}
