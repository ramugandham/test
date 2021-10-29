package org.testing.qatesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_fbLogin {
	@Test
	public void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
         driver.manage().deleteAllCookies();
         driver.manage().window().maximize();
         driver.get("https://facebook.com");
	//changes are their
         driver.quit();
	}

}
