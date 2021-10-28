package com.ramu.java18features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import freemarker.core.ReturnInstruction.Return;

interface WebelementOne{
	  boolean isvisible(WebElement element);
	  
	  }

public class FinterfaceVSlambdaselenium {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ram\\ramu.practice\\Drivers\\chromedriver.exe ");
		
		RemoteWebDriver  driver=new ChromeDriver();
		driver.get("https://gmail.com");
		WebElement job = driver.findElement(By.id("identifierId"));
                 
		 WebelementOne ele1 = ( ele)-> {boolean status=ele.isDisplayed()&&ele.isEnabled(); return status;};
		
		System.out.println(ele1.isvisible(job)+"hello");
}
}