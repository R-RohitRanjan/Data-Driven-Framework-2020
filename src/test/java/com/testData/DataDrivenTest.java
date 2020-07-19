package com.testData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.lib.util.Xls_Reader;

public class DataDrivenTest 
{
	public static void main(String[] args)
	{
		//Data driven Approach : Used to create Data Driven Framework.
		//Data Driven : Driving the data from Excel file or some other file
		//Data Driven is also called Parameterization
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.get("https://www."); //Enter URL
		System.out.println("Chrome Browser Lauching");
		
		Xls_Reader reader =new Xls_Reader("");
		String firstName = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstName);
		
		String lasttName = reader.getCellData("RegTestData", "lasttlame", 2);
		System.out.println(lasttName);
		
		String address1 = reader.getCellData("RegTestData", "address1", 2);
		System.out.println(address1);
		
		String emailAddress = reader.getCellData("RegTestData", "emailaddress", 2);
		System.out.println(emailAddress);
		
		
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(firstName);
		
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(lasttName);
		
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(address1);
		
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(emailAddress);
		

	}

}
