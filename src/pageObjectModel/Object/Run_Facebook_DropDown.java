package pageObjectModel.Object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Facebook_DropDown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Facebook_Dropdown DropDown=PageFactory.initElements(driver, Facebook_Dropdown.class);
		DropDown.DropDown_Selection(DropDown.Month, "May");
		DropDown.DropDown_Selection(DropDown.Year, "1998");
		DropDown.DropDown_Selection(DropDown.Date, "25");

	}

}
