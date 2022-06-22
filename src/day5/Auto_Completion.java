package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Completion {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/auto-complete");
		
		WebElement Multiple_Colour=driver.findElement(By.id("autoCompleteMultipleInput"));
		Multiple_Colour.sendKeys("Red");
		//Thread.sleep(2000);
		Multiple_Colour.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		
		Multiple_Colour.sendKeys("Green");
		//Thread.sleep(2000);
		Multiple_Colour.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		
		Multiple_Colour.sendKeys("Yellow");
		//Thread.sleep(2000);
		Multiple_Colour.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		
		Multiple_Colour.sendKeys("Blue");
		//Thread.sleep(2000);
		Multiple_Colour.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
	
		WebElement Single_Color=driver.findElement(By.id("autoCompleteSingleInput"));
		Single_Color.sendKeys("Black");
		//Thread.sleep(2000);
		Single_Color.sendKeys(Keys.ENTER);
	
	}

}
