package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automationpractice.pages.Baseclass;
import com.automationpractice.pages.CommonTask;
import com.automationpractice.pages.Getproductname;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutProduct extends Baseclass
{
	static String Actualproduct;

	public CheckoutProduct() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable 
	{
		Baseclass.launchApp();
		String title=driver.getTitle();
		if(title.equalsIgnoreCase(pro.getProperty("MyStore")))
		{
			System.out.println("we on correct page");
		}
		else
			System.out.println("incorrect page");
	}

	@When("^user login in the app$")
	public void user_login_in_the_app() throws Throwable 
	{
		CommonTask task= new CommonTask(driver, pro);
		task.start();
		driver.findElement(By.xpath(pro.getProperty("signbutton"))).click();
		driver.findElement(By.xpath(pro.getProperty("userid"))).sendKeys(pro.getProperty("useremail"));
		driver.findElement(By.xpath(pro.getProperty("userpswd"))).sendKeys(pro.getProperty("pass"));
		driver.findElement(By.xpath(pro.getProperty("SubmitLogin"))).click();
		String title= driver.getTitle();
		if(title.equalsIgnoreCase(pro.getProperty("myaccount")))
		{
			System.out.println("we on correct page");
		}
		else
			System.out.println("incorrect page");
		
	}

	@When("^user select a product and add to cart$")
	public void user_select_a_product_and_add_to_cart() throws Throwable 
	{
		WebElement sections= driver.findElement(By.xpath(pro.getProperty("women")));
		Actions ac=new Actions(driver);
		ac.moveToElement(sections).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("tshirts"))).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,250)", "");
	    WebElement products= driver.findElement(By.xpath(pro.getProperty("products")));
	    products.click();
	    driver.findElement(By.xpath(pro.getProperty("addcart"))).click();
	    driver.findElement(By.xpath(pro.getProperty("proceed"))).click();
	    
	    
	    
		
	    
	}

	@When("^user proceed to checkout$")
	public void user_proceed_to_checkout() throws Throwable 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actualproduct =driver.findElement(By.xpath(pro.getProperty("getproduct"))).getText();
	    js.executeScript("window.scrollBy(0,500)", "");
	    driver.findElement(By.xpath(pro.getProperty("proceed1"))).click();
	    js.executeScript("window.scrollBy(0,500)", "");
	    driver.findElement(By.xpath(pro.getProperty("processAddress"))).click();
	    js.executeScript("window.scrollBy(0,500)", "");
	    driver.findElement(By.xpath(pro.getProperty("checkbox"))).click();
	    driver.findElement(By.xpath(pro.getProperty("processCarrier"))).click();
	}

	@Then("^user go to payment page$")
	public void user_go_to_payment_page() throws Throwable 
	{
		String paytext=driver.findElement(By.xpath(pro.getProperty("paymentpage"))).getText();
		if(paytext.equalsIgnoreCase(pro.getProperty("expectedtextforpayment")))
		{
			System.out.println("you are on payment page");
		}
		else
			System.out.println("you are not on payment page");
	    
	}

	@Then("^verify the selected product$")
	public void verify_the_selected_product() throws Throwable {
		String expectedproduct=driver.findElement(By.xpath(pro.getProperty("getproduct"))).getText();
	    if(expectedproduct.equalsIgnoreCase(Actualproduct))
	    {
	    	System.out.println("Product is same you can proceed for payment");
	    }
	    else
	    	System.out.println("Product is not same");
	}

}
