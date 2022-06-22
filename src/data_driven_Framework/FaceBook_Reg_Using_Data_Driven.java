package data_driven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageObjectModel.With_PageFactory.Facebook_Registration_Reusable;

public class FaceBook_Reg_Using_Data_Driven {

	public static void main(String[] args) throws Exception, IOException {

	    System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("TestData\\RegBookSample.xlsx");
		XSSFWorkbook Data=new XSSFWorkbook(file);
		
		XSSFSheet Sheet=Data.getSheet("regdata");
		
		XSSFRow Row1=Sheet.getRow(1);
		
		
		 Facebook_Registration_Reusable Signup=PageFactory.initElements(driver, Facebook_Registration_Reusable.class);
		 Signup.FirstName_TB.clear();
		 String Firstname=Row1.getCell(0).getStringCellValue();
		 Signup.FirstName_TB.sendKeys(Firstname);
		 Signup.SurName_TB.clear();
		 String Surname=Row1.getCell(1).getStringCellValue();
		 Signup.SurName_TB.sendKeys(Surname);
		 Signup.Email_TB.clear();
		 String Email=Row1.getCell(2).getStringCellValue();
		 Signup.Email_TB.sendKeys(Email);
		 Signup.Email_Conformation_TB.clear();
		 String Email_Conformation=Row1.getCell(3).getStringCellValue();
		 Signup.Email_Conformation_TB.sendKeys(Email_Conformation);
		 Signup.New_Password_TB.clear();
		 String New_Password=Row1.getCell(4).getStringCellValue();
		 Signup.New_Password_TB.sendKeys(New_Password);
		 int Date=(int) Row1.getCell(5).getNumericCellValue();
		 String Date1=Integer.toString(Date);
		 new Select(Signup.Birth_Day_DD).selectByVisibleText(Date1);
		 String Month=Row1.getCell(6).getStringCellValue();
		 new Select(Signup.Birth_Month_DD).selectByVisibleText(Month);
		 int Year=(int) Row1.getCell(7).getNumericCellValue();
		 String Year1=Integer.toString(Year);
		 new Select(Signup.Birth_Year_DD).selectByVisibleText(Year1);
		 Signup.Radio_Btn_Male.click();
		
		
	}

}
