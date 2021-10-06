package CRMProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity8_Traversingtables {
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

		WebElement accounts = driver.findElement(By.xpath("//a[@id = \"moduleTab_9_Accounts\"]"));
		accounts.click();

		Thread.sleep(5000);
		
		boolean table = driver.findElement(By.xpath("//div[@class = \"list-view-rounded-corners\"]")).isDisplayed();
		System.out.println("Table is displayed:" + table);
		//Find first 5 odd-numbered rows
		String firstRow = driver.findElement(By.xpath("//td[@class = \" inlineEdit\"]")).getText();
		System.out.println("First number row name is:" + firstRow);

		String secondRow = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[3]/td[3]/b/a")).getText();
		System.out.println("Second number row name is:" + secondRow);

		String thirdRow = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[5]/td[3]/b/a")).getText();
		System.out.println("Third number row name is:" + thirdRow);

		String fourthRow = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[7]/td[3]/b/a")).getText();
		System.out.println("fourth number row name is:" + fourthRow);

		String fifthRow = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[9]/td[3]/b/a")).getText();
		System.out.println("Fifth number row name is:" + fifthRow);

	}

	@AfterMethod
	public void afterMethod() {

		//Close the browser
		driver.close();
	}

}
