package com.ramu.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ramu.utilities.ScreenshotUtility;

public class TestListener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("SUITE EXECUTION IS FINISH ");

	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("SUITE EXECUTION IS STARTED ");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		try {
			ScreenshotUtility.screenshot();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("TC IS FAILED: " + arg0.getName());
		System.out.println(" TC IS FAILED DUE TO: " + arg0.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		try {
			ScreenshotUtility.screenshot();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("TC IS SKIPPED: " + arg0.getName());
		System.out.println(" TC IS SKIPPED DUE TO: " + arg0.getThrowable());
		

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("CURRENTLY EXECUTING TC IS: " + arg0.getName());

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("TC IS PASSED: " + arg0.getName());

	}

}
