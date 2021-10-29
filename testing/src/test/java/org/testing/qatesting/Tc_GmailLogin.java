package org.testing.qatesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.get("https://gmail.com");
         
         driver.findElement(By.id("identifierId")).sendKeys("nagaramu3334@gmail.com");
         driver.findElement(By.id("identifierNext")).click();
         String inputText = "9014991223";
         WebElement myElement = driver.findElement(By.id("password"));
         String js = "arguments[0].setAttribute('value','"+inputText+"')";
         ((JavascriptExecutor) driver).executeScript(js, myElement);
         
        // driver.findElement(By.id("password")).click();
         //driver.findElement(By.id("password")) .sendKeys("9014991223");
         driver.findElement(By.id("passwordNext")).click();
         
         Thread.sleep(3000);
         String title = driver.getTitle();
         System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
      
	}

}
