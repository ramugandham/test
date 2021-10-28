package com.ramu.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class DraggableDroppable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Ramesh soft\\ramu.practice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jqueryui.com");
		driver.findElement(By.linkText("Autocomplete")).click();
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("no of iframes:" + iframes.size());
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("java");
		driver.switchTo().defaultContent();
		List<WebElement> iframes1 = driver.findElements(By.tagName("iframe"));
		System.out.println("no of iframes:" + iframes1.size());
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(ele, 150, 150).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
          actions.dragAndDrop(drag, drop).build().perform();
        WebElement dropped = driver.findElement(By.xpath("//div[@id='droppable']/p")); 
        String color = driver.findElement(By.xpath("//div[@id='droppable']/p")).getCssValue("color");
        System.out.println(color);
        String hex = Color.fromString(color).asHex();
        System.out.println(hex);
  		String txt = dropped.getText();
  		System.out.println(txt);
  		if (txt.equalsIgnoreCase("Dropped!")) {
  			System.out.println("tc is passed");
  		}
  		else {
  			System.out.println("tc is failed");
  		}
  		
		
	}

}
