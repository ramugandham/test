package com.ramu.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {
	public static void main (String [] args) throws IOException{
        //I have placed an excel file 'Test.xlsx' in my D Driver 
FileInputStream fis = new FileInputStream("‪‪C://Users//dell//Desktop//data1.xls");
Workbook workbook=WorkbookFactory.create(fis);

Sheet  sheet1 = workbook.getSheet("Sheet2");

Row  row0 = sheet1.getRow(0);
Cell  cell00 = row0.getCell(0);
String cellvalue00 = cell00.getStringCellValue();
System.out.println("cell value is:"+cellvalue00);
Cell  cell01 = row0.getCell(1);
String cellvalue01 = cell01.getStringCellValue();
System.out.println("cell value is:"+cellvalue01);
Row  row1 = sheet1.getRow(1);
Cell  cell10 = row1.getCell(0);
String cellvalue10 = cell10.getStringCellValue();
System.out.println("cell value is:"+cellvalue10);
Cell  cell11 = row1.getCell(1);
String cellvalue11 = cell11.getStringCellValue();
System.out.println("cell value is:"+cellvalue11);


}		

}
