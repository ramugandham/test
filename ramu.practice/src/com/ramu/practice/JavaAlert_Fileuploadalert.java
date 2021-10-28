package com.ramu.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert_Fileuploadalert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ramesh soft\\ramu.practice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		Alert alert = driver.switchTo().alert();
		String str = alert.getText();
		System.out.println(str);
		alert.accept();*/
		driver.navigate().to("https://html.com/input-type-file/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='cn-accept-cookie']")).click();
		 driver.findElement(By.linkText("Don't Allow")).click();
			Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("‪C:\\Users\\dell\\Desktop\\hms.txt");
	     
		driver.quit();

	}

}
