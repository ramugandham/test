package com.ramu.supporters;

import java.io.IOException;

public class TextReusablesDemo {

	public static void main(String[] args) throws IOException {
		TextReusables textReusables=new TextReusables
				("D:\\Ramesh soft\\ramu.practice\\src\\com\\ramu\\supporters\\demo.txt");
	 textReusables.writeData("ramu");
	 textReusables.writeData("gandham");
		System.out.println ( textReusables.readLine());
		
	System.out.println(textReusables.getTotalFileData());

		
	}

}
