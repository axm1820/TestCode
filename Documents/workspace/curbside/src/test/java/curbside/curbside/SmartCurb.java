package curbside.curbside;


import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.*;

import java.util.List;

public class SmartCurb {
	
	    public void SmartCurb() {
	    	//Do Nothing
	    }
	
	   @Test
	  public void smartrecruiters() {
			 
			 WebDriver driver =  new FirefoxDriver();
			 String url = "https://careers.smartrecruiters.com/Curbside1/";
		     
			 driver.get(url);
			 // to get the Location info
			 List <WebElement> locations= driver.findElements(By.xpath("//*[@class='opening-title title display--inline-block']"));
		     //to get the jobs in locations
			 List <WebElement> jobs=driver.findElements(By.xpath("//*[@class='title']"));
			 for(int i=0; i< locations.size(); i++) {
			     System.out.println(locations.get(i).getText()+ "  "+jobs.get(i).getText());
		 }
     }
}
