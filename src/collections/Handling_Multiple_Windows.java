package collections;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException 
	{
/*		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String WND1_ID=driver.getWindowHandle();
		
		WebElement Footer_Area=driver.findElement(By.xpath("//div[contains(@id,'pageFooterChildren')]/ul"));
		List<WebElement> Footer_Links=Footer_Area.findElements(By.tagName("a"));
		
		
		for (int i = 0; i < Footer_Links.size(); i++) 
		{
			
			WebElement Each_Link=Footer_Links.get(i);
			System.out.println(Each_Link.getText());
			Each_Link.click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			Footer_Area=driver.findElement(By.xpath("//div[contains(@id,'pageFooterChildren')]/ul"));
			Footer_Links=Footer_Area.findElements(By.tagName("a"));
		}
		
		
	}

}
*/
		
		
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		WebElement Footer_Area=driver.findElement(By.xpath("//ul[@class='fs-2 flex ls-reset']"));
		List<WebElement> Footer_links=Footer_Area.findElements(By.xpath("//a[@class='fs-2 c-secondary-500 td-none hover:td-underline']"));
		System.out.println("Number of footer links available is --> "+Footer_links.size());
		

		//Applying For loop to iterate number of links
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			
			WebElement Eachlink=Footer_links.get(i);
			String Linkname=Eachlink.getText();
			String LinkHref=Eachlink.getAttribute("href");
			
			System.out.println(Linkname+"   "+LinkHref);
			
			Eachlink.click();    //This action will navigate to differnt page
			Thread.sleep(2000);
			
			
			driver.navigate().back();
			Thread.sleep(2000);
			
		
			//Restore all page links to avoid stateElement reference exception..
			Footer_Area=driver.findElement(By.xpath("//ul[@class='fs-2 flex ls-reset']"));
			Footer_links=Footer_Area.findElements(By.xpath("//a[@class='fs-2 c-secondary-500 td-none hover:td-underline']"));
			
		}
		
	

	}

}