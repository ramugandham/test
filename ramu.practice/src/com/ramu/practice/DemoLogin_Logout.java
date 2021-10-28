package com.ramu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin_Logout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Ramesh soft\\selenium.rameshsoft.workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.chegg.com");
		String actualValue = driver.getTitle();
		System.out.println(actualValue);
		String  expectedvalue="Chegg - Get 24/7 Homework Help | Rent Textbooks";
		
		String data = (actualValue.equalsIgnoreCase(expectedvalue))? "chegg page is Opened" : "chegg page is not Opened";
		
		System.out.println(data);
		//WebElement sigin=driver.findElement(By.xpath("//*[@id='eggshell-21']/a"));
		WebElement sigin1=driver.findElement(By.className("signin-item nav-item track-signin"));

		sigin1.click();
	}

}
