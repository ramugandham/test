package com.ramu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksOfPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ram\\ramu.practice\\Drivers\\chromedriver.exe ");
           WebDriver driver=new ChromeDriver();
           driver.manage().deleteAllCookies();
           driver.manage().window().maximize();
           driver.get("https://ebay.com");
           System.out.println("no of links in page");
          System.out.println( driver.findElements(By.tagName("a")).size());
          System.out.println("no of links in footer page");
          WebElement footer = driver.findElement(By.xpath("//*[@id='glbfooter']"));
         System.out.println( footer.findElements(By.tagName("a")).size());
         System.out.println("no of links in colum page");
         WebElement colum = driver.findElement(By.xpath("//*[@id='glbfooter']/div[2]//td[1]/ul"));
         System.out.println( colum.findElements(By.tagName("a")).size());
         for(int i=0;i<colum.findElements(By.tagName("a")).size();i++) {
        	 //System.out.println(colum.findElements(By.tagName("a")).get(i).getText());
        	 
        	if(colum.findElements(By.tagName("a")).get(i).getText().contains("Registration")) {
        		colum.findElements(By.tagName("a")).get(i).click();
        		break;
        	}
        	 
         }
         System.out.println(driver.getTitle());
      
	}

}
