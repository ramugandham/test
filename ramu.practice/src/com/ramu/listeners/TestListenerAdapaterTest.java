package com.ramu.listeners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.ramu.utilities.ScreenshotUtility;

public class TestListenerAdapaterTest extends TestListenerAdapter{
	
	
	@Override
	public void onTestFailure(ITestResult arg0) {
		try {
			ScreenshotUtility.screenshot();
		} catch (IOException e) {
			
		}
		System.out.println("TC IS FAILED: " +arg0.getName());
		System.out.println(" TC IS FAILED DUE TO: " +arg0.getThrowable());;
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		try {
			ScreenshotUtility.screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("TC IS SKIPPED: " +arg0.getName());
		System.out.println(" TC IS SKIPPED DUE TO: " +arg0.getThrowable());;
	}

	

}
