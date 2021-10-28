package org.testing.qatesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_GmailLogin {
	@Test
	public void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
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
      
	}

}
