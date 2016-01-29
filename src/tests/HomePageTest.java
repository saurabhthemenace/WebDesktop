package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	WebDriver driver;
	String baseURL;
	
	@BeforeTest
	public void preCondition()
	{
		baseURL = "http://www.oyorooms.com";
		
	}
	
	@Test
	public void atTest() throws Exception{
		
		driver.get(baseURL);
		System.out.println(driver.getTitle());
		
	}
	
}
