package day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import reusable.Capture_Screen;

public class Practice_form_test2 {

	public static void main(String[] args) throws IOException, InterruptedException, Exception  {
		System.setProperty("webdriver.chrome.driver","UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		//Finding Elements in pracrtice form using xpath
		String APF_Expected_Url="https://demoqa.com/automation-practice-form";
		String APF_Actual_Url=driver.getCurrentUrl();
		if(APF_Actual_Url.equals(APF_Expected_Url))
		{
			System.out.println("expected Url is displayed");
			
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Saitharun");
			
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sakkaram");
			
			driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sakkaramsaitharun.144@gmail.com");
			//driver.findElement(By.xpath("//input[@for='gender-radio-1']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[1]")).click();
			
			driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9542950884");
			
			driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
			
			Select Year=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			Year.selectByVisibleText("1998");
			//Thread.sleep(2000);
			Select Month=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			Month.selectByVisibleText("May");
			
			driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--025']")).click();
			Thread.sleep(3000);
			
			WebElement Subjects=driver.findElement(By.id("subjectsInput"));
			Thread.sleep(2000);
			Subjects.sendKeys("mat");
			Thread.sleep(2000);
			Subjects.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Subjects.sendKeys("che");
			Thread.sleep(2000);
			Subjects.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Subjects.sendKeys("phy");
			Thread.sleep(2000);
			Subjects.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Subjects.sendKeys("eng");
			Thread.sleep(2000);
			Subjects.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Subjects.sendKeys("soc");
			Thread.sleep(2000);
			Subjects.sendKeys(Keys.ENTER);
			
			WebElement hobbie1=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", hobbie1);
			
			WebElement hobbie2=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", hobbie2);
			Thread.sleep(3000);
			
			WebElement Upload_btn=driver.findElement(By.xpath("//input[contains(@class,'form-control-file')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", Upload_btn);
			Thread.sleep(3000);
			Robot robot=new Robot();
			String path="E:\\PERSONAL\\267196.jpg";
			StringSelection Spath=new StringSelection(path);
			Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(Spath, Spath);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("1-38/2, Basheerabad, Kammarpally, Nizamabad, 503225");
			WebElement State=driver.findElement(By.id("react-select-3-input"));
			State.sendKeys("Uttar Pradesh");
			Thread.sleep(2000);
			State.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement City=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[10]/div[3]/div/div/div[1]/div[2]/div/input"));
			City.sendKeys("Agra");
			Thread.sleep(2000);
			City.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
			WebElement Submit_Btn=driver.findElement(By.xpath("//button[@id='submit']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", Submit_Btn);
			Thread.sleep(5000);
			String Submit_Statement=driver.findElement(By.id("example-modal-sizes-title-lg")).getText();
			System.out.println(Submit_Statement);
			
			Date d=new Date();
			DateFormat sdf=new SimpleDateFormat("MM-dd hh-mm-ss");
			String time=sdf.format(d);
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(file, new File("E:\\PROFESSIONAL\\ScreenShots\\"+time+"Practice.png"));
			//File File_Location=new File("E:\\PROFESSIONAL\\ScreenShots\\Practice.png") ;
			}
		else
		{
			System.out.println("Expected Url is not dislplayed");
		}
	
	}

}
