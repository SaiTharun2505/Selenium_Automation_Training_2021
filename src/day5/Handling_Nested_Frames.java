package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Nested_Frames {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		
		WebElement Mainpage_Text_Loc=driver.findElement(By.xpath("(//div[contains(.,'Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.')])[7]"));
		String Mainpage_Text=Mainpage_Text_Loc.getText();
		System.out.println(Mainpage_Text);
		
		driver.switchTo().frame("frame1");
		//driver.switchTo().parentFrame();
		Thread.sleep(2000);
		System.out.println("Parent Link opened");
/*		WebElement ParentText_Loc=driver.findElement(By.xpath("/html/body/text()"));
		String ParentText=ParentText_Loc.getText();
		System.out.println(ParentText);
*/
		
		WebElement Child_Frame_Loc=driver.findElement(By.xpath("/html/body/iframe"));
		driver.switchTo().frame(Child_Frame_Loc);
		Thread.sleep(2000);
		WebElement Child_Text_Loc=driver.findElement(By.xpath("//html[contains(.,'Child Iframe')]"));
		String ChildText=Child_Text_Loc.getText();
		System.out.println(ChildText);
		
		//driver.switchTo().frame("frame1");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		System.out.println("Again Switched back to parent frame successfully");
		//WebElement ParentText_Loc=driver.findElement(By.xpath("/html/body/text()"));
		//String ParentText=ParentText_Loc.getText();
		//System.out.println(ParentText);

		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		String Mainpage_Text1=Mainpage_Text_Loc.getText();
		System.out.println(Mainpage_Text1);

		
		
				
	}

}
