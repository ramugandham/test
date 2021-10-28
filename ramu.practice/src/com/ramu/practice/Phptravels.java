package com.ramu.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Phptravels {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Ramesh soft\\selenium.rameshsoft.workspace\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/404/");
		driver.findElement(By.id("onesignal-popover-cancel-button")).click();
		/*driver.switchTo().frame(0);
		driver.findElement(By.className("mc-closeModal")).click();*/
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id='header']/div/ul/li[3]")).click();
		driver.quit();
	}

}
