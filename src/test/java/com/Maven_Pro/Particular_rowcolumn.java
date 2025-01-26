package com.Maven_Pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_rowcolumn {
  public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Data.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	Sheet sheetAt = w.getSheetAt(3);
	int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	//outer loop
	
		Row row = sheetAt.getRow(2);
	
	
	int numberOfCells = row.getPhysicalNumberOfCells();
	//inner loop
	
		
	for (int i = 0; i < numberOfCells ; i++) {
		
	
	Cell cell = row.getCell(i);
	CellType cellType = cell.getCellType();
	if (cellType.equals(cellType.STRING)) {
		String value = cell.getStringCellValue();
		System.out.println(value);
	} 
	else if (cellType.equals(cellType.NUMERIC)) {
		double value = cell.getNumericCellValue();
		int num = (int) value;
		System.out.println(value);
	}
  }
  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}
