package com.ramu.practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamFrameTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jqueryui.com");
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	for(WebElement frame : frames)
	{
		String id = frame.getAttribute("id");
		String src = frame.getAttribute("src");
		String name = frame.getAttribute("name");
		String clas = frame.getAttribute("class");
		System.out.println(id+"...."+src+"...."+name+"...."+clas);
	}
	//windows
driver.get("https://www.bing.com");	
//here we opened 5 windows	
	driver.findElement(By.linkText("MSN")).click();
	driver.findElement(By.linkText("Office Online")).click();
	driver.findElement(By.linkText("Outlook.com")).click();
	
	Set<String> windows = driver.getWindowHandles();
	for(String window : windows)
	{
		driver.switchTo().window(window);
		try{
WebElement el = driver.findElement(By.className("linkButtonSigninHeader"));
el.click();
break;
		}
		catch(Exception e){
			
		}
	}
	 
}
}
