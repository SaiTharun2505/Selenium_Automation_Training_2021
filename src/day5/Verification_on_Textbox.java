package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_on_Textbox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[2]/div[2]")).click();
	
		//Textbox Using Id Locator
		System.out.println("=======================Executing Textbox=========================");
		
		Thread.sleep(3000);
	    driver.findElement(By.id("item-0")).click();
	    //Verifying Url
	    
	    String TB_Expected_Url="https://demoqa.com/text-box";
	    String TB_Actual_Url=driver.getCurrentUrl();
	    
	    if(TB_Actual_Url.equals(TB_Expected_Url))
	    {	
	    	System.out.println("Test Pass; Expected Url is displayed-----> "+TB_Actual_Url);
	    	//Verifying full name label 
	    	WebElement Full_Name_Label=driver.findElement(By.id("userName-label"));
	    	String Act_Full_Name_Text=Full_Name_Label.getText();
	    	String Exp_Full_Name_Text="Full Name";
	    	if(Act_Full_Name_Text.equals(Exp_Full_Name_Text))
	    	{
	    		System.out.println("Test Pass; Label Name is displayed as expected-----> "+Act_Full_Name_Text);
	    		//Verifying Full Name edit box
	    		WebElement Full_Name_Editbox=driver.findElement(By.id("userName"));
	    		Full_Name_Editbox.sendKeys("Saitharun Sakkaram");
	    		Thread.sleep(2000);
	    		String Act_Entered_Full_Name_text=Full_Name_Editbox.getAttribute("value");
	    		String Exp_Entered_Full_Name_text="Saitharun Sakkaram";
	    		if(Act_Entered_Full_Name_text.equals(Exp_Entered_Full_Name_text))
	    		{
	    			System.out.println("Test Pass; As Expected Full Name Text entered correctly----> "+Act_Entered_Full_Name_text);
	    		}
	    		else
	    		{
	    			System.out.println("Test Fail; Expected Full Name Text was not entered correctly----> "+Act_Entered_Full_Name_text);
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("Test Fail: Label Name is not displayed as expected----> "+Act_Full_Name_Text);
	    	}
	    			
	    		
	    	
	    	//Verifying email label
	    	WebElement Email_Label=driver.findElement(By.id("userEmail-label"));
	    	String Act_Email_Label_Text=Email_Label.getText();
	    	String Exp_Email_Label_Text="Email";
	    	if(Act_Email_Label_Text.equals(Exp_Email_Label_Text))
	    	{
	    		System.out.println("Test Pass; Label Name is Displayed as expected------> "+Act_Email_Label_Text);
	    		//Verifying Email Editbox
	    		WebElement Email_Editbox=driver.findElement(By.id("userEmail"));
	    		Email_Editbox.sendKeys("sakkaramsaitharun.144@gmail.com");
	    		Thread.sleep(2000);
	    		String Act_entered_Email=Email_Editbox.getAttribute("value");
	    		String Exp_entered_Email="sakkaramsaitharun.144@gmail.com";
	    		if(Act_entered_Email.equals(Exp_entered_Email))
	    		{
	    			System.out.println("Test Pass; As Expected Email text Was Entered Correctly-----> "+Act_entered_Email);
	    		}
	    		else
	    		{
	    			System.out.println("Expected Email text was not Entered Correctly----> "+Act_entered_Email);
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("Test Fail; Label name is not displayed as expected----> "+Act_Email_Label_Text);
	    	}
	    	
	    	
	    	//Verifying Current Address label
	    	WebElement Current_Address_Label=driver.findElement(By.id("currentAddress-label"));
	    	String Act_Current_Address_Label_Text=Current_Address_Label.getText();
	    	String Exp_Current_Address_Label_Text="Current Address";
	    	if(Act_Current_Address_Label_Text.equals(Exp_Current_Address_Label_Text))
	    	{
	    		System.out.println("Test Pass; Label Name is Displayed as expected------> "+Act_Current_Address_Label_Text);
	    		//Verifying Current Address Editbox
	    		WebElement Current_Address_Editbox=driver.findElement(By.id("currentAddress"));
	    		Current_Address_Editbox.sendKeys("1-38/2, Basheerabad, Kammarpally, Nizamabad, 503225");
	    		Thread.sleep(2000);
	    		String Act_entered_Currernt_Address=Current_Address_Editbox.getAttribute("value");
	    		String Exp_entered_Current_Address="1-38/2, Basheerabad, Kammarpally, Nizamabad, 503225";
	    		if(Act_entered_Currernt_Address.equals(Exp_entered_Current_Address))
	    		{
	    			System.out.println("Test Pass; As Expected Current address text Was Entered Correctly-----> "+Act_entered_Currernt_Address);
	    		}
	    		else
	    		{
	    			System.out.println("Test Fail; Expected Current Adress text was not Entered Correctly----> "+Act_entered_Currernt_Address);
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("Test Fail; Label name is not displayed as expected----> "+Act_Current_Address_Label_Text);
	    	}
	    	
	    	
	    	//Verifying Permanent Adress Label
	    	WebElement Permanent_Adress_Label=driver.findElement(By.id("permanentAddress-label"));
	    	String Act_Permanent_Adress_Label_Text=Permanent_Adress_Label.getText();
			String Exp_Permanent_Adress_Label_Text="Permanent Address";
			if(Act_Permanent_Adress_Label_Text.equals(Exp_Permanent_Adress_Label_Text))
			{
				System.out.println("Test Pass; Permanent Adress Label is Displayed as Expected---->  "+Act_Permanent_Adress_Label_Text);
				//Verifying Permanent address Editbox 
				WebElement Permanent_Address_Editbox=driver.findElement(By.id("permanentAddress"));
				Permanent_Address_Editbox.sendKeys("1-38/2, Basheerabad, Kammarpally, Nizamabad, 503225");
				Thread.sleep(3000);
				String Act_entered_Permanent_Address=Permanent_Address_Editbox.getAttribute("value");
				String Exp_entered_Permanent_Address="1-38/2, Basheerabad, Kammarpally, Nizamabad, 503225";
				if(Act_entered_Permanent_Address.equals(Exp_entered_Permanent_Address))
				{
					System.out.println("Test Pass; As Expected Permanent address text Was Entered Correctly----->   "+Act_entered_Permanent_Address);
				}
				else
				{
					System.out.println("Test Fail; Expected Permanent Address Text was Not Entered correctly----->  "+Act_entered_Permanent_Address);
				}
			}
			else
			{
				System.out.println("Test Fail; Expected Permanent address Label Was Not Displayed---->"+Act_Permanent_Adress_Label_Text);
			}
			Thread.sleep(2000);
			WebElement submit=driver.findElement(By.id("submit")); //Used to resolve Element click intercepted Exception
			boolean submit_btn_Visibility=submit.isDisplayed();
			System.out.println("Submit button is displayed : "+submit_btn_Visibility);
			boolean submit_btn_Enablestatus=submit.isEnabled();
			System.out.println("Submit button is Enabled : "+submit_btn_Enablestatus);
			((JavascriptExecutor)driver).executeScript("arguments[0].click()",submit);
			Thread.sleep(10000);
			
			WebElement Text_Filled=driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));
			String Text_Filled_Element=Text_Filled.getText();
			System.out.println(Text_Filled_Element);
			
			System.out.println("--------------------Textbox Executed Successfully---------------------");
	    }
	    else
	    {
	    	System.out.println("Test Fail; Expected Url is not displayed----> "+TB_Actual_Url);
	    }


	}

}
