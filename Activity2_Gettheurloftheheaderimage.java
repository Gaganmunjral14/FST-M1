package CRMProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Activity2_Gettheurloftheheaderimage {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeClass() {
		
		// Create a new instance of the Firefox driver
				driver = new FirefoxDriver();

				//Open the browser
				driver.get("http://alchemy.hguy.co/crm");

			} 
	
  @Test
  public void CRMTestCase() {
	  
	 String urlHeaderImage = driver.findElement(By.xpath("//img[@alt = \"SuiteCRM\"]")).getAttribute("src");
			 
	 System.out.println("Url of the header image is:" + urlHeaderImage);
	
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  //Close the browser
	  driver.close();
  }

}
