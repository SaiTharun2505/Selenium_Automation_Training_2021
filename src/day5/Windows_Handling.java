package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Windows_Handling {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String WIN1_ID=driver.getWindowHandle();
		System.out.println(WIN1_ID);
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'New Tab')]")).click();
		Thread.sleep(3000);
		Set<String> ALL_WIN_IDS=driver.getWindowHandles();
		for (String Single_ID : ALL_WIN_IDS) {
			driver.switchTo().window(Single_ID);
			String NewTab_URL=driver.getCurrentUrl();
			if(NewTab_URL.contains("https://demoqa.com/sample"))
			{
				String WIN2_ID=driver.getWindowHandle();
				System.out.println(WIN2_ID);

			}
			
		}
		
		String Newtab_Msg=driver.findElement(By.xpath("//h1[contains(@id,'sampleHeading')]")).getText();
		System.out.println(Newtab_Msg);
		
		Thread.sleep(3000);
		driver.switchTo().window(WIN1_ID);
		String WIN1_title=driver.getTitle();
		System.out.println(WIN1_title);
		
	}	
}