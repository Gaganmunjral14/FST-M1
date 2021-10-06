package CRMProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity7_Readingadditionalinformation {
	
WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		// Create a new instance of the Firefox driver
				driver = new FirefoxDriver();

				//Open the browser
				driver.get("http://alchemy.hguy.co/crm");
			} 
			
  @Test
  public void  CRMTestCase() throws InterruptedException {
	  
	//Find the username and password fields
	  WebElement username = driver.findElement(By.xpath("//input[@id = \"user_name\"]"));
	  WebElement password = driver.findElement(By.xpath("//input[@id = \"username_password\"]"));
	  
	//Enter credentials
	username.sendKeys("admin");
	password.sendKeys("pa$$w0rd");
	  
	//Click login
	  WebElement login = driver.findElement(By.xpath("//input[@id = \"bigbutton\"]"));
	  login.click();
	  
	  //Find “Activities” menu 
	  WebElement salesmenu = driver.findElement(By.xpath("//a[@id= \"grouptab_0\"]"));
	  
	  salesmenu.click();
	
	  WebElement leads = driver.findElement(By.xpath("//a[@id = \"moduleTab_9_Leads\"]"));
	  
	  leads.click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  Thread.sleep(5000);
	  WebElement additionaldetails = driver.findElement(By.xpath("//span[@title = \"Additional Details\"]"));
	  additionaldetails.click();
	  
	  
	  String phonenumber = driver.findElement(By.className("phone")).getText();

	  
	 System.out.println("The phone number in Additional details is:" + phonenumber);
	
  }

  @AfterMethod
  public void afterMethod() {
	  //Close the browser
	  driver.close();
  }
  }


