package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\PROFESSIONAL\\eclipse workspace\\Se_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@id,'fromCity')]")).sendKeys("hyd");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText'][contains(.,'Hyderabad, India')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@autocomplete,'off')]")).sendKeys("del");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='calc60'][contains(.,'Delhi, India Delhi Airport')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[4]/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@data-cy='returnDefaultText'][contains(.,'Tap to add a return date for bigger discounts')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/div[3]/div")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
