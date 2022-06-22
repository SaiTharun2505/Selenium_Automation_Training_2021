package pageObjectModel.With_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook_Registration_Reusable 
{
	@FindBy(xpath="//input[(@name='firstname')]") public WebElement FirstName_TB;
	@FindBy(xpath="//input[(@name='lastname')]") public WebElement SurName_TB;
	@FindBy(xpath="//input[@name='reg_email__']") public WebElement Email_TB;
	@FindBy(xpath="//input[@name='reg_email_confirmation__']") public WebElement Email_Conformation_TB;
	@FindBy(xpath="//input[@name='reg_passwd__']") public WebElement New_Password_TB;
	@FindBy(xpath="//select[@id='day']") public WebElement Birth_Day_DD;
	@FindBy(xpath="//select[@id='month']") public WebElement Birth_Month_DD;
	@FindBy(xpath="//select[@id='year']") public WebElement Birth_Year_DD;
	@FindBy(xpath="(//input[@name='sex'])[1]") public WebElement Radio_Btn_Female;
	@FindBy(xpath="(//input[@name='sex'])[2]") public WebElement Radio_Btn_Male;
	@FindBy(xpath="(//input[@name='sex'])[3]") public WebElement Radio_Btn_Custom;
	@FindBy(xpath="//button[@name='websubmit']") public WebElement Submit_Btn;
	
	
}
