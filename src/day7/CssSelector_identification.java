package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_identification {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("9542950884");
		driver.findElement(By.cssSelector("._9npi")).sendKeys("sai@143");
		//driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		driver.close();
	/*
		driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Saitharun");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Sakkaram");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("sakkaramsaitharun.144@gmail.com");
		Thread.sleep(6000);
		//driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sakkaramsaitharun.144@gmail.com");
		
		WebElement RE=driver.findElement(By.cssSelector("div[class='mbm _a4y']>div>div[class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"));
		
	*/
	
	}

}
