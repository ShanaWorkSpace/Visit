package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void titleCheck() {
		 WebElement pass = driver.findElement(By.xpath("//h2[contains(text(), 'Welcome Back!')]"));
		 pass.getText();
	 }
	 public void enterUsername() {
		 WebElement user = driver.findElement(By.xpath("//input[@name='userId']"));
		 user.sendKeys("manager1@ictkerala.org");
	 }
		
	 public void enterPassword() {
		 WebElement pass = driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']"));
		 pass.sendKeys("@Manager#952");
	 }
	 
	 public void eye() {
		 WebElement eye = driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']"));
		 eye.click();
	 }
	 
	 public void signIn() {
		 WebElement signin = driver.findElement(By.xpath("//button[contains(text(),'Sign In') and contains(@class, 'bg-[#32b1dc]')]"));
		 signin.click();
	 }
	 
}


