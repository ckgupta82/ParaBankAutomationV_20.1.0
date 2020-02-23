package com.parabank.qa.util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

	public static int PAGE_LOAD_TIMEOUTS = 10;
	public static int ImplicitWaitTime = 30;

	public static int getRowCount(String WorkBookPath,String SheetName) throws Exception
	{
		XSSFWorkbook wb = new XSSFWorkbook(WorkBookPath);
		XSSFSheet sh = wb.getSheet(SheetName);
		int rowCount = sh.getPhysicalNumberOfRows();
		return rowCount;

	}
	public static String getCellData(String WorkBookPath,String SheetName,int rownum, int columnnum) throws Exception
	{
		XSSFWorkbook wb = new XSSFWorkbook(WorkBookPath);
		XSSFSheet sh = wb.getSheet(SheetName);
		String Cval = sh.getRow(rownum).getCell(columnnum).getStringCellValue();
		return Cval;
	}
}
