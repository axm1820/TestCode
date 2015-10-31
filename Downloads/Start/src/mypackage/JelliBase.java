package mypackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

@Test
public class JelliBase {
 public WebDriver driver;
private String url;
 
 
   public JelliBase(String url) {
	   this.url=url;
   }
   
   public String geturl(){
	   return url;
   }
 
  @BeforeClass
  public void setup() {
	  driver=new FirefoxDriver();
	  driver.get(geturl());
	 
  }
  public WebDriver getdriver(){
	  return driver;
  }
  
  @Test
  public void fill_inputform() throws InterruptedException {
	    
	     
	      String actual=driver.getCurrentUrl();
	      WebElement emailaddress=driver.findElement(By.id("ember325"));
		  WebElement password=driver.findElement(By.id("ember330"));
		  emailaddress.sendKeys("automation@jelli.com");
		  password.sendKeys("123456");
}
  
  @Test
  public void submit(){
	  WebElement submitbtn=driver.findElement(By.id("ember352"));
	  submitbtn.click();
//	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
  }
  
  @Test
  public void validate_login(){
  
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
  String url="https://accounts.qa.jelli.com/#/home/userProfile";
  Assert.assertEquals(driver.getCurrentUrl(),url);
  WebElement username= driver.findElement(By.className("user-name"));
  WebElement usertitle=driver.findElement(By.className("user-title"));
  Assert.assertEquals(username.getText(), "Automation1 QA1");
  Assert.assertEquals(usertitle.getText(), "Engineer");
}
  
  @AfterClass
  public void teardown() {
	  driver.close();
  }
 }


