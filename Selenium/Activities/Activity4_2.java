package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		String pageTitle = driver.getTitle();
		System.out.println("PageTitle");
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Gagan");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Munjral");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@example.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("3425262727");
		driver.findElement(By.xpath("//input[@class='ui green button']")).click();
		driver.close();
	}

}
