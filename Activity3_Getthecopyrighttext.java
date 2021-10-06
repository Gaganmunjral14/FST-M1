package CRMProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity3_Getthecopyrighttext {
	WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() {
			
			// Create a new instance of the Firefox driver
					driver = new FirefoxDriver();

					//Open the browser
					driver.get("http://alchemy.hguy.co/crm");

				} 
	
  @Test
  public void CRMTestCase() {
	  
	  String copyrightText = driver.findElement(By.xpath("//a[@id = \"admin_options\"]")).getText();
		 
		 System.out.println("copyrightText in the footer is:" + copyrightText);
	  
  }
 
  @AfterMethod
  public void afterMethod() {
	  //Close the browser
	  driver.close();
  }

}
