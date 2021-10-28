package com.rameshsoft.automation.seleniumcore;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsTest {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.gmail.com");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File file = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\selenium\\firstapp\\screenshots\\gmailhome.jpeg"));
	
	
	
	
	
	
	
	
	
	
/*	SessionId id = driver.getSessionId();
	System.out.println("Session ID: " + id);

	File file = driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\selenium\\firstapp\\screenshots\\gmailhome.jpeg"));
	
	driver.close();
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*WebElement userName = driver.findElement(By.id("identifierId"));	
	Actions actions = new Actions(driver);
//actions.click(userName).sendKeys("rameshsoft.selenium").build().perform();
	Actions actions1 = actions.click(userName);
	Actions actions2 = actions1.sendKeys("rameshsoft.selenium");
	Action action = actions2.build();
	action.perform();
	
	//actions.click(userName).sendKeys("rameshsoft.selenium").perform();
	
	actions.sendKeys(userName, "Rameshsoft.selenium").build().perform();
	
	
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
}
