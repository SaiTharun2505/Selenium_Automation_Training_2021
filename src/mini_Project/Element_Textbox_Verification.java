package mini_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Element_Textbox_Verification 
{
	
	public static WebDriver driver;
	
	  @Test(priority=0,description="Verification on Element Btn")
	  public void Tc001() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  SoftAssert SAssert=new SoftAssert();
		  Assert.assertTrue(objects.Element_Loc.isDisplayed(), "Element_Btn is not Displayed at Webpage");
		  Reporter.log("Element Btn is Displayed at Webpage",true);
		  Assert.assertTrue(objects.Element_Loc.isEnabled(), "Element_Btn is not Enabled at Webpage");
		  Reporter.log("Element Btn is Enabled at Webpage",true);
		//  System.out.println(objects.Element_Loc.getText());
		  SAssert.assertTrue(objects.Element_Loc.getText().contains("Elements"),"Expected Text is Displayed at Webpage");
		  Reporter.log("Expected Text is Displayed at Webpage : "+objects.Element_Loc.getText(),true);
		  objects.Element_Loc.click();
		  Thread.sleep(3000);
	  }
	  
	  @Test(priority=1,description="Verification on Textbox Btn")
	  public void Tc002()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  SoftAssert SAssert=new SoftAssert();
		  Assert.assertTrue(objects.Textbox_Loc.isDisplayed(), "Textbox Btn is not Displayed at webpage");
		  Reporter.log("Textbox Btn is displayed at webpage",true);
		  Assert.assertTrue(objects.Textbox_Loc.isEnabled(), "Textbox Btn is not Enabled at webpage");
		  Reporter.log("Textbox Btn is Enabled at webpage",true);
		  SAssert.assertTrue(objects.Textbox_Loc.getText().equals("Text Box"), "Expected Text is not Displayed at Webpage");
		  Reporter.log("Expected Text is Displayed at Webpage : "+objects.Textbox_Loc.getText(),true);
		  objects.Textbox_Loc.click();
		  Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/text-box"), "Failed to land on expected Page");
		  Reporter.log("Successfully landed on Expected Page : "+driver.getCurrentUrl(),true);
	  }
	  
	  @Test(priority=2,description="Verification on Full Name Label")
	  public void Tc003()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  Assert.assertTrue(objects.FullName_Label_Loc.isDisplayed(), "FullName Label is Not Displayed at Webpage");
		  Reporter.log("FullName Label is Displayed at Webpage",true);
		  Assert.assertTrue(objects.FullName_Label_Loc.getText().equals("Full Name"), "Expected Text is Not Displayed at Webpage");
		  Reporter.log("Expected Text is Displayed at Webpage : "+objects.FullName_Label_Loc.getText(),true);
	  }

	  @Test(priority=3,description="Verification on FullName Editbox")
	  public void Tc004()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  SoftAssert SAssert=new SoftAssert();
		  Assert.assertTrue(objects.Full_Name_Editbox_Loc.isDisplayed(), "FullName Editbox is Not Displayed at Webpage");
		  Reporter.log("FullName Editbox is Displayed at Webpage",true);
		  Assert.assertTrue(objects.Full_Name_Editbox_Loc.isEnabled(), "FullName Editbox is Not Enabled at Webpage");
		  Reporter.log("FullName Editbox is Enabled at Webpage",true);
		  SAssert.assertTrue(objects.Full_Name_Editbox_Loc.getAttribute("placeholder").equals("Full Name"), "Expected label name inside Editbox is Not Displayed at Webpage");
		  Reporter.log("Expected label name inside editbox is Displayed at Webpage : "+objects.Full_Name_Editbox_Loc.getAttribute("placeholder"),true);
		  objects.Full_Name_Editbox_Loc.clear();
		  objects.Full_Name_Editbox_Loc.sendKeys("Saitharun Sakkaram");
		  Assert.assertTrue(objects.Full_Name_Editbox_Loc.getAttribute("value").equals("Saitharun Sakkaram"), "User typed text is not Presented in Editbox");
		  Reporter.log("User typed text is Presented in Editbox : "+objects.Full_Name_Editbox_Loc.getAttribute("value"),true);
		  
	  }
	  
	   
	  @Test(priority=4,description="Verification on Email Label")
	  public void Tc005()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  Assert.assertTrue(objects.Email_Label_Loc.isDisplayed(), "Email Label is Not Displayed at Webpage");
		  Reporter.log("Email Label is Displayed at Webpage",true);
		  Assert.assertTrue(objects.Email_Label_Loc.getText().equals("Email"), "Expected Text is Not Displayed at Webpage");
		  Reporter.log("Expected Text is Displayed at Webpage : "+objects.Email_Label_Loc.getText(),true);
	  }
	  
	  @Test(priority=5,description="Verification on Email Editbox")
	  public void Tc006()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  SoftAssert SAssert=new SoftAssert();
		  Assert.assertTrue(objects.Email_Editbox_Loc.isDisplayed(), "Email Editbox is Not Displayed at Webpage");
		  Reporter.log("Email Editbox is Displayed at Webpage",true);
		  Assert.assertTrue(objects.Email_Editbox_Loc.isEnabled(), "Email Editbox is Not Enabled at Webpage");
		  Reporter.log("Email Editbox is Enabled at Webpage",true);
		  SAssert.assertTrue(objects.Email_Editbox_Loc.getAttribute("placeholder").equals("name@example.com"), "Expected label name inside Editbox is Not Displayed at Webpage");
		  Reporter.log("Expected label name inside editbox is Displayed at Webpage : "+objects.Email_Editbox_Loc.getAttribute("placeholder"),true);
		  objects.Email_Editbox_Loc.clear();
		  objects.Email_Editbox_Loc.sendKeys("sakkaramsaitharun.144@gmail.com");
		  Assert.assertTrue(objects.Email_Editbox_Loc.getAttribute("value").equals("sakkaramsaitharun.144@gmail.com"), "User typed text is not Presented in Editbox");
		  Reporter.log("User typed text is Presented in Editbox : "+objects.Email_Editbox_Loc.getAttribute("value"),true);
		  
	  }

	  @Test(priority=6,description="Verification on Current Address Label")
	  public void Tc007()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  Assert.assertTrue(objects.CurrentAddress_Label_Loc.isDisplayed(), "CurrentAddress Label is Not Displayed at Webpage");
		  Reporter.log("CurrentAddress Label is Displayed at Webpage",true);
		  Assert.assertTrue(objects.CurrentAddress_Label_Loc.getText().equals("Current Address"), "Expected Text is Not Displayed at Webpage");
		  Reporter.log("Expected Text is Displayed at Webpage : "+objects.CurrentAddress_Label_Loc.getText(),true);
		  
	  }
	  

	  @Test(priority=7,description="Verification on CurrentAddress Editbox")
	  public void Tc008()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  SoftAssert SAssert=new SoftAssert();
		  Assert.assertTrue(objects.CurrentAddress_Editbox_Loc.isDisplayed(), "CurrentAddress Editbox is Not Displayed at Webpage");
		  Reporter.log("CurrentAddress Editbox is Displayed at Webpage",true);
		  Assert.assertTrue(objects.CurrentAddress_Editbox_Loc.isEnabled(), "CurrentAddress Editbox is Not Enabled at Webpage");
		  Reporter.log("CurrentAddress Editbox is Enabled at Webpage",true);
		  SAssert.assertTrue(objects.CurrentAddress_Editbox_Loc.getAttribute("placeholder").equals("Current Address"), "Expected label name inside Editbox is Not Displayed at Webpage");
		  Reporter.log("Expected label name inside editbox is Displayed at Webpage : "+objects.CurrentAddress_Editbox_Loc.getAttribute("placeholder"),true);
		  objects.CurrentAddress_Editbox_Loc.clear();
		  objects.CurrentAddress_Editbox_Loc.sendKeys("Bheerappagadda,uppal,500039");
		  Assert.assertTrue(objects.CurrentAddress_Editbox_Loc.getAttribute("value").equals("Bheerappagadda,uppal,500039"), "User typed text is not Presented in Editbox");
		  Reporter.log("User typed text is Presented in Editbox : "+objects.CurrentAddress_Editbox_Loc.getAttribute("value"),true);
		  
	  }

	  @Test(priority=8,description="Verification on Permanent Address Label")
	  public void Tc009()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  Assert.assertTrue(objects.PermanentAddress_Label_Loc.isDisplayed(), "PermanentAddress Label is Not Displayed at Webpage");
		  Reporter.log("PermanentAddress Label is Displayed at Webpage",true);
		  Assert.assertTrue(objects.PermanentAddress_Label_Loc.getText().equals("Permanent Address"), "Expected Text is Not Displayed at Webpage");
		  Reporter.log("Expected Text is Displayed at Webpage : "+objects.PermanentAddress_Label_Loc.getText(),true);
		  
	  }
	  
	  @Test(priority=9,description="Verification on Permanent Address Editbox")
	  public void Tc0010()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  SoftAssert SAssert=new SoftAssert();
		  Assert.assertTrue(objects.PermanentAddress_Editbox_Loc.isDisplayed(), "PermanentAddress Editbox is Not Displayed at Webpage");
		  Reporter.log("PermanentAddress Editbox is Displayed at Webpage",true);
		  Assert.assertTrue(objects.PermanentAddress_Editbox_Loc.isEnabled(), "PermanentAddress Editbox is Not Enabled at Webpage");
		  Reporter.log("PermanentAddress Editbox is Enabled at Webpage",true);
		  SAssert.assertTrue(objects.PermanentAddress_Editbox_Loc.getAttribute("placeholder").equals("Permanent Address"), "Expected label name inside Editbox is Not Displayed at Webpage");
		  Reporter.log("Expected label name inside editbox is Displayed at Webpage : "+objects.PermanentAddress_Editbox_Loc.getAttribute("placeholder"),true);
		  objects.PermanentAddress_Editbox_Loc.clear();
		  objects.PermanentAddress_Editbox_Loc.sendKeys("Basheerabad,Nizamabad,503225");
		  Assert.assertTrue(objects.PermanentAddress_Editbox_Loc.getAttribute("value").equals("Basheerabad,Nizamabad,503225"), "User typed text is not Presented in Editbox");
		  Reporter.log("User typed text is Presented in Editbox : "+objects.PermanentAddress_Editbox_Loc.getAttribute("value"),true);
		  
	  }
	  
	  @Test(priority=10,description="Verification on Submit button")
	  public void Tc0011() throws Exception
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);

		  JavascriptExecutor JS=((JavascriptExecutor)driver);
		  SoftAssert SAssert=new SoftAssert();
		  Assert.assertTrue(objects.Submit_Btn_Loc.isDisplayed(), "Submit_Btn Btn is not Displayed at webpage");
		  Reporter.log("Submit_Btn Btn is displayed at webpage",true);
		  Assert.assertTrue(objects.Submit_Btn_Loc.isEnabled(), "Submit_Btn Btn is not Enabled at webpage");
		  Reporter.log("Submit_Btn Btn is Enabled at webpage",true);
		  SAssert.assertTrue(objects.Submit_Btn_Loc.getText().equals("Submit"), "Expected Text is not Displayed at Webpage");
		  Reporter.log("Expected Text is Displayed at Webpage : "+objects.Submit_Btn_Loc.getText(),true);
		  
		  JS.executeScript("arguments[0].click();", objects.Submit_Btn_Loc);
		  Thread.sleep(2000);
	  }
	  
	  @Test(priority=11,description="Verification on Submit button")
	  public void Tc0012()
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(driver, Pageobject_For_QAtool.class);
		  
		  Reporter.log(objects.Output.getText(),true);
		  
	  }
		


	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	    };
	  }
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
		  	System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  driver.close();
	  }

	}



