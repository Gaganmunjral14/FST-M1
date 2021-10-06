package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/");
		String title = driver.getTitle();
		System.out.println("title is" + title);
		WebElement aboutUs = driver.findElement(By.id("about-link"));
		Thread.sleep(1000);
		driver.close();
	}

}
