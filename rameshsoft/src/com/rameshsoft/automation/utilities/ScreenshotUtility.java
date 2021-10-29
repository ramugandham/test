package com.rameshsoft.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.rameshsoft.automation.base.BaseEngine;

public interface ScreenshotUtility {

	public static String screenshot() throws IOException
	{
		String loc = BaseEngine.getBaseDir()+"\\screenshots\\"+BaseEngine.getTCName()+".jpeg";
		TakesScreenshot ts = (TakesScreenshot)BaseEngine.getDriver();
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(BaseEngine.getBaseDir()+"\\screenshots\\"+BaseEngine.getTCName()+".jpeg"));
		return loc;
	}
	
}


