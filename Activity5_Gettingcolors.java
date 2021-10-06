package CRMProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity5_Gettingcolors {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		// Create a new instance of the Firefox driver
				driver = new FirefoxDriver();

				//Open the browser
				driver.get("http://alchemy.hguy.co/crm");
			} 
			
  @Test
  public void  CRMTestCase() {
	  
	//Find the username and password fields
	  WebElement username = driver.findElement(By.xpath("//input[@id = \"user_name\"]"));
	  WebElement password = driver.findElement(By.xpath("//input[@id = \"username_password\"]"));
	  
	//Enter credentials
	username.sendKeys("admin");
	password.sendKeys("pa$$w0rd");
	  
	//Click login
	  WebElement login = driver.findElement(By.xpath("//input[@id = \"bigbutton\"]"));
	  login.click();
	  
	  
	  String colormenu = driver.findElement(By.cssSelector(".desktop-toolbar")).getCssValue("color");
	  
	 System.out.println("Color of the navigation menu is: " + colormenu);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //Close the browser
	  driver.close();
  }
  }


