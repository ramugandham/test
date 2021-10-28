 package com.ramu.java18features;

import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConsumerINExmpleSele {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ram\\ramu.practice\\Drivers\\chromedriver.exe ");
		
		RemoteWebDriver  driver=new ChromeDriver();
		driver.get("https://gmail.com");
		WebElement ele = driver.findElement(By.id("identifierId"));
		Consumer<WebElement> element=(ele1)->{
			if(ele1.isDisplayed()&&ele1.isEnabled()) {
				ele.clear();ele.sendKeys("ramugandham");
			}
		};
        element.accept(ele);
	}

}
