package com.ramu.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ramu.basepage.BaseTest;

public interface ScreenshotUtility {
	
	public static void screenshot() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)BaseTest.getDriver();
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(BaseTest.getUserCurDir()
				+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg"));
		
		
		
	}

}
