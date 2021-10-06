package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity3 {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		driver = new FirefoxDriver();

		//Open browser
		driver.get("https://www.training-support.net/selenium/login-form");
	}

	@Test
	public void testcase() {
		
		//Find the username and password fields
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		//Enter credentials
		username.sendKeys("admin");
		password.sendKeys("password");
		
		//Click login
		WebElement login = driver.findElement(By.xpath("//button[@class= 'ui button']"));
		login.click();
		
		   //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
    }
	
	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
