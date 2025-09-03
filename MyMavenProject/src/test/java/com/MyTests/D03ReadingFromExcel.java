package com.MyTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class D03ReadingFromExcel {
	String fPath = "C:\\Users\\Dell\\Desktop\\OHRM Assignment_Data.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFCell cell;
	
	public static void main(String[] args) throws IOException {
		D03ReadingFromExcel d1 = new D03ReadingFromExcel();
		d1.readData();

	}
	public void readData() throws IOException
	{
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		
		for(int i = 0; i < sheet.getPhysicalNumberOfRows(); i++)
		{
			for(int j = 0; j < sheet.getRow(0).getPhysicalNumberOfCells(); j++) {
				cell = sheet.getRow(i).getCell(j);

				switch(cell.getCellType())
				{
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				default:
					break;
				}
			}
		}
		
		wb.close();
		fis.close();
	}
}
