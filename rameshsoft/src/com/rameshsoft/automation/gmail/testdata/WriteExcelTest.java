package com.rameshsoft.automation.gmail.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelTest {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fip = new FileInputStream("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls");
	Workbook workbook = WorkbookFactory.create(fip);

	/*File file = new File("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls");
	Workbook workbook1 = WorkbookFactory.create(file);*/
	
	Sheet sheet1 = workbook.getSheet("Sheet1");
	
	Row row2 = sheet1.createRow(2);
	
	Cell cell20 = row2.createCell(0);
	cell20.setCellValue("PRACTICE");
	
	row2.createCell(1).setCellValue("JOB IS VERY EASY");
	
	FileOutputStream fop = new FileOutputStream("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls");
	
	workbook.write(fop);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
