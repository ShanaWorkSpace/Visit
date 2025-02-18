package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage log;
	
	
	@Test
	public void testURL() {
	String currentDashUrl=driver.getCurrentUrl();
    Assert.assertEquals(currentDashUrl, "https://dev.visit.ictkerala.org/");
    System.out.println("Test:URL Verification passed");
	}
	
	@Test
	public void Login_Manager() {
	log = new LoginPage(driver);
	log.titleCheck();
	log.enterUsername();
	log.enterPassword();
	log.eye();
	log.signIn();
	
	System.out.println("Test:Manager Login Verification passed");
	}
	
}
