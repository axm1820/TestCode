package mypackage;

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


public class Logout {
	String url="https://login.qa.jelli.com/index.html?service=accounts&target=https%3A%2F%2Faccounts.qa.jelli.com%2F#/authentication/loggedOut";
	
	JelliBase jb;
	public  Logout(JelliBase jb){
		this.jb=jb;
	}
	
	public void logout() throws InterruptedException {

		jb.setup();
		jb.fill_inputform();
		jb.submit();
		WebDriver driver=jb.getdriver();
		WebElement signout=driver.findElement(By.linkText("Sign Out"));
		signout.click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		jb.teardown();
}
	
	
}
