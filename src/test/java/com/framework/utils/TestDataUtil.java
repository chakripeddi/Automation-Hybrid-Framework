package com.framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataUtil {

  
    public static String [][] getData() throws IOException {

		File file = new File("./src/test/resources/testdata/users.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sht = wb.getSheet("valid");

		int row = sht.getLastRowNum();
		int col = sht.getRow(0).getLastCellNum();


		String[][] data = new String[row][col];

		for (int i = 1; i <=row; i++) {
			for (int j = 0; j < col; j++) {
					data[i-1][j]=sht.getRow(i).getCell(j).getStringCellValue();
			}
			}
		return data;
    }
}
