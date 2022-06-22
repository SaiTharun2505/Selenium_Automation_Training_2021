package collections;

import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clear_Trip_Booking_Verification {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");	
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		JavascriptExecutor JS=((JavascriptExecutor)driver);
		
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Any worldwide city or airport')])[1]")).click();
		Thread.sleep(2000);
		WebElement Departure_City=driver.findElement(By.xpath("//p[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]"));
		JS.executeScript("arguments[0].click();", Departure_City);
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Any worldwide city or airport')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(.,'Bangalore, IN - Kempegowda International Airport (BLR)')]")).click();
		
		driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
		Thread.sleep(4000);
		WebElement Date=driver.findElement(By.xpath("(//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top'][contains(.,'25')])[1]"));
		JS.executeScript("arguments[0].click();", Date);
		WebElement Search=driver.findElement(By.xpath("//button[contains(.,'Search flights')]"));
		JS.executeScript("arguments[0].click();", Search);
		Thread.sleep(10000);
		WebElement mobile=driver.findElement(By.xpath("//a[contains(.,'Mobile')]"));
	   /* Actions actions=new Actions(driver);
	    actions.moveToElement(mobile).perform();
*/	    JS.executeScript("arguments[0].hover()", mobile);
	    
	    Thread.sleep(5000);
		
		List<WebElement> All_available_Flights_Price=driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-700 c-neutral-900 h-7']"));
		System.out.println(All_available_Flights_Price.size());
		
	
		for (int i = 0; i < All_available_Flights_Price.size(); i++) 
		{
			
			WebElement Single_Flight=All_available_Flights_Price.get(i);
			String Actual_Data=Single_Flight.getText();
			System.out.println(Actual_Data);
			String Expected_Price="11,908";
			if (Actual_Data.contains(Expected_Price)) 
			{
				System.out.println("Expected Price Matched : "+Actual_Data);
				
				String Path[]= {"(//button[contains(.,'Book')])[1]",
								"(//button[contains(.,'Book')])[2]",
								"(//button[contains(.,'Book')])[3]",
								"(//button[contains(.,'Book')])[4]",
								"(//button[contains(.,'Book')])[5]",
								"(//button[contains(.,'Book')])[6]",
								"(//button[contains(.,'Book')])[7]",
								"(//button[contains(.,'Book')])[8]",
								"(//button[contains(.,'Book')])[9]",
								"(//button[contains(.,'Book')])[10]",
								"(//button[contains(.,'Book')])[11]",
								"(//button[contains(.,'Book')])[12]",
								"(//button[contains(.,'Book')])[13]",
								"(//button[contains(.,'Book')])[14]",
								"(//button[contains(.,'Book')])[15]",
								"(//button[contains(.,'Book')])[16]",
								"(//button[contains(.,'Book')])[17]",
								"(//button[contains(.,'Book')])[18]",
								"(//button[contains(.,'Book')])[19]",
								"(//button[contains(.,'Book')])[20]",
								"(//button[contains(.,'Book')])[21]",
								"(//button[contains(.,'Book')])[22]",
								"(//button[contains(.,'Book')])[23]",
								"(//button[contains(.,'Book')])[24]",
								"(//button[contains(.,'Book')])[25]",
								"(//button[contains(.,'Book')])[26]",
								"(//button[contains(.,'Book')])[27]",
								"(//button[contains(.,'Book')])[28]",
								"(//button[contains(.,'Book')])[29]",
								"(//button[contains(.,'Book')])[30]",
								"(//button[contains(.,'Book')])[31]",
								"(//button[contains(.,'Book')])[32]",
								"(//button[contains(.,'Book')])[33]",
								"(//button[contains(.,'Book')])[34]",
								"(//button[contains(.,'Book')])[35]",
								"(//button[contains(.,'Book')])[36]",
								"(//button[contains(.,'Book')])[37]",
								"(//button[contains(.,'Book')])[38]",
								"(//button[contains(.,'Book')])[39]",
								"(//button[contains(.,'Book')])[40]",
								"(//button[contains(.,'Book')])[41]"};
				
				WebElement Book_Btn=driver.findElement(By.xpath(Path[i]));
				JS.executeScript("arguments[0].click();", Book_Btn);
				System.out.println("Successfully Clicked the Expected Price booking");
				break;
			}
			
		}
		
		
		
		
		
		
	}

}
