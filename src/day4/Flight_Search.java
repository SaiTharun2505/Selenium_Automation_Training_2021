package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight_Search {

	public static void main(String[] args) throws Exception
	{
     System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
     WebDriver driver =new ChromeDriver();
     driver.get("https:\\cleartrip.com");
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     Thread.sleep(2000);
		
     driver.findElement(By.id("RoundTrip")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("FromTag")).clear();
     driver.findElement(By.id("FromTag")).sendKeys("HYD");
     Thread.sleep(2000);
     driver.findElement(By.id("ui-id-4")).click();
	
     driver.findElement(By.id("ToTag")).clear();
     driver.findElement(By.id("ToTag")).sendKeys("DEL");
     Thread.sleep(2000);
     driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
     driver.findElement(By.id("DepartDate")).clear();
     driver.findElement(By.id("DepartDate")).sendKeys("Tue, 20 Apr, 2021");
     driver.findElement(By.id("ReturnDate")).clear();
     driver.findElement(By.id("ReturnDate")).sendKeys("Sun, 25 Apr, 2021",Keys.ESCAPE);
     new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("4");
     new Select(driver.findElement(By.id("Childrens"))).selectByVisibleText("2");
     new Select(driver.findElement(By.id("Infants"))).selectByVisibleText("1");
	}

}
