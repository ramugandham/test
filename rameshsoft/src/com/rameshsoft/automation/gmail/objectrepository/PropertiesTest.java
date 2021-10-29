package com.rameshsoft.automation.gmail.objectrepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesTest {
public static void main(String[] args) throws IOException {
	
	FileInputStream fipOr = new FileInputStream("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\objectrepository\\OR_Gmail.properties");
	
	Properties properties = new Properties();
	properties.load(fipOr);
	
	String gh_un_id_Value = properties.getProperty("gh_un_id","123");
	String gh_next_id = properties.getProperty("gh_next_id");
	String gh_signin_id = properties.getProperty("gh_signin_id1","456");
	
	System.out.println(gh_next_id);
	System.out.println(gh_signin_id);
	System.out.println(gh_un_id_Value);
	
	FileInputStream fipConf = new FileInputStream("C:\\selenium\\firstapp\\config.properties");
	properties.load(fipConf);
	
	String url = properties.getProperty("dev_url", "https://www.gmail.com");
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	
	driver.findElement(By.id(gh_un_id_Value)).sendKeys("rameshsoft.selenium");
	driver.findElement(By.id(gh_next_id)).click();
	
	/*properties.setProperty("JOB", "PRACTICE");
	FileOutputStream fop = new FileOutputStream("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\objectrepository\\OR_Gmail.properties");
	properties.store(fop, "file is saved succesfully");
	
	
	properties.remove("JOB");
	//FileOutputStream fop1 = new FileOutputStream("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\objectrepository\\OR_Gmail.properties");
	properties.store(fop, "after removing file is saved succesfully");
	*/
	
	
}
}
