package day5;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Accordians {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/accordian");
		

		Date d=new Date();
		DateFormat sdf=new SimpleDateFormat("MM-dd hh-mm-ss");
		String time=sdf.format(d);
		
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		JavascriptExecutor JS=((JavascriptExecutor)driver);
		driver.findElement(By.xpath("//div[contains(@id,'section1Heading')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,'section1Heading')]")).click();
		Thread.sleep(2000);
		File Src_Content1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Src_Content1, new File("E:\\PROFESSIONAL\\ScreenShots\\"+time+"image1.png"));
		
		WebElement Content1=driver.findElement(By.id("section1Content"));
		String Content1_Text=Content1.getText();
		System.out.println(Content1_Text);
		driver.findElement(By.xpath("//div[contains(@id,'section1Heading')]")).click();
		Thread.sleep(2000);
		
		WebElement Section2_Heading=driver.findElement(By.xpath("//div[contains(@id,'section2Heading')]"));
		JS.executeScript("arguments[0].click();", Section2_Heading);
		Thread.sleep(2000);
		File Src_Content2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Src_Content2, new File("E:\\PROFESSIONAL\\ScreenShots\\"+time+"image2.png"));

		WebElement Content2=driver.findElement(By.id("section2Content"));
		String Content2_Text=Content2.getText();
		System.out.println(Content2_Text);
		driver.findElement(By.xpath("//div[contains(@id,'section2Heading')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@id,'section3Heading')]")).click();
		Thread.sleep(2000);
		File Src_Content3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Src_Content3, new File("E:\\PROFESSIONAL\\ScreenShots\\"+time+"image3.png"));

		WebElement Content3=driver.findElement(By.id("section3Content"));
		String Content3_Text=Content3.getText();
		System.out.println(Content3_Text);

	}	

}
