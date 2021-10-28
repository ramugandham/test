package com.ramu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownsSpicejet {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Ramesh soft\\selenium.rameshsoft.workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		String actualvalue = driver.getTitle();
		System.out.println(actualvalue);
		String expectedvalue = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String data = (actualvalue.equalsIgnoreCase(expectedvalue)) ? "page is open" : "page is not open";
		System.out.println(data);

		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		
		/*driver.findElement(By.xpath(" //a[text='Hyderabad (HYD)']")).click();
		driver.findElement(By.xpath(" //select[@value='ATQ']")).click();
*/
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
	
	//	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1']")).click();
		//driver.findElement(By.xpath("//div[@id='dropdownGroup1']/div[@class='dropdownDiv']/ul/li[@class='city_selected ']/a[@value='BLR']")).click();
		
		

		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	WebElement ele = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select=new Select(ele);
		select.selectByVisibleText("USD");
	    select.selectByIndex(2);
	    Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='ad-row-right'])[2]/span[3]")).click();
	driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
	}

}
