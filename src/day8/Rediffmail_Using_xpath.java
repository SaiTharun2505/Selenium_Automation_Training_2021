package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffmail_Using_xpath {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[contains(@name , 'name')]")).sendKeys("Saitharun");
		
		//Choose a Rediffmail ID
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("sakkaramsaitharun");
		
		//Check Availabilty
		
		driver.findElement(By.xpath("//input[contains(@name,'btnchkavail')]")).click();
		Thread.sleep(2000);
		//Printing availability statement
		
		String CheckAvailability=driver.findElement(By.xpath("//font[@color='#009200']")).getText();
		System.out.println("Checking Availabiltiy  " +CheckAvailability);
		
		//Password
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Balayya@123");
		
		//Retype password
		
		driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("Balayya@123"); //Partial css
		
		//Checkbox no alternate email address
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		
		//Select a security question
		
		Select SecurityQ=new Select(driver.findElement(By.xpath("//select[contains(@name,'hintq')]")));
		SecurityQ.selectByIndex(3);
		
		//Emter the answer for security question
		
		driver.findElement(By.xpath("//input[contains(@name,'hinta')]")).sendKeys("Music&Alcohol");
		
		//Mother name before marraige
		
		driver.findElement(By.xpath("//input[contains(@name,'mothername')]")).sendKeys("Sharadha");
		
		//Mobile number 
		
		driver.findElement(By.xpath("//input[contains(@name,'mobno')]")).sendKeys("9542950884");
		
		//Date of birth
		
		new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"))).selectByIndex(26);
		new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"))).selectByIndex(4);
		new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"))).selectByVisibleText("1997");
		new Select(driver.findElement(By.xpath("//select[contains(@name,'city')]"))).selectByVisibleText("Hyderabad");
		
		


	}

}
