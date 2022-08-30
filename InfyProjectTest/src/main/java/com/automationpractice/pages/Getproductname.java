package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Getproductname extends Baseclass
{

	public Getproductname() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static String productname(String value)
	{
		driver.findElement(By.xpath(pro.getProperty(value)));
		return value;
	}

}
