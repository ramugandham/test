package com.rameshsoft.automaton.gmail.businessscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.rameshsoft.automation.custmoisedexceptions.FrameworkException;

public class ExceptionTest {
public static void main(String[] args) {
	
	int practiceHours = 6;
	
	if (practiceHours>=8) {
		System.out.println("Sure U will be in to company");
	}
	else
	{
		try {
			throw new FrameworkException("PLZ PRACTICE MORE THAN 10 HOURS ....");
		} catch (FrameworkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
