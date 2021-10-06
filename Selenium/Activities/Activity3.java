package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("title is" + title);
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		firstName.sendKeys("Gagan");
		lastName.sendKeys("Munjral");
		
		driver.findElement(By.id("email")).sendKeys("test@example.com");
		driver.findElement(By.id("number")).sendKeys("1234567898");
		
		
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		//driver.findElement(By.className("//input[contains(@class, 'ui green button')]")).click();
		
		driver.close();
		

	}

}
