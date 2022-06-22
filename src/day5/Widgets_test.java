package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Widgets_test {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement widget=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[4]/span/div"));
		executor.executeScript("arguments[0].click();", widget);
		
		//Accordian
	/*	
		WebElement Accordian=driver.findElement(By.xpath("(//li[@class='btn btn-light '][@id='item-0'])[3]"));
		executor.executeScript("arguments[0].click();", Accordian);
		String Expected_Url="https://demoqa.com/accordian";
		String Actual_Url=driver.getCurrentUrl();
		
		if(Expected_Url.equals(Actual_Url))
		{
			System.out.println("Expected Url is displayed");
			driver.findElement(By.id("section1Heading")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("section1Heading")).click();
			Thread.sleep(3000);
			String text1=driver.findElement(By.id("section1Content")).getText();
			System.out.println(text1);
			Thread.sleep(3000);
			driver.findElement(By.id("section1Heading")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("section2Heading")).click();
			Thread.sleep(3000);
			String text2=driver.findElement(By.id("section2Content")).getText();
			System.out.println(text2);
			Thread.sleep(3000);
			driver.findElement(By.id("section2Heading")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("section3Heading")).click();
			Thread.sleep(3000);
			String text3=driver.findElement(By.id("section3Content")).getText();
			System.out.println(text3);
		}
		else
		{
			System.out.println("Expected url not displayed");
		}
	
		
		//Auto complete
		WebElement Auto_complete=driver.findElement(By.xpath("(//li[@class='btn btn-light '][@id='item-1'])[3]"));
		executor.executeScript("arguments[0].click();", Auto_complete);
		String AC_Expected_url="https://demoqa.com/auto-complete";
		String AC_Actual_url=driver.getCurrentUrl();		
		if(AC_Expected_url.equals(AC_Actual_url))
		{
			System.out.println("Expected Url is displayed");
			Thread.sleep(3000);
			System.out.println("=======Multiple input box======");
			WebElement multi_colour=driver.findElement(By.id("autoCompleteMultipleInput"));
			multi_colour.sendKeys("Blu");
			Thread.sleep(2000);
			multi_colour.sendKeys(Keys.ENTER);
			multi_colour.sendKeys("Pur");
			Thread.sleep(2000);
			multi_colour.sendKeys(Keys.ENTER);
			multi_colour.sendKeys("Gre");
			Thread.sleep(2000);
			multi_colour.sendKeys(Keys.ENTER);
			
			System.out.println("=======Single input box======");
			WebElement Single_colour=driver.findElement(By.id("autoCompleteSingleInput"));
			Single_colour.sendKeys("bla");
			Thread.sleep(2000);
			Single_colour.sendKeys(Keys.ENTER);
		}
		else
		{
			System.out.println("Expected Url is not displayed");
		}
		
	*/	
		
		
		
		
		
	}

}
