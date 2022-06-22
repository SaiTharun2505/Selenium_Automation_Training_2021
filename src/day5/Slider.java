package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider");
		
		/*WebElement src=driver.findElement(By.xpath("//input[contains(@class,'range-slider')][@value='25']"));
		WebElement dst=driver.findElement(By.xpath("//input[contains(@class,'range-slider')][@value='51']"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(src).moveToElement(dst).release().perform();
	*/
		WebElement src1=driver.findElement(By.xpath("//input[contains(@class,'range-slider')]"));
		src1.sendKeys("50");
	
	
	}

}
