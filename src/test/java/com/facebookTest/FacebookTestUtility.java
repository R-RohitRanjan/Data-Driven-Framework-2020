package com.facebookTest;

import java.util.ArrayList;

import com.excel.lib.util.Xls_Reader;

public class FacebookTestUtility 
{
	static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try
		{
			reader = new Xls_Reader("C:\\Users\\Rohit Ranjan\\eclipse-workspace\\DataDrivenFramework.2020\\TestData.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int rowNum = 2; rowNum<=reader.getRowCount("RegTestData");rowNum++)
		{
			String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
			String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
			String emailAddress = reader.getCellData("RegTestData", "email", rowNum);
			String password = reader.getCellData("RegTestData", "password", rowNum);
			String day = reader.getCellData("RegTestData", "day", rowNum);
			String month = reader.getCellData("RegTestData", "month", rowNum);
			String year = reader.getCellData("RegTestData", "year", rowNum);
			
			Object ob[] = {firstName, lastName, emailAddress, password, day, month, year};
			myData.add(ob);
		}
		return myData;
	}
}
