package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
	
		 // Create a new instance of the Firefox driver
		  WebDriver driver = new FirefoxDriver();
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  
		  //Open the browser
		  driver.get("https://training-support.net/selenium/ajax");
		  
		  String pageTitle = driver.getTitle();
	        System.out.println("Page title is:" + "pageTitle");
	        
	      //Find and click the button
	        driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
	        
	      //Wait for text to load
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
	 
	        //getText() and print it
	        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(ajaxText);
	        
	        //Wait for late text
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	        
	        //Get late text and print it
	        String lateText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(lateText);
	 
	        //Close browser
	        driver.close();
	    }
	}
