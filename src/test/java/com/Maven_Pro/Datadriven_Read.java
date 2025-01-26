package com.Maven_Pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Datadriven_Read {
     public static void read_all_data() throws IOException {
     File f = new File("C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Data.xlsx");
     FileInputStream fis = new FileInputStream(f);
     Workbook w = new XSSFWorkbook(fis);//upcasting
     Sheet sheetAt = w.getSheetAt(3);
     int numberofrows = sheetAt.getPhysicalNumberOfRows();
     for (int i = 0; i < numberofrows ; i++) {
    	 Row row = sheetAt.getRow(i);
    	 int numberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < numberOfCells; j++) {
			Cell cell = row.getCell(j);
			org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if (cellType.equals(cellType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				int num = (int) value;//narrowing type casting
				System.out.println( value);
			}
		}
	}
      
     
	}
     
     public static  void read_particular_data() throws IOException {
    	 System.out.println("      ** particular data  **");
      File f = new File("C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Data.xlsx");
      FileInputStream fis = new FileInputStream(f);
      Workbook w = new XSSFWorkbook(fis);
      Sheet sheetAt = w.getSheetAt(3);
      Row row = sheetAt.getRow(6);
      Cell cell = row.getCell(3);
      org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
      if (cellType.equals(cellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			int num = (int) value;//narrowing type casting
			System.out.println( value);
		}
      
      
      
	}
     
     public static void main(String[] args) throws IOException {
    	 read_all_data();
    	 read_particular_data();
	}
}
