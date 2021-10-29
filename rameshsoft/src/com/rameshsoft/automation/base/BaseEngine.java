package com.rameshsoft.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.rameshsoft.automation.utilities.DriverUtilities;
import com.rameshsoft.automation.utilities.ScreenshotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseEngine {

	private static String baseDir;
	private static WebDriver driver;
	private static String tcName;
	private ExtentReports extentReports;
	private static ExtentTest extentTest;
	
	@Parameters("browser")
	@BeforeSuite
	public void openBrowser(@Optional("chrome")String browser) {
		baseDir = System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(DriverUtilities.firefoxKey, baseDir+DriverUtilities.firefoxValue);
			driver = new FirefoxDriver();
			initActivities();
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(DriverUtilities.chromeKey, baseDir+DriverUtilities.chromeValue);
			driver = new ChromeDriver();
			initActivities();
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty(DriverUtilities.ieKey, baseDir+DriverUtilities.ieValue);
			driver = new InternetExplorerDriver();
			initActivities();
		}
		else if (browser.equalsIgnoreCase("headless")) {
			//driver = new HtmlUnitDriver();
			
		}
	}
	public void initActivities() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@AfterSuite
	public void closeBrowser() {
		if (driver==null)
			System.out.println("Driver is ponting to NULL : @AfterSuite");
		else
			driver.close();	
	}
	
	@BeforeMethod
	public void beforeTcExec(Method method) {
		String tcName =method.getName();
		extentTest = extentReports.startTest(tcName);
		System.out.println("CURRENTLY EXEC TC IS: " +tcName);
		
	}
 	@AfterMethod
	public void afterTCExec(ITestResult result) throws IOException {
		
		if (result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("TC IS PASSED: " + tcName);
			extentTest.log(LogStatus.PASS, "TC IS PASSED: " +tcName);
		}
		else if (result.getStatus()==ITestResult.FAILURE) {
			System.out.println("TC IS FAILED: " + tcName + "SO TAKING SCREENSHOT");
			extentTest.log(LogStatus.FAIL, result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			System.out.println("TC IS SKIPPED: " + tcName + "SO TAKING SCREENSHOT");
			extentTest.log(LogStatus.SKIP, result.getThrowable());
		}
	}
	
	@BeforeTest
	public void intialiseReports() {
		extentReports = new ExtentReports(baseDir+"\\Reports\\report.html");
		
	}
	@AfterTest
	public void generateReports() {
		extentReports.flush();
		extentReports.endTest(extentTest);
	}
	public static WebDriver getDriver(){
		return driver;
	}	
	
	public static String getBaseDir(){
		return baseDir;
	}
 	
	public static String getTCName(){
		return tcName;
	}
	/*@Override
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}*/
	
	public static ExtentTest getExtentTest(){
		return extentTest;
	}
}
