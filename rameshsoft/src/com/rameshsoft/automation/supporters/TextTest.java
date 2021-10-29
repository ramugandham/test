package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextTest {
public static void main(String[] args) throws IOException {
	
	//FileInputStream fip = new FileInputStream("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\supporters\\abc.txt");
	
	File file = new File("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\supporters\\abc.txt");
	boolean b = file.createNewFile();
	String status = (b)?"file is created newly":"return existing file";
	System.out.println(status);
	
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	
	while(bufferedReader.ready()){
		System.out.println(bufferedReader.readLine());
	}
	
	
	/*System.out.println(bufferedReader.readLine());
	System.out.println(bufferedReader.readLine());
	System.out.println(bufferedReader.readLine());
	System.out.println(bufferedReader.readLine());
	System.out.println(bufferedReader.readLine());
	*/
	
	
	/*FileWriter fileWriter = new FileWriter(file,true);
	//FileWriter fileWriter = new FileWriter("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\supporters\\abc.txt");
	
	//FileWriter fileWriter = new FileWriter(file,true);
	//FileWriter fileWriter = new FileWriter("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\supporters\\abc.txt",true);
	
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	
	bufferedWriter.write("Hello");
	bufferedWriter.newLine();
	bufferedWriter.write("PLZ PRACTICE");
	bufferedWriter.newLine();
	bufferedWriter.write("JOB IS VERY EASY");
	bufferedWriter.newLine();
	bufferedWriter.flush();
	*/
	

}
}
