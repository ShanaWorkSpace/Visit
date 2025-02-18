package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
}
