package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class outlook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://outlook.live.com/owa/");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create free account")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("liveDomainInput")).sendKeys("saitharunsakkaram123");
		driver.findElement(By.xpath("//input[contains(@id,'iSignupAction')]")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.className("email-input-max-width has-error")).sendKeys("sai@143");
		driver.findElement(By.xpath("//input[contains(@id,'iSignupAction')]")).click();

	}

}
