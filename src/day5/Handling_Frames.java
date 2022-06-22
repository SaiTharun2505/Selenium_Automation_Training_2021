package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement Default_Window=driver.findElement(By.xpath("(//div[contains(.,'Sample Iframe page There are 2 Iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame, which is this window, and the two frames below')])[7]"));
		String Main_Page_Text=Default_Window.getText();
		System.out.println(Main_Page_Text);
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame1");
		WebElement Sample_Text_Loc=driver.findElement(By.id("sampleHeading"));
		String Sample_Text=Sample_Text_Loc.getText();
		System.out.println(Sample_Text);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("frame2");
		Thread.sleep(3000); 
		WebElement Sample_Text_loc_2 = driver.findElement(By.id("sampleHeading"));
		String Sample_Text_1=Sample_Text_loc_2.getText();
		System.out.println(Sample_Text_1);
		

	}

}
