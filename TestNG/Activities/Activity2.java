package testNGTests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	WebDriver driver;

	@BeforeTest
	public void beforeClass() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		//Open the browser
		driver.get("https://www.training-support.net/selenium/target-practice");

	}

	@Test
	public void testCase1() {
		//This test case will pass
		String title = driver.getTitle();
		System.out.println("Page title is:" + "getTitle");
		Assert.assertEquals(title, "Target Practice");
	}

	@Test
	public void testCase2() {
		//This test case will Fail
		boolean blackButton = driver.findElement(By.xpath("//button[@class = 'ui black button']")).isDisplayed();

		Assert.assertEquals( "black", blackButton);

	}

	@Test(enabled = false)
	public void testCase3() {
		//This test will be skipped and not counted
		String subHeading = driver.findElement(By.className("sub")).getText();
		Assert.assertTrue(subHeading.contains("Practice"));
	}

	@Test
	public void testCase4() {

		//This test will be skipped and will be be shown as skipped
		throw new SkipException("Skipping test case");
	}


	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
