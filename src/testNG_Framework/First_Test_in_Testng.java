package testNG_Framework;

import org.testng.annotations.Test;

import pageObjectModel.With_PageFactory.Facebook_Registration_Reusable;

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;


public class First_Test_in_Testng {
	WebDriver driver;
	
  @Test(description="",priority=0,dataProvider="dp",dataProviderClass=DataProvider_Fb_Registration.class)
  public void registration(String FirstName,String SurName,String Email,String Email_Conformation,String New_Password,String Date,String Month,String Year) 
  {
	  
	  Facebook_Registration_Reusable Signup=PageFactory.initElements(driver, Facebook_Registration_Reusable.class);
	  Signup.FirstName_TB.clear();
	  Signup.FirstName_TB.sendKeys(FirstName);
	  Signup.SurName_TB.clear();
	  Signup.SurName_TB.sendKeys(SurName);
	  Signup.Email_TB.clear();
	  Signup.Email_TB.sendKeys(Email);
	  Signup.Email_Conformation_TB.clear();
	  Signup.Email_Conformation_TB.sendKeys(Email_Conformation);
	  Signup.New_Password_TB.clear();
	  Signup.New_Password_TB.sendKeys(New_Password);
	  new Select(Signup.Birth_Day_DD).selectByVisibleText(Date);
	  new Select(Signup.Birth_Month_DD).selectByVisibleText(Month);
	  new Select(Signup.Birth_Year_DD).selectByVisibleText(Year);
	  Signup.Radio_Btn_Male.click();
  }
  @BeforeClass
  public void beforeClass()
  {
	    System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() 
  {
	 // driver.close();
  }
  


}
