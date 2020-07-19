package com.ExcelParameterizeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.lib.util.Xls_Reader;

public class ParameterizeTest 
{
	//Data driven Approach : Used to create Data Driven Framework.
	//Data Driven : Driving the data from Excel file or some other file
	//Data Driven is also called Parameterization

	public static void main(String[] args) 
	{
//		//WebDriver Launching code
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
//		WebDriver driver=new ChromeDriver(); //Launch Chrome
//		driver.manage().window().maximize(); //Maximizing
//		driver.get("https://www."); //Enter URL
//		System.out.println("Chrome Browser Lauching");
		
		//Get Data from Excel sheet
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Rohit Ranjan\\eclipse-workspace\\DataDrivenFramework.2020\\TestData.xlsx");
		int rowCoount = reader.getRowCount("RegTestData");
		reader.addColumn("RegTestData", "Status");
		
		//Parameterization 
		for(int rowNumber=2;rowNumber<=rowCoount;rowNumber++)
		{
			System.out.println("************************");
			String firstName = reader.getCellData("RegTestData", "firstname", rowNumber);
			System.out.println(firstName);
			
			String lasttName = reader.getCellData("RegTestData", "lasttlame", rowNumber);
			System.out.println(lasttName);
			
			String address1 = reader.getCellData("RegTestData", "address1", rowNumber);
			System.out.println(address1);
			
			String emailAddress = reader.getCellData("RegTestData", "emai", rowNumber);
			System.out.println(emailAddress);
			
			
			//Sending the Data
//			
//			driver.findElement(By.xpath("")).clear();
//			driver.findElement(By.xpath("")).sendKeys(firstName);
//			
//			driver.findElement(By.xpath("")).clear();
//			driver.findElement(By.xpath("")).sendKeys(lasttName);
//			
//			driver.findElement(By.xpath("")).clear();
//			driver.findElement(By.xpath("")).sendKeys(address1);
//			
//			driver.findElement(By.xpath("")).clear();
//			driver.findElement(By.xpath("")).sendKeys(emailAddress);
			
			
			//Add Column and Write the Data to the Excel Sheet
			reader.setCellData("RegTestData", "Status", rowNumber, "PASS");
		}

	}

}
