package day5;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Modal_Dialogs {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/modal-dialogs");
		
		
		driver.findElement(By.xpath("//button[contains(@id,'showSmallModal')]")).click();
		//Thread.sleep(2000);
		WebElement Small_Modal_text_Loc=driver.findElement(By.xpath("//div[contains(@class,'modal-body')]"));
		String Small_Modal_text=Small_Modal_text_Loc.getText();
		System.out.println(Small_Modal_text);
		driver.findElement(By.id("closeSmallModal")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'showLargeModal')]")).click();
		//Thread.sleep(2000);
		WebElement Large_Modal_text_Loc=driver.findElement(By.xpath("//div[@class='modal-body']"));
		String Large_Modal_text=Large_Modal_text_Loc.getText();
		System.out.println(Large_Modal_text);
		driver.findElement(By.xpath("//button[@id='closeLargeModal']")).click();
		
		
		
	}

}
