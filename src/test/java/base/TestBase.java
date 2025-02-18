package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase 
{
  protected WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://dev.visit.ictkerala.org/");
//driver.get(ConfigReader.getProperty("URL"));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
	

