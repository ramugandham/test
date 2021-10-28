package com.ramu.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForWedrivercmnds {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Ramesh soft\\ramu.practice\\Drivers\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().deleteAllCookies();
           driver.manage().window().maximize();
           driver.get("https://gmail.com");
           
           driver.findElement(By.id("identifierId")).sendKeys("ramugandham");
           driver.findElement(By.id("identifierNext")).click();
           Thread.sleep(3000);
           String title = driver.getTitle();
           System.out.println(title);
          String url = driver.getCurrentUrl();
          System.out.println(url);
         // String page = driver.getPageSource();
         // System.out.println(page);
        String handle = driver.getWindowHandle();
        System.out.println("windows"+handle);
       Set<String> handles = driver.getWindowHandles();
       System.out.println(handles);
       
   
           
           
           
	}

}
