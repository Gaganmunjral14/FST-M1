package CRMProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity9_Traversingtables2 {
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

		boolean table = driver.findElement(By.xpath("//div[@id = \"content\"]")).isDisplayed();
		System.out.println("Table is displayed:" + table);


		for(int j=1; j<=10; j++){
			WebElement name = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[3]"));
			WebElement user = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[8]"));

			System.out.println("The name of "+ j+ "th lead is " + name.getText() + "and The user access of the lead is " + user.getText());
		}
	}


	@AfterMethod
	public void afterMethod() {
		//Close the browser
		driver.close();
	}

}
