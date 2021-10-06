package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
      driver.get("https://training-support.net/selenium/dynamic-controls");
      
      String pageTitle = driver.getTitle();
      System.out.println("Page itle is:" + "pageTitle");
    	
    //Find the checkbox
      WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
      System.out.println("The checkbox Input is displayed: " + checkboxInput.isSelected());

    //Select the checkbox
     checkboxInput.click();

      System.out.println("The checkbox Input is displayed: " + checkboxInput.isSelected());

      //Close the browser
      driver.close();

  }
	}


