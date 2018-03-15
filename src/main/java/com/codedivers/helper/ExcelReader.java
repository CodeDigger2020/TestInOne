package com.codedivers.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private Workbook workbook;

	public ExcelReader(String filePath) {
		File file;
		FileInputStream fis;
		try {
			file = new File(filePath);
			fis = new FileInputStream(file);
			workbook = setWorkBook(fis, filePath);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private Workbook setWorkBook(FileInputStream fis, String filePath) throws IOException {
		if (filePath.endsWith("xls")) {
			return new HSSFWorkbook(fis);
		} else if (filePath.equals("xlsx")) {
			return new XSSFWorkbook(fis);
		} else {
			throw new IllegalArgumentException("File format is not an excel.");
		}
	}

	public Workbook getWorkbook() {
		return workbook;
	}

}
