package com.ramu.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TotalLinks_Imgs_BrokenLinks_Imgs {

	public static void main(String[] args) throws MalformedURLException, IOException  {

		System.setProperty("webdriver.chrome.driver", "D:\\ram\\ramu.practice\\Drivers\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com");
		/*driver.get("https://classic.crmpro.com/index.html");
		System.out.println("...Title of page...." + driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("ramu1223");
		driver.findElement(By.name("password")).sendKeys("ramu1223@");

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("...Title of page...." + driver.getTitle());

		driver.switchTo().frame("mainpanel");*/
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		// total all links in page num
		System.out.println("size of all links.." + linkList.size());
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for (int i = 0; i < linkList.size(); i++) {
			// total all links in page print in console
			System.out.println(linkList.get(i).getAttribute("href"));
			if (linkList.get(i).getAttribute("href") != null
					&& (!linkList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linkList.get(i));
			}

		}
		// total activelinks in page print in console
		System.out.println("size of active links are.." + activeLinks.size());

		/*
		 * cheack the href url with http connections 200-ok ,400-not found ,500-internal
		 * error
		 */
		for(int j=0;j<activeLinks.size();j++) {
			 
               HttpURLConnection connections = (HttpURLConnection)new URL (activeLinks.get(j)
            		   .getAttribute("href")).openConnection();
               connections.connect();
               String resp = connections.getResponseMessage();
               connections.disconnect();
               System.out.println(activeLinks.get(j).getAttribute("href")+"..."+resp);
		}

		driver.quit();
	}
}
