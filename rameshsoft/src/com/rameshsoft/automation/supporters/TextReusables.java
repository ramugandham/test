package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReusables {

	private String filePath;
	private File file;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	
	
	public TextReusables(String filePath) throws IOException{
		this.filePath = filePath;
		file = new File(filePath);
		boolean b = file.createNewFile();
		String status = (b)?"file is created newly":"return existing file";
		System.out.println(status);
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		fileWriter = new FileWriter(file,true);
		bufferedWriter = new BufferedWriter(fileWriter);
	}

	public void writeData(String data) throws IOException{
		bufferedWriter.write(data);
		bufferedWriter.flush();
	}
	
	public void writeData(int data) throws IOException{
		bufferedWriter.write(data);
		bufferedWriter.flush();
	}
	
	public void writeData(char data) throws IOException{
		bufferedWriter.write(data);
		bufferedWriter.flush();
	}
	
	public String readLine() throws IOException
	{
		String value = bufferedReader.readLine();
		return value;
	}
	
	public List getTotalFileData() throws IOException{
		List data = new ArrayList<>();
		while(bufferedReader.ready()){
			String values = bufferedReader.readLine();
			data.add(values);
		}
		return data;
	}	
}

