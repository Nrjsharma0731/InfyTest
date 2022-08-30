package com.automationpractice.pages;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CommonTask 
{
	 WebDriver  driver;
	 Properties pro;

	public CommonTask(WebDriver driver, Properties pro) throws IOException
	{
		this.driver=driver;	
		this.pro=pro;
	}
	
	public  void start() throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(pro.getProperty("signbutton"))).click();;
		
		
	}
	

}
