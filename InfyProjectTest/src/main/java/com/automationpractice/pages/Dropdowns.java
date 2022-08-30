package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns extends Baseclass
{

	public Dropdowns() throws Exception {
		super();
		
	}
	public static void handlebyvalue(WebElement ele, String value )
	{
		Select select= new Select(ele);
		select.selectByValue(value);
			
	}
	
	public static void handlebyindex(WebElement ele, int i)
	{
		Select select= new Select(ele);
		select.selectByIndex(i);
			
	}
	public static void handlebyText(WebElement ele, String text)
	{
		Select select= new Select(ele);
		select.selectByVisibleText(text);
		
	}
		
	

}
