 package com.ramu.basepage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ramu.utilities.DriverUtility;
import com.ramu.utilities.ScreenshotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	private static WebDriver driver;
	private static String userCurDir;
	private static String tcName;
	private ExtentReports extentReports;
	private static ExtentTest extentTest;
	

	@Parameters("browser")
	@BeforeSuite
	public void openBrowser(@Optional("chrome") String browser) {
		userCurDir = System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty(DriverUtility.chromekeys, DriverUtility.chromevalue);
			driver = new ChromeDriver();
			driverInit();
		} else if (browser.equalsIgnoreCase("firefoxe")) {
			System.setProperty(DriverUtility.firefoxkeys, DriverUtility.firefoxvalue);
			driver = new FirefoxDriver();
			driverInit();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty(DriverUtility.iekeys, DriverUtility.ievalue);
			driver = new FirefoxDriver();
			driverInit();
		}
	}

	@AfterSuite
	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		} else {
			System.out.println("DRIVER is pointing to NULL..PLZ CHECK");
		}

	}

	private void driverInit() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);

	}
	@BeforeMethod
	public void beforeTCExec(Method method) {
		String tcName = method.getName();
		extentTest = extentReports.startTest(tcName);
		System.out.println("CURRENTLY EXEC TC IS: " +tcName);
	}
	@AfterMethod
	public void afterTCExecution(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("tc is executed succesfully;"+result.getName());
			extentTest.log(LogStatus.PASS, "TC IS PASSED: " +tcName);
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("tc is failed takescreenshot ;"+result.getName());
			   ScreenshotUtility.screenshot();    
			   extentTest.log(LogStatus.FAIL, "TC IS FAILED: " +tcName);
				extentTest.log(LogStatus.FAIL, result.getThrowable());
			
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			System.out.println("tc is skip takescreenshot ;"+result.getName());
		    ScreenshotUtility.screenshot();
		    extentTest.log(LogStatus.SKIP, result.getThrowable());
		}
		
		extentReports.flush();
		extentReports.endTest(extentTest);
	}
	@BeforeTest
	public void initReports() {
		extentReports = new ExtentReports(userCurDir+"\\Reports\\report.html");
	}
	@AfterTest
	public void closeReport() {
		extentReports.close();
	}

	

	public static String getUserCurDir() {

		return userCurDir;
	}

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
	

	public static String getTcName() {
		// TODO Auto-generated method stub
		return tcName;
	}
	public static ExtentTest getExtentTest()
	{
		return extentTest;
	}

}
