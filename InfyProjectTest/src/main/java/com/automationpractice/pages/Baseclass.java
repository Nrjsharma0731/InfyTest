package com.automationpractice.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass 
{
	public static Properties pro;
	public static WebDriver driver;
	
	public Baseclass() throws Exception
	{
		pro=new Properties();
		FileInputStream file= new FileInputStream("D:\\Practice Workspace\\InfyProjectTest\\src\\main\\java\\com\\automationpractice\\config\\config.properties");
		
		pro.load(file);
	}
public static void launchApp()
{
	String browsername=pro.getProperty("browser");
	
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(browsername.equals("IEDriverServer"))
	{
		System.setProperty("webdriver.ie.driver", "D:\\Automation\\Drivers\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(pro.getProperty("URL"));
	
}
}
