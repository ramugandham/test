package com.ramu.java18features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StreamFilterTest {

	public static void main(String[] args) {
		 List<String> data =new ArrayList<>();
		 data.add("java");
		 data.add("selenium");
		 data.add("javarameshsoft");
		 data.add("javapractice");
		 data.stream().filter(s->s.length()>=2).collect(Collectors.toList());
		 data.forEach(s->System.out.println(s));
		 

		//selenium
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\ram\\ramu.practice\\Drivers\\chromedriver.exe ");
		 * 
		 * RemoteWebDriver driver=new ChromeDriver(); driver.get("https://gmail.com");
		 * List<WebElement> ele = driver.findElements(By.xpath("//*"));
		 * Stream<WebElement> stream = ele.stream(); List<WebElement> ele1 =
		 * stream.filter(element->element.isDisplayed()&&element.isEnabled())
		 * .collect(Collectors.toList());
		 * 
		 * ele1.forEach(System.out::println);
		 */
	}

}
