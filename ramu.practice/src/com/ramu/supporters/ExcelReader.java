package com.ramu.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	private String filepath;
	private FileInputStream fip;
	private Workbook workbook;

	public ExcelReader(String filepath) throws EncryptedDocumentException, IOException {
		this.filepath = filepath;
		fip = new FileInputStream(filepath);
		Workbook workbook = WorkbookFactory.create(fip);

	}

	public Sheet getSheetObj(String sheetName) {
		Sheet sheet = null;
		if (workbook != null) {
			sheet = workbook.getSheet(sheetName);
		}
		return sheet;

	}

	public Sheet getSheetObj(int index) {
		Sheet sheet = null;
		if (workbook != null) {
			sheet = workbook.getSheetAt(0);
		}
		return sheet;

	}

	public String getSingleCellData(String sheetName, int rowNum, int cellNum) {
		String data = "";
		Cell cell = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		if (cell.getCellType() == CellType.NUMERIC) {
			data = cell.getNumericCellValue() + "";
		} else if (cell.getCellType() == CellType.STRING) {
			data = cell.getStringCellValue();
		}
		return data;

	}

	public List<String> getRowData(String sheetName, int rowNum) {
		String data = "";
		List<String> rowData = new ArrayList<>();
		Row row = workbook.getSheet(sheetName).getRow(rowNum);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			Cell cell = row.getCell(i);
			if (cell.getCellType() == CellType.NUMERIC) {
				data = cell.getNumericCellValue() + "";
				rowData.add(data);
			} else if (cell.getCellType() == CellType.STRING) {
				data = cell.getStringCellValue();
				rowData.add(data);
			}
		}
		return rowData;

	}

	public List<String> getTotalSheetData(String sheetName) {
		String data = "";
		List<String> sheetData = new ArrayList<>();
		Sheet sheet1 = workbook.getSheet(sheetName);
		for (int i = 0; i < sheet1.getLastRowNum(); i++) {
			Row row = sheet1.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell.getCellType() == CellType.NUMERIC) {
					data = cell.getNumericCellValue() + "";
					sheetData.add(data);
				} else if (cell.getCellType() == CellType.STRING) {
					data = cell.getStringCellValue();
					sheetData.add(data);
				}
			}
		}
		return sheetData;
	}

	public boolean findDataInSheet(String sheetName, String value) {
		boolean status = true;

		String data = "";
		Sheet sheet1 = workbook.getSheet(sheetName);
		for (int i = 0; i < sheet1.getLastRowNum(); i++) {
			Row row = sheet1.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell.getCellType() == CellType.NUMERIC) {
					data = cell.getNumericCellValue() + "";
					if (data.equalsIgnoreCase(value)) {
						System.out.println("Row is: " + i + " column is : " + j);
					} else {
						System.out.println("Data is not available: " + value);
						status = false;
					}

				} else if (cell.getCellType() == CellType.STRING) {
					data = cell.getStringCellValue();
					if (data.equalsIgnoreCase(value)) {
						System.out.println("Row is: " + i + " column is : " + j);
					} else {
						System.out.println("Data is not available: " + value);
						status = false;
					}
				}
			}
		}
		return status;

	}

	public Set<String> getTotalUniqueSheetData(String sheetName) {
		List<String> data = getTotalSheetData(sheetName);
		Set<String> set = new HashSet<>(data);
		return set;
	}

}
