package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Links {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		
		String WIN1=driver.getWindowHandle();
		System.out.println(WIN1);
		driver.findElement(By.id("simpleLink")).click();
		Thread.sleep(3000);
		Set<String> All_WIN=driver.getWindowHandles();
		for (String Single_Win : All_WIN) 
		{
			driver.switchTo().window(Single_Win);
		}
		driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][contains(.,'Alerts, Frame & Windows')]")).click();
		
		driver.switchTo().window(WIN1);
		
		driver.findElement(By.id("dynamicLink")).click();
		
		
		
		driver.findElement(By.xpath("//div[@class='card-body'][contains(.,'Elements')]")).click();
		
	}

}
