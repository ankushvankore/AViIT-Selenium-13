package com.MyTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class D03ReadingFromExcel {
	String fPath = "C:\\Users\\Dell\\Desktop\\OHRM Assignment_Data.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFCell cell;

	public static void main(String[] args) throws IOException {
		//D03ReadingFromExcel d1 = new D03ReadingFromExcel();
		//d1.readData();

	}

	@DataProvider
	public String[][] readData() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[rows][cells];
		String d = "";

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				cell = sheet.getRow(i).getCell(j);

				switch (cell.getCellType()) {
				case NUMERIC:
					d = String.valueOf(cell.getNumericCellValue());
					break;
				case STRING:
					d = cell.getStringCellValue();
					break;
				default:
					break;
				}
				data[i][j] = d;
			}
		}

		wb.close();
		fis.close();
		
		return data;
	}
}
