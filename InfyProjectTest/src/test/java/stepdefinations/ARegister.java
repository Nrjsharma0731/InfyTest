package stepdefinations;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.automationpractice.pages.Baseclass;
import com.automationpractice.pages.CommonTask;
import com.automationpractice.pages.Dropdowns;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ARegister extends Baseclass
{
	public ARegister() throws Exception {
		super();
		
	}

	@Given("^user is on website$")
	public void user_is_on_website() 
	{
		Baseclass.launchApp();
		String title=driver.getTitle();
		if(title.equalsIgnoreCase(pro.getProperty("MyStore")))
		{
			System.out.println("we on correct page");
		}
	    
	}

	@Given("^Click Signin on the landing page$")
	public void click_Signin_on_the_landing_page() throws Exception 
	{
		CommonTask task= new CommonTask(driver, pro);
		task.start();
		String title=driver.getTitle();
		if(title.equalsIgnoreCase(pro.getProperty("Loginpage")))
		{
			System.out.println("we on correct page");
		}
		else
			System.out.println("incorrect page");
		
	    
	}

	@When("^Create Account by entering email address$")
	public void create_Account_by_entering_email_address() throws Exception  
	{
		driver.findElement(By.xpath(pro.getProperty("emailbox"))).sendKeys(pro.getProperty("useremail"));
		driver.findElement(By.xpath(pro.getProperty("SubmitCreate"))).click();
		Thread.sleep(1000);
		String createpage=driver.findElement(By.xpath(pro.getProperty("verifyCreatepage"))).getText();
		if(createpage.equalsIgnoreCase(pro.getProperty("textCreatepage")))
		{
			System.out.println("we on correct page");
		}
		else
			System.out.println("incorrect page");
		
		
	    
	}

	@When("^Enter details on the Your Personal Information$")
	public void enter_details_on_the_Your_Personal_Information() 
	{
	    driver.findElement(By.xpath(pro.getProperty("mr"))).click();
	    driver.findElement(By.xpath(pro.getProperty("firstname"))).sendKeys(pro.getProperty("userfirst"));
	    driver.findElement(By.xpath(pro.getProperty("lastname"))).sendKeys(pro.getProperty("userlast"));
	    driver.findElement(By.xpath(pro.getProperty("password"))).sendKeys(pro.getProperty("pass"));
	    WebElement day=driver.findElement(By.xpath(pro.getProperty("day")));
	    WebElement month=driver.findElement(By.xpath(pro.getProperty("month")));
	    WebElement year=driver.findElement(By.xpath(pro.getProperty("year")));
	    
	    
	    Dropdowns.handlebyvalue(day, "2");
	    Dropdowns.handlebyindex(month, 3);
	    Dropdowns.handlebyvalue(year, "2000");
	    driver.findElement(By.xpath(pro.getProperty("newsletter"))).click();
	    driver.findElement(By.xpath(pro.getProperty("offers"))).click();
	    driver.findElement(By.xpath(pro.getProperty("company"))).sendKeys(pro.getProperty("companyname"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,250)", "");
	    driver.findElement(By.xpath(pro.getProperty("address1"))).sendKeys(pro.getProperty("addressfill1"));
	    driver.findElement(By.xpath(pro.getProperty("address2"))).sendKeys(pro.getProperty("addressfill2"));
	    driver.findElement(By.xpath(pro.getProperty("city"))).sendKeys(pro.getProperty("cityfill"));
	    WebElement state= driver.findElement(By.xpath(pro.getProperty("state")));
	    Dropdowns.handlebyindex(state, 2);
	    driver.findElement(By.xpath(pro.getProperty("zipcode"))).sendKeys(pro.getProperty("pcode"));
	    js.executeScript("window.scrollBy(0,250)", "");
	    WebElement country= driver.findElement(By.xpath(pro.getProperty("country")));
	    Dropdowns.handlebyindex(country, 1);
	    driver.findElement(By.xpath(pro.getProperty("mphone"))).sendKeys("9087654321");
	    
	}

	@Then("^User account is created and logged in app$")
	public void user_account_is_created_and_logged_in_app() 
	{
		 driver.findElement(By.xpath(pro.getProperty("register"))).click();
		 String expecteduser=pro.getProperty("userfirst")+" "+pro.getProperty("userlast");
		 System.out.println(expecteduser);
		 String actualuser=driver.findElement(By.xpath(pro.getProperty("logindetails"))).getText();
		 if(expecteduser.equalsIgnoreCase(actualuser))
		 {
			 System.out.println("Account Created successfully");
		 }
		 else
		 {
			 System.out.println("Account creation failed");
		 }
		 
		 driver.findElement(By.xpath(pro.getProperty("logout"))).click();
		 String title=driver.getTitle();
		 if(title.equalsIgnoreCase(pro.getProperty("Loginpage")))
			{
				System.out.println("we on correct page");
			}
		 else
				System.out.println("incorrect page");
		 
		 driver.close();
	   
	}

}
