package com.learnningautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	
	XSSFWorkbook Wb ;

	
	public ExcelDataProvider() throws IOException {
		
		File Src = new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream Fis = new FileInputStream(Src);
			XSSFWorkbook Wb = new XSSFWorkbook(Fis);
		} catch (Exception e) {
			
			System.out.println("Unable to read data from Excel"+e.getMessage());
		} 
		
	}
	
	
        public String getStringData(int sheetIndex ,int row , int coloum) {
		
		return Wb.getSheetAt(sheetIndex).getRow(row).getCell(coloum).getStringCellValue();
		
	}
	
	
	public String getStringData(String SheetName ,int row , int coloum) {
		
		return Wb.getSheet(SheetName).getRow(row).getCell(coloum).getStringCellValue();
		
	}
	
	public double getNumericData(String SheetName ,int row , int coloum) {
		
		return Wb.getSheet(SheetName).getRow(row).getCell(coloum).getNumericCellValue();
		
	}
}
