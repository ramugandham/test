package com.ramu.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\Ramesh soft\\ramu.practice\\src\\com\\ramu\\testdata\\data1.xls");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet1=workbook.getSheetAt(0);
		Row row2=sheet1.createRow(2);
		Cell cell20=row2.createCell(0);
		cell20.setCellValue("ramu");
		row2.createCell(1).setCellValue("gandham");
		Row row3=sheet1.createRow(3);
		Cell cell30=row3.createCell(0);
		cell30.setCellValue("naga");
		row3.createCell(1).setCellValue("g");

		
		FileOutputStream fop=new FileOutputStream("D:\\Ramesh soft\\ramu.practice\\src\\com\\ramu\\testdata\\data1.xls");
		workbook.write(fop);
	}

}
