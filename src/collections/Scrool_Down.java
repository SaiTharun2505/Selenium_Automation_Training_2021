package collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrool_Down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[2]/div[2]")).click();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
		

	}

}
