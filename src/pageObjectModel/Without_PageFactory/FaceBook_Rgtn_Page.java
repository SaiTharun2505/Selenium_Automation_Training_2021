package pageObjectModel.Without_PageFactory;

import org.openqa.selenium.By;

public class FaceBook_Rgtn_Page
{
	public static By FirstName_TB=By.xpath("//input[(@name='firstname')]");
	public static By SurName_TB=By.xpath("//input[@name='lastname']");
	public static By Email_TB=By.xpath("//input[@name='reg_email__']");
	public static By Re_Enter_Email_TB=By.xpath("//input[@name='reg_email_confirmation__']");
	public static By New_Password_TB=By.xpath("//input[@name='reg_passwd__']");
	public static By Birth_Day_DD=By.xpath("//select[@id='day']");
	public static By Birth_Month_DD=By.xpath("//select[@id='month']");
	public static By Birth_Year_DD=By.xpath("//select[@id='year']");
	public static By Radio_Btn_Female=By.xpath("(//input[@name='sex'])[1]");
	public static By Radio_Btn_Male=By.xpath("(//input[@name='sex'])[2]");
	public static By Radio_Btn_Custom=By.xpath("(//input[@name='sex'])[3]");
	public static By Submit_Btn=By.xpath("//button[@name='websubmit']");
}
