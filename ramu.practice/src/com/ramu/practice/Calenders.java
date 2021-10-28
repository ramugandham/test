package com.ramu.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Ramesh soft\\ramu.practice\\Drivers\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().deleteAllCookies();
           driver.manage().window().maximize();
           driver.get("https://spicejet.com");
           driver.findElement(By.className("ui-datepicker-trigger")).click();
           //pick the month
       while( !driver.findElement
           (By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/div/div/span[1]"))
           .getText().contains("December")) {
    	   driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
       }
        //pick the date
          List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
          int count = driver.findElements(By.className("ui-state-default")).size();
           for(int i=0;i<count;i++) {
        	   String text = driver.findElements
        			   (By.className("ui-state-default")).get(i).getText();
        	   if(text.equalsIgnoreCase("10")) {
        		   driver.findElements(By.className("ui-state-default")).get(i).click();
        		   break;
        	   }
        	   
        	   
        	   
           }
         
	}

}
