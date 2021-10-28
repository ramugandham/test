package com.ramu.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReusables {

	private String filepath;
	private File file;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;

	public TextReusables(String filepath) throws IOException {
		this.filepath = filepath;
		file = new File(filepath);
		boolean b = file.createNewFile();
		String status = (b) ? "file is creat" : "file is already exit";
		System.out.println(status);
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		fileWriter = new FileWriter(file);
		bufferedWriter = new BufferedWriter(fileWriter);
	}

	public void writeData(String data) throws IOException {
		bufferedWriter.write(data);
		bufferedWriter.flush();

	}

	public void writeData(int data) throws IOException {
		bufferedWriter.write(data);
		bufferedWriter.flush();

	}

	public void writeData(char data) throws IOException {
		bufferedWriter.write(data);
		bufferedWriter.flush();
	}

	public String readLine() throws IOException {
		String value = bufferedReader.readLine();
		return value;

	}

	public List getTotalFileData() throws IOException {

		List data = new ArrayList<>();
		while (bufferedReader.ready()) {
			String values = bufferedReader.readLine();
			data.add(values);
		}

		return data;

	}

}
