package com.rameshsoft.automation.gmail.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fip = new FileInputStream("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls");
	Workbook workbook = WorkbookFactory.create(fip);

	/*File file = new File("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls");
	Workbook workbook1 = WorkbookFactory.create(file);*/
	
	Sheet sheet1 = workbook.getSheet("Sheet1");
	//Sheet sheet1 = workbook.getSheetAt(0);
	
	Row row0 = sheet1.getRow(0);
	
	Cell cell00 = row0.getCell(0);
	String cell00Value = cell00.getStringCellValue();
	System.out.println("OR OC Data is: " +cell00Value);
	
	System.out.println("0R 1C Data is: " +row0.getCell(1).getStringCellValue());
	
	Row row1 = sheet1.getRow(1);
	
	String cell10Value = row1.getCell(0).getStringCellValue();
	String cell11Value = row1.getCell(1).getStringCellValue();
	System.out.println(cell10Value+"......"+cell11Value);
}
}
