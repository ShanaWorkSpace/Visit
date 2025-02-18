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
	 public void logOut() {
		 WebElement Profile = driver.findElement(By.cssSelector("img.w-full"));
		 Profile.click();
		 WebElement signout = driver.findElement(By.cssSelector("svg.icon"));
		 signout.click();
	 }
	 public void forgot() {
		 WebElement link = driver.findElement(By.xpath("//p[contains(@class, 'text-[#32b1dc]') and normalize-space(text())='Forgotpassword?']"));
		 link.click();
		 WebElement title = driver.findElement(By.xpath("//h3[contains(text(), 'Forgot Your Password')]"));
		 title.getText();
		 WebElement emailfp = driver.findElement(By.xpath("//input[@name='email' and @type='text']"));
		 emailfp.sendKeys("reshravi1234@gmail.com");
		 WebElement next = driver.findElement(By.xpath("//button[contains(@class, 'bg-[#1A73E8]')]"));
		 next.click();
		 WebElement text= driver.findElement(By.xpath("//p[contains(text(),'If your email is registered')]"));
		 text.getText();
		 WebElement close=driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
		 close.click();
	 }
}


