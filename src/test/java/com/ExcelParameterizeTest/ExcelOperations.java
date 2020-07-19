package com.ExcelParameterizeTest;

import com.excel.lib.util.Xls_Reader;

public class ExcelOperations 
{

	public static void main(String[] args) 
	{
		
		//Get Data from Excel sheet
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Rohit Ranjan\\eclipse-workspace\\DataDrivenFramework.2020\\TestData.xlsx");
		
		//reader.addSheet("HomePage");
		
		if(!reader.isSheetExist("HomePage"))
		{
			reader.addSheet("HomePage");
			
		}
		
		else if(!reader.isSheetExist("LoginPage"))
		{
			reader.addSheet("LoginPage");
		}
		
		int colCount = reader.getColumnCount("RegTestData");
		System.out.println(colCount);
		
		int rowCount = reader.getRowCount("RegTestData");
		System.out.println(rowCount);
		
		int countByVal = reader.getCellRowNum("RegTestData", "Status", "PASS1");
		System.out.println(countByVal);
	}
}
