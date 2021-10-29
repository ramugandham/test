package com.rameshsoft.automation.gmail.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LoopExcelTest {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	List excelData = new ArrayList<>();
	
	FileInputStream fip = new FileInputStream("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls");
	Workbook workbook = WorkbookFactory.create(fip);

	/*File file = new File("C:\\selenium\\firstapp\\src\\com\\rameshsoft\\automation\\gmail\\testdata\\test.xls");
	Workbook workbook1 = WorkbookFactory.create(file);*/
	
	Sheet sheet1 = workbook.getSheet("Sheet1");

	for(int i=0;i<sheet1.getLastRowNum();i++)
	{
		Row row = sheet1.getRow(i);
		
		for(int j=0;j<row.getLastCellNum();j++)
		{
			Cell cell = row.getCell(j);
			if (cell.getCellType()==CellType.NUMERIC) {
				double data = cell.getNumericCellValue();
				excelData.add(data);
			}
			else if (cell.getCellType()==CellType.STRING) {
				String values = cell.getStringCellValue();
				excelData.add(values);
			}
			else if (cell.getCellType()==CellType.BOOLEAN) {
				boolean values = cell.getBooleanCellValue();
				excelData.add(values);
			}
			
		}
	}
System.out.println(excelData);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
