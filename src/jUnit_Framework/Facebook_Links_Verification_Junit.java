package jUnit_Framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Links_Verification_Junit {

	
	static WebDriver driver;
	//static String Browser_Path="UpdatedDrivers\\";
	static String Url="https://www.facebook.com/";
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "UpdatedDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get(Url);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//a[contains(@title,'Sign up for Facebook')]")).click();
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		System.out.println("Sign Up link was clicked successfully");
	}

}



