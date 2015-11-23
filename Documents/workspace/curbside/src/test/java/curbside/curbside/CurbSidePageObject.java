package curbside.curbside;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import java.util.List;

public class CurbSidePageObject{
	 public WebDriver driver;
	 
	 public void CurbsidePageObject(WebDriver driver) {
		//this.driver=driver;
	 }
	 
	 public WebDriver getDriver() {
		return driver;
	 }
	 /**
	  * Setting up the web browser
	  * 
	  */
	 @BeforeTest
	 public void setup() {
		 WebDriver driver =  new FirefoxDriver();
		 String url = "https://www.shopcurbside.com/jobs/";
		 driver.get(url);
	  }
	  
	 @Test
	 public void getJobs() { 
		 //Getting all the locations
		 WebElement locelements=driver.findElement(By.id("locationsFilter"));
		   String [] locations=locelements.getText().split("\n");
		    //Checking jobs in every location  
		   for (int i=1;i<locations.length;i++) {
		    	 driver.findElement(By.xpath("//select/option[@value="+"'"+locations[i]+"'"+"]")).click() ;
		    	 //No of jobs
		    	 List<WebElement> elements=driver.findElements(By.className("name"));
		    	 //Printing jobs in each location  
		    	 System.out.println("Location "+locations[i]+ ":Jobs "+elements.size());
		         driver.findElement(By.xpath("//select/option[@value='']")).click() ;
		      }
		  }
	
	 @AfterTest
	  public void closebrowser(){
		  driver.quit();
      }
	
}
