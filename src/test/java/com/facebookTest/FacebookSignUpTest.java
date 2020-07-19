package com.facebookTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookSignUpTest 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://www.facebook.com/"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData = FacebookTestUtility.getDataFromExcel();
		return testData.iterator();
		
	}
	
	@Test(dataProvider = "getTestData")
	public void loginTest(String firstName, String lasttName, String emailAddress,
			String password, String day, String month, String year )
	{
		driver.findElement(By.id("u_0_m")).clear();
		driver.findElement(By.id("u_0_m")).sendKeys(firstName);
		
		driver.findElement(By.id("u_0_o")).clear();
		driver.findElement(By.id("u_0_o")).sendKeys(lasttName);
		
		driver.findElement(By.id("u_0_r")).clear();
		driver.findElement(By.id("u_0_r")).sendKeys(emailAddress);
		
		driver.findElement(By.id("u_0_w")).clear();
		driver.findElement(By.id("u_0_w")).sendKeys(password);
		
		driver.findElement(By.id("day")).clear();
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText(day);
		
		driver.findElement(By.id("month")).clear();
		Select select1=new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText(month);
		
		driver.findElement(By.id("year")).clear();
		Select select2=new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText(year);
		
		driver.findElement(By.id("u_0_7")).clear();
		driver.findElement(By.id("u_0_7")).click();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
