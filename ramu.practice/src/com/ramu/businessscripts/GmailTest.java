package com.ramu.businessscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ramu.basepage.BaseTest;
import com.ramu.supporters.PropertiesUtilities;
import com.ramu.utilities.DriverUtility;

public class GmailTest extends BaseTest{
	@Test
 public void loginTest() throws IOException, InterruptedException {
		PropertiesUtilities prConf=new PropertiesUtilities(DriverUtility.configPath);
		String url = prConf.getPropertyValue("dev_url");
		String userName = prConf.getPropertyValue("dev_un");
		String pswrd  = prConf.getPropertyValue("dev_pwd");
        getDriver().get(url);
        
        PropertiesUtilities prOr=new PropertiesUtilities(DriverUtility.orPath);
        String unXapth=prOr.getPropertyValue("gmail_hp_un_xpath");
        String nextId =prOr.getPropertyValue("gmail_hp_next");
        getDriver().findElement(By.xpath(unXapth)).sendKeys(userName);
        getDriver().findElement(By.id(nextId)).click();
        Thread.sleep(5000);
        String pwdName = prOr.getPropertyValue("gmail_hp_pwd_name");
        String sign = prOr.getPropertyValue("gmail_hp_signin_id");
        getDriver().findElement(By.name(pwdName)).sendKeys(pswrd);
        getDriver().findElement(By.id(sign)).click();

	}
}
