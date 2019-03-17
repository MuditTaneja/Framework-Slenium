package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataProvider {

	XSSFWorkbook wb;

	public excelDataProvider() {
		File src = new File("./TestData/TestDataFrmwrk.xlsx");

		try {

			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {
			System.out.println("unable to load excel");
		}
	}

	public String getStringData(String sheetName, int row, int column) {

		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();

	}
	
	public String getStringData(int sheetIndex, int row, int column) {

		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();

	}

	public Double getNumricData(String sheetName, int row, int column) {

		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
