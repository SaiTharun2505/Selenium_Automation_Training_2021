package pageObjectModel.With_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Run_Facebook_Registration_PageFactory {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Facebook_Registration_Reusable Signup=PageFactory.initElements(driver, Facebook_Registration_Reusable.class);
		
		//FirstName EditBox
		
		boolean FirstName_TB_Visibiliy=Signup.FirstName_TB.isDisplayed();
		System.out.println("FirstName text box is displayed at webpage : "+FirstName_TB_Visibiliy);
		boolean FirstName_TB_Enable=Signup.FirstName_TB.isEnabled();
		System.out.println("FirstName text box is Enabled at webpage : "+FirstName_TB_Enable+"\n");
		Signup.FirstName_TB.clear();
		Signup.FirstName_TB.sendKeys("Saitharun");
		
		//SurName EditBox
		
		boolean SurName_TB_Visibiliy=Signup.SurName_TB.isDisplayed();
		System.out.println("SurName text box is displayed at webpage : "+SurName_TB_Visibiliy);
		boolean SurName_TB_Enable=Signup.SurName_TB.isEnabled();
		System.out.println("SurName text box is Enabled at webpage : "+SurName_TB_Enable+"\n");
		Signup.SurName_TB.clear();
		Signup.SurName_TB.sendKeys("Sakkaram");
		
		//Email EditBox
		
		boolean Email_TB_Visibiliy=Signup.Email_TB.isDisplayed();
		System.out.println("Email text box is displayed at webpage : "+Email_TB_Visibiliy);
		boolean Email_TB_Enable=Signup.Email_TB.isEnabled();
		System.out.println("Email text box is Enabled at webpage : "+Email_TB_Enable+"\n");
		Signup.Email_TB.clear();
		Signup.Email_TB.sendKeys("sakkaramsaitharun.144@gmail.com");
		
		//Email Conformation EditBox
		
		boolean Email_Conformation_TB_Visibiliy=Signup.Email_Conformation_TB.isDisplayed();
		System.out.println("Email_Conformation text box is displayed at webpage : "+Email_Conformation_TB_Visibiliy);
		boolean Email_Conformation_TB_Enable=Signup.Email_Conformation_TB.isEnabled();
		System.out.println("Email_Conformation text box is Enabled at webpage : "+Email_Conformation_TB_Enable+"\n");
		Signup.Email_Conformation_TB.clear();
		Signup.Email_Conformation_TB.sendKeys("sakkaramsaitharun.144@gmail.com");
		
		//New Password EditBox
		
		boolean New_Password_TB_Visibiliy=Signup.New_Password_TB.isDisplayed();
		System.out.println("New_Password text box is displayed at webpage : "+New_Password_TB_Visibiliy);
		boolean New_Password_TB_Enable=Signup.New_Password_TB.isEnabled();
		System.out.println("New_Password text box is Enabled at webpage : "+New_Password_TB_Enable+"\n");
		Signup.New_Password_TB.clear();
		Signup.New_Password_TB.sendKeys("Asdfghjk");
		
		//Birth Date DropDown Selection
		
		boolean Day_DD_Visibility=Signup.Birth_Day_DD.isDisplayed();
		System.out.println("Birth Day Dropdown Displayed at Webpage : "+Day_DD_Visibility);
		boolean Day_DD_Enable=Signup.Birth_Day_DD.isEnabled();
		System.out.println("Birth Day Dropdown Enabled at Webpage : "+Day_DD_Enable);
		new Select(Signup.Birth_Day_DD).selectByVisibleText("25");
		WebElement Displayed_Date=new Select(Signup.Birth_Day_DD).getFirstSelectedOption();
		String Displayed_Date_Text=Displayed_Date.getText();
		System.out.println("Selected Date at webpage : "+Displayed_Date_Text+"\n");
		
		//Birth Month DropDown Selection
		
		boolean Month_DD_Visibility=Signup.Birth_Month_DD.isDisplayed();
		System.out.println("Birth Month Dropdown Displayed at Webpage : "+Month_DD_Visibility);
		boolean Month_DD_Enable=Signup.Birth_Month_DD.isEnabled();
		System.out.println("Birth Month Dropdown Enabled at Webpage : "+Month_DD_Enable);
		new Select(Signup.Birth_Month_DD).selectByVisibleText("May");
		WebElement Displayed_Month=new Select(Signup.Birth_Month_DD).getFirstSelectedOption();
		String Displayed_Month_Text=Displayed_Month.getText();
		System.out.println("Selected Month at webpage : "+Displayed_Month_Text+"\n");

		//Birth Year DropDown Selection 
		
		boolean Year_DD_Visibility=Signup.Birth_Year_DD.isDisplayed();
		System.out.println("Birth Year Dropdown Displayed at Webpage : "+Year_DD_Visibility);
		boolean Year_DD_Enable=Signup.Birth_Year_DD.isEnabled();
		System.out.println("Birth Year Dropdown Enabled at Webpage : "+Year_DD_Enable);
		new Select(Signup.Birth_Year_DD).selectByVisibleText("1998");
		WebElement Displayed_Year=new Select(Signup.Birth_Year_DD).getFirstSelectedOption();
		String Displayed_Year_Text=Displayed_Year.getText();
		System.out.println("Selected Year at webpage : "+Displayed_Year_Text+"\n");
		
		//Female Radio Button 
		
		boolean Radio_Btn_Female_Visibility=Signup.Radio_Btn_Female.isDisplayed();
		System.out.println("Female Radio Button Visibility status : "+Radio_Btn_Female_Visibility);
		boolean Radio_Btn_Female_Enable=Signup.Radio_Btn_Female.isEnabled();
		System.out.println("Female Radio Button is enabled at webpage : "+Radio_Btn_Female_Enable);
		boolean Radio_Btn_Female_Selected=Signup.Radio_Btn_Female.isSelected();
		System.out.println("Female Radio Button is selected at webpage : "+Radio_Btn_Female_Selected+"\n");
		
		//Male Radio Button
		 
		boolean Radio_Btn_Male_Visibility=Signup.Radio_Btn_Male.isDisplayed();
		System.out.println("Male Radio Button Visibility status : "+Radio_Btn_Male_Visibility);
		boolean Radio_Btn_Male_Enable=Signup.Radio_Btn_Male.isEnabled();
		System.out.println("Male Radio Button is enabled at webpage : "+Radio_Btn_Male_Enable);
		Signup.Radio_Btn_Male.click();
		boolean Radio_Btn_Male_Selected=Signup.Radio_Btn_Male.isSelected();
		System.out.println("Male Radio Button is selected at webpage : "+Radio_Btn_Male_Selected+"\n");
		
		//Custom Radio Button
		
		boolean Radio_Btn_Custom_Visibility=Signup.Radio_Btn_Custom.isDisplayed();
		System.out.println("Custom Radio Button Visibility status : "+Radio_Btn_Custom_Visibility);
		boolean Radio_Btn_Custom_Enable=Signup.Radio_Btn_Custom.isEnabled();
		System.out.println("Custom Radio Button is enabled at webpage : "+Radio_Btn_Custom_Enable);
		boolean Radio_Btn_Custom_Selected=Signup.Radio_Btn_Custom.isSelected();
		System.out.println("Custom Radio Button is selected at webpage : "+Radio_Btn_Custom_Selected+"\n");
		
		//Submit Button
		
		boolean Submit_Btn_Visibility=Signup.Submit_Btn.isDisplayed();
		System.out.println("Submit button visible at Webpage : "+Submit_Btn_Visibility);
		boolean Submit_Btn_Enable=Signup.Submit_Btn.isEnabled();
		System.out.println("Submit button visible at Webpage : "+Submit_Btn_Enable);
		



	}

}
