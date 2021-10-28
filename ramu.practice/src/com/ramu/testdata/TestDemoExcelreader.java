package com.ramu.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.ramu.supporters.ExcelReader;
import com.ramu.utilities.DriverUtility;

public class TestDemoExcelreader {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelReader er=new ExcelReader("D:\\Ramesh soft\\ramu.practice\\src\\com\\ramu\\testdata\\data1.xls");
		er.getSheetObj("Sheet1");
		System.out.println(er.getSingleCellData("", 0, 0));
		System.out.println(er.getRowData("Sheet1", 1));
		System.out.println(er.getTotalSheetData("Sheet1"));
		System.out.println(er.getTotalUniqueSheetData("Sheet1"));
		System.out.println(er.findDataInSheet("Sheet1", "ramu"));
	}

}
