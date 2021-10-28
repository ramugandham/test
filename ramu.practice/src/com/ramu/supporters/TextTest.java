package com.ramu.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TextTest {

	public static void main(String[] args) throws IOException {
	File file=new File("D:\\Ramesh soft\\ramu.practice\\src\\com\\ramu\\supporters\\demo.txt");
	boolean b=file.createNewFile();
   String status=(b)?"file is create":"file is already exit";
	System.out.println(status);
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	ArrayList<String> fileData = new ArrayList<>();
	int count = 0;
	while (bufferedReader.ready()) {
		fileData.add(bufferedReader.readLine());
		System.out.println(fileData.get(count));
		count++;
	}
	System.out.println(fileData);
	/*while(bufferedReader.ready()) {
		System.out.println(bufferedReader.readLine());
	}*/
	/*FileWriter fileWriter=new  FileWriter(file, true);
	BufferedWriter  bufferedWriter=new BufferedWriter(fileWriter);
	bufferedWriter.write("java");
	bufferedWriter.newLine();
	bufferedWriter.write("selenium");
	bufferedWriter.newLine();
	bufferedWriter.write("testing");
	bufferedWriter.newLine();
	bufferedWriter.write("seleniumtesting");
	bufferedWriter.flush();*/
	}

}
