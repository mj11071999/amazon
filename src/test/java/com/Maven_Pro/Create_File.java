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

public class Create_File {
       public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.createSheet("mer");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("RAM");
		w.getSheet("mer").getRow(0).createCell(1).setCellValue(113);
		w.getSheet("mer").createRow(1).createCell(0).setCellValue("kumar");
		w.getSheet("mer").getRow(1).createCell(1).setCellValue(134);
		w.getSheet("mer").createRow(2).createCell(0).setCellValue("adams");
		w.getSheet("mer").getRow(2).createCell(1).setCellValue(455);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
	}
}
