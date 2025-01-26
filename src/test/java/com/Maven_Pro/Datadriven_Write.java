package com.Maven_Pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.createSheet("unio");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("prabha karan");
		w.getSheet("unio").getRow(0).createCell(1).setCellValue("first rank");
		w.getSheet("unio").createRow(1).createCell(0).setCellValue("john richard");
		w.getSheet("unio").getRow(1).createCell(1).setCellValue("second value");
		w.getSheet("unio").createRow(2).createCell(0).setCellValue("priyanka");
		w.getSheet("unio").getRow(2).createCell(1).setCellValue("third rank");
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
		
	}

}
