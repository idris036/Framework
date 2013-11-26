package com.actitime.libraries;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericLibrary 
{
	//To get the Row Count Number
	public static int getRowCount(String xlPath, String sheetName)
	{
		try
		{
			FileInputStream fis = new FileInputStream(xlPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			return s.getLastRowNum();
		}
		catch(Exception e)
		{
			return -1;
		}
	}
	
	//To get the Cell value in a particular cell
	public static String getCellValue(String xlPath, String sheetName, int rowNum, int cellNum)
	{
		try
		{
			FileInputStream fis = new FileInputStream(xlPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			return c.getStringCellValue();
		}
		catch(Exception e)
		{
			return " ";
		}
	}
	
	//To get the cell count for a particular Row
	public static int getCellCount(String xlPath, String sheetName, int rowNum)
	{
		try
		{
		FileInputStream fis = new FileInputStream(xlPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheetName);
		Row r = s.getRow(rowNum);
		return r.getLastCellNum();
		}
		catch(Exception e)
		{
			return -1;
		}
	}
	
}
