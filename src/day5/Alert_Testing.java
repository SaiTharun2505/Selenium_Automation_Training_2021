package day5;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import reusable.Capture_Screen;

public class Alert_Testing {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		Date d=new Date();
		DateFormat df=new SimpleDateFormat("MMM-dd hh:mm:ss");
		String time=df.format(d);
		
		//Robot robot=new Robot();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[2]/div[2]")).click();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		WebElement Browser=driver.findElement(By.xpath("(//li[@class='btn btn-light '][@id='item-0'])[2]"));
		executor.executeScript("arguments[0].click();", Browser);
		Thread.sleep(3000);
		WebElement Alert1=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]"));
		executor.executeScript("arguments[0].click();", Alert1);
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")).click();
		String Expected_Url="https://demoqa.com/alerts";
		String Alert_Url=driver.getCurrentUrl();
		Thread.sleep(2000);
		if(Expected_Url.equals(Alert_Url))
		{
			System.out.println("Expected URl is dislaplayed");
			driver.findElement(By.xpath("//button[contains(@id,'alertButton')]")).click();
			Thread.sleep(3000);
			
			Capture_Screen Screen=new Capture_Screen();
			Screen.Capture_Screen_When_Alert_Presented("E:\\PROFESSIONAL\\ScreenShots\\Alert1.png");
//			Dimension Screen_dimension=Toolkit.getDefaultToolkit().getScreenSize();
//			BufferedImage image=robot.createScreenCapture(new Rectangle(Screen_dimension));
//			File file=new File("E:\\PROFESSIONAL\\ScreenShots\\Alert1.png");
//			ImageIO.write(image, "PNG", file);
//			
			String message=driver.switchTo().alert().getText();
			System.out.println(message);
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
			Thread.sleep(6000);
			Screen.Capture_Screen_When_Alert_Presented("E:\\PROFESSIONAL\\ScreenShots\\Alert2.png");
			String message1=driver.switchTo().alert().getText();
			System.out.println(message1);
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			String message2=driver.switchTo().alert().getText();
			Screen.Capture_Screen_When_Alert_Presented("E:\\PROFESSIONAL\\ScreenShots\\Alert3.png");
			System.out.println(message2);
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//button[@id='promtButton']")).click();
			Thread.sleep(2000);
			Screen.Capture_Screen_When_Alert_Presented("E:\\PROFESSIONAL\\ScreenShots\\Alert4.png");
			String message3=driver.switchTo().alert().getText();
			driver.switchTo().alert().sendKeys("Saitharun");
			System.out.println(message3);
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Expected url not displayed");
		}
		//Modal Dialogues
		
		WebElement modal=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[5]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", modal);
		driver.findElement(By.id("showSmallModal")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("closeSmallModal")).click();
		driver.findElement(By.id("showLargeModal")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("closeLargeModal")).click();
	
	
	}

}
