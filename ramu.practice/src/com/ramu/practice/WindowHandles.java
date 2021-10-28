package com.ramu.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Ramesh soft\\ramu.practice\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(89,TimeUnit.SECONDS );
        driver.get("https://www.bing.com");
      driver.findElement(By.xpath("//a[text()='MSN']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Office Online']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Outlook.com']")).click();
        Thread.sleep(3000);
        
        String curnWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
       String name = driver.getTitle();
        System.out.println(curnWindow+"   "+name);
        //multiple windows
        List l=new ArrayList<>(windows);
        String Sec=(String) l.get(3);
        driver.switchTo().window(Sec);
        System.out.println(driver.getTitle());
        /*for(Object ab:windows) {
        	String s=(String) ab;
        	if(s.equalsIgnoreCase(curnWindow)) {
        		System.out.println("widow is focused already");
        	}
        	else {
        		driver.switchTo().window(s);
        		System.out.println(driver.getTitle());
        	}
        	
        }
        driver.findElement(By.id("q")).sendKeys("java");
    	String sec = driver.getWindowHandle();
    	System.out.println(sec);*/
        
	}

}
