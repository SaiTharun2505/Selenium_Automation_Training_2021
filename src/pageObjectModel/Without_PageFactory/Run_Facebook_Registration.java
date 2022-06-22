package pageObjectModel.Without_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Run_Facebook_Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//FirstName EditBox
		
		WebElement Firstname_RT=driver.findElement(FaceBook_Rgtn_Page.FirstName_TB);
		boolean FirstName_Visibility=Firstname_RT.isDisplayed();
		System.out.println("FirstName Edit box is Displayed at Webpage : "+FirstName_Visibility);
		boolean FirstName_Enable=Firstname_RT.isEnabled();
		System.out.println("FirstName Edit box is Enabled at Webpage : "+FirstName_Enable+"\n");
		Firstname_RT.clear();
		Firstname_RT.sendKeys("Saitharun");
		
		//SurName EditBox
		
		WebElement Surname_RT=driver.findElement(FaceBook_Rgtn_Page.SurName_TB);
		boolean Surname_Visibility=Surname_RT.isDisplayed();
		System.out.println("Surname Edit box is Displayed at Webpage : "+Surname_Visibility);
		boolean Surname_Enable=Surname_RT.isEnabled();
		System.out.println("Surname Edit box is Enabled at Webpage : "+Surname_Enable+"\n");
		Surname_RT.clear();
		Surname_RT.sendKeys("Sakkaram");
		
		//Email EditBox
		
		WebElement Email_RT=driver.findElement(FaceBook_Rgtn_Page.Email_TB);
		boolean Email_Visibility=Email_RT.isDisplayed();
		System.out.println("Email Edit box is Displayed at Webpage : "+Email_Visibility);
		boolean Email_Enable=Email_RT.isEnabled();
		System.out.println("Email Edit box is Enabled at Webpage : "+Email_Enable+"\n");
		Email_RT.clear();
		Email_RT.sendKeys("Sakkaramsaitharun.144@gmail.com");
		
		//Email Conformation EditBox
		
		WebElement Re_Enter_Email_RT=driver.findElement(FaceBook_Rgtn_Page.Re_Enter_Email_TB);
		boolean Re_Enter_Email_Visibility=Re_Enter_Email_RT.isDisplayed();
		System.out.println("Re_Enter_Email Edit box is Displayed at Webpage : "+Re_Enter_Email_Visibility);
		boolean Re_Enter_Email_Enable=Re_Enter_Email_RT.isEnabled();
		System.out.println("Re_Enter_Email Edit box is Enabled at Webpage : "+Re_Enter_Email_Enable+"\n");
		Re_Enter_Email_RT.clear();
		Re_Enter_Email_RT.sendKeys("Sakkaramsaitharun.144@gmail.com");
		
		//New Password EditBox
		
		WebElement New_Password_RT=driver.findElement(FaceBook_Rgtn_Page.New_Password_TB);
		boolean New_Password_Visibility=New_Password_RT.isDisplayed();
		System.out.println("New_Password Edit box is Displayed at Webpage : "+New_Password_Visibility);
		boolean New_Password_Enable=New_Password_RT.isEnabled();
		System.out.println("New_Password Edit box is Enabled at Webpage : "+New_Password_Enable+"\n");
		New_Password_RT.clear();
		New_Password_RT.sendKeys("Asdfghjkl");
		
		//Birth Date DropDown Selection
		
		WebElement Birth_Day_DD_RT=driver.findElement(FaceBook_Rgtn_Page.Birth_Day_DD);
		boolean Day_DD_Visibility=Birth_Day_DD_RT.isDisplayed();
		System.out.println("Birth Day Dropdown Displayed at Webpage : "+Day_DD_Visibility);
		boolean Day_DD_Enable=Birth_Day_DD_RT.isEnabled();
		System.out.println("Birth Day Dropdown Displayed at Webpage : "+Day_DD_Enable);
		new Select(Birth_Day_DD_RT).selectByVisibleText("25");
		WebElement Displayed_Date=new Select(Birth_Day_DD_RT).getFirstSelectedOption();
		String Displayed_Date_Text=Displayed_Date.getText();
		System.out.println("Selected Date at webpage : "+Displayed_Date_Text+"\n");
		
		//Birth Month DropDown Selection
		
		WebElement Birth_Month_DD_RT=driver.findElement(FaceBook_Rgtn_Page.Birth_Month_DD);
		boolean Month_DD_Visibility=Birth_Month_DD_RT.isDisplayed();
		System.out.println("Birth Month Dropdown Displayed at Webpage : "+Month_DD_Visibility);
		new Select(Birth_Month_DD_RT).selectByVisibleText("May");
		WebElement Displayed_Month=new Select(Birth_Month_DD_RT).getFirstSelectedOption();
		String Displayed_Month_Text=Displayed_Month.getText();
		System.out.println("Selected Date at webpage : "+Displayed_Month_Text+"\n");
		
		//Birth Year DropDown Selection 
		
		WebElement Birth_Year_DD_RT=driver.findElement(FaceBook_Rgtn_Page.Birth_Year_DD);
		boolean Year_DD_Visibility=Birth_Year_DD_RT.isDisplayed();
		System.out.println("Birth Year Dropdown Displayed at Webpage : "+Year_DD_Visibility);
		new Select(Birth_Year_DD_RT).selectByVisibleText("1998");
		WebElement Displayed_Year=new Select(Birth_Day_DD_RT).getFirstSelectedOption();
		String Displayed_Year_Text=Displayed_Year.getText();
		System.out.println("Selected Year at webpage : "+Displayed_Year_Text+"\n");
		
		//Female Radio Button 
		
		WebElement Radio_Btn_Female_RT=driver.findElement(FaceBook_Rgtn_Page.Radio_Btn_Female);
		boolean Radio_Btn_Female_Visibility=Radio_Btn_Female_RT.isDisplayed();
		System.out.println("Female Radio Button Visibility status : "+Radio_Btn_Female_Visibility);
		boolean Radio_Btn_Female_Enable=Radio_Btn_Female_RT.isEnabled();
		System.out.println("Female Radio Button is enabled at webpage : "+Radio_Btn_Female_Enable);
		boolean Radio_Btn_Female_Selected=Radio_Btn_Female_RT.isSelected();
		System.out.println("Female Radio Button is selected at webpage : "+Radio_Btn_Female_Selected+"\n");
		
		//Male Radio Button
		
		WebElement Radio_Btn_Male_RT=driver.findElement(FaceBook_Rgtn_Page.Radio_Btn_Male);
		boolean Radio_Btn_Male_Visibility=Radio_Btn_Male_RT.isDisplayed();
		System.out.println("Male Radio Button Visibility status : "+Radio_Btn_Male_Visibility);
		boolean Radio_Btn_Male_Enable=Radio_Btn_Male_RT.isEnabled();
		System.out.println("Male Radio Button is enabled at webpage : "+Radio_Btn_Male_Enable);
		Radio_Btn_Male_RT.click();
		boolean Radio_Btn_Male_Selected=Radio_Btn_Male_RT.isSelected();
		System.out.println("Male Radio Button is selected at webpage : "+Radio_Btn_Male_Selected+"\n");
		
		//Custom Radio Button
		
		WebElement Radio_Btn_Custom_RT=driver.findElement(FaceBook_Rgtn_Page.Radio_Btn_Custom);
		boolean Radio_Btn_Custom_Visibility=Radio_Btn_Custom_RT.isDisplayed();
		System.out.println("Custom Radio Button Visibility status : "+Radio_Btn_Custom_Visibility);
		boolean Radio_Btn_Custom_Enable=Radio_Btn_Custom_RT.isEnabled();
		System.out.println("Custom Radio Button is enabled at webpage : "+Radio_Btn_Custom_Enable);
		boolean Radio_Btn_Custom_Selected=Radio_Btn_Custom_RT.isSelected();
		System.out.println("Custom Radio Button is selected at webpage : "+Radio_Btn_Custom_Selected+"\n");
		
		//Submit Button
		
		WebElement Submit_Btn_RT=driver.findElement(FaceBook_Rgtn_Page.Submit_Btn);
		boolean Submit_Btn_Visibility=Submit_Btn_RT.isDisplayed();
		System.out.println("Submit button visible at Webpage : "+Submit_Btn_Visibility);
		boolean Submit_Btn_Enable=Submit_Btn_RT.isEnabled();
		System.out.println("Submit button Enabled at Webpage : "+Submit_Btn_Enable);
		
		
		
	}

}
