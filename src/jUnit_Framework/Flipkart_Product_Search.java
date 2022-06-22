package jUnit_Framework;


import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Product_Search {

	
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		//driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement Search_Btn=driver.findElement(By.xpath("//input[contains(@name,'q')]"));
		assertTrue(Search_Btn.isDisplayed());
		System.out.println("Test Pass Search EditBox is Displayed at webpage ");
		assertTrue(Search_Btn.isEnabled());
		System.out.println("Test Pass Search EditBox is Enabled at webpaga ");
		Search_Btn.sendKeys("Iphone 12 pro max"+Keys.ENTER);
		Thread.sleep(3000);
		Assert.assertEquals("Iphone 12 Pro Max- Buy Products Online at Best Price in India - All Categories | Flipkart.com", driver.getTitle());
		System.out.println("Test Pass As Expected Title Matched");
		
		WebElement Products_Area=driver.findElement(By.xpath("(//div[contains(@class,'_1YokD2 _3Mn1Gg')])[3]"));
		List<WebElement> All_Iphone_Prices=Products_Area.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (int i = 0; i < All_Iphone_Prices.size(); i++) 
		{
			WebElement Single_Iphone_Price=All_Iphone_Prices.get(i);
			String Price_Text=Single_Iphone_Price.getText();
			System.out.println(Price_Text);
		}
		
	}
	
	

}
