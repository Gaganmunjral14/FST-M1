package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Acitivty2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in element: " + idLocator.getText());
		WebElement classNameLocator = driver.findElement(By.className("ui inverted huge green button"));
		System.out.println("Text in element: " + classNameLocator.getText());
		WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
		System.out.println("Text in element: " + linkTextLocator.getText());
		WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
		System.out.println("Text in element: " + cssLocator.getText());
	
		driver.close();
		
	}
	

}
