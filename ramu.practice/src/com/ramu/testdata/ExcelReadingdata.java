package com.ramu.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingdata {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fip=new FileInputStream("D://Ramesh soft//ramu.practice//src//com//ramu//testdata//data1.xls");
Workbook workbook=WorkbookFactory.create(fip);
ArrayList<String> data=new ArrayList<>();
Sheet  sheet1 = workbook.getSheet("Sheet1");
for(int i=0;i<sheet1.getLastRowNum();i++) {
	Row row=sheet1.getRow(i);
	for(int j=0;j<row.getLastCellNum();j++) {
		Cell cell=row.getCell(j);
		if(cell.getCellType()==CellType.NUMERIC) {
			String value = cell.getNumericCellValue()+"";
			data.add(value);
			if(value.equalsIgnoreCase("ramu")) {
				System.out.println("row is;"+i+"cell is;"+j+"data is"+value);
			}
		}
		else if(cell.getCellType()==CellType.STRING) {
			System.out.println(cell.getStringCellValue());
			String value=cell.getStringCellValue();
			data.add(value);
			if(value.equalsIgnoreCase("ramu")) {
				System.out.println("row is;"+i+"cell is;"+j+"data is"+value);
			}
		}
	}
	
}
// read the data for only string type cell values
/*Row  row0 = sheet1.getRow(0);
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
*/
	
System.out.println(data);
}
}
