package com.ramu.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="loginDataProvider")
	public void login(String un,String pwd) {
		System.out.println(un+"......"+pwd);	
		}
	@DataProvider
	public Object[][] loginDataProvider(){
		Object[][] a = new Object[3][3];
		a[0][0]="Hello";
		a[0][1]="practice";
		a[1][0]="soon start fws";
		a[1][1]="job is easy if u know fws";
		return a;
				
	}
	
	
}
