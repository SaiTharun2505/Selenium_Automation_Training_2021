package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RedIffmail_Using_css {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		/*  Using dynamic cssSelector or partial selector
			
			*   ----> To match any characters in Property value
			^   ----> To match first characters in Property value
			$   ----> To match last characters in Property value
			Thread.sleep(3000);
			driver.close();
		*/
		
		//FullName
		
		driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("Saitharun Sakkaram");
		                              //or
		//driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("Saitharun Sakkaram");
		
		//Choose a Rediffmail ID
		
		driver.findElement(By.cssSelector("input[name*='login']")).sendKeys("sakkaramsaitharun");
		
		//Check Availabilty
		
		driver.findElement(By.cssSelector("input[name*='btnchkavail']")).click();
		Thread.sleep(2000);
		//Printing availability statement
		
		String CheckAvailability=driver.findElement(By.cssSelector("font[color='#009200']")).getText();
		System.out.println("Checking Availabiltiy  " +CheckAvailability);
		
		//Password
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Balayya@123");
		
		//Retype password
		
		driver.findElement(By.cssSelector("input[name*='confirm_passwd']")).sendKeys("Balayya@123"); //Partial css
		
		//Checkbox no alternate email address
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(2000);
		
		//Select a security question
		
		Select SecurityQ=new Select(driver.findElement(By.cssSelector("select[name*='hintq']")));
		SecurityQ.selectByIndex(3);
		
		//Emter the answer for security question
		
		driver.findElement(By.cssSelector("input[name*='hinta']")).sendKeys("Music&Alcohol");
		
		//Mother name before marraige
		
		driver.findElement(By.cssSelector("input[name*='mothername']")).sendKeys("Sharadha");
		
		//Mobile number 
		
		driver.findElement(By.cssSelector("input[name*='mobno']")).sendKeys("9542950884");
		
		//Date of birth
		
		new Select(driver.findElement(By.cssSelector("select[name*='DOB_Day']"))).selectByIndex(26);
		new Select(driver.findElement(By.cssSelector("select[name*='DOB_Month']"))).selectByIndex(4);
		new Select(driver.findElement(By.cssSelector("select[name*='DOB_Year']"))).selectByVisibleText("1997");
		new Select(driver.findElement(By.cssSelector("select[name*='city']"))).selectByVisibleText("Hyderabad");
		
		
		
		
		
		
		
		
		
	}

}
