package day5;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capturing_Screen {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		//Thread.sleep(3000);
		
		Date d=new Date();
		DateFormat df=new SimpleDateFormat("MMM-dd hh:mm:ss");
		String time=df.format(d);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.createDir(new File("Screens"));
		//File file=new File("Drivers\\"+time+"-Practiceform.png");
		FileHandler.copy(src, new File("E:\\PROFESSIONAL\\ScreenShots\\Practiceform.png"));
	}

}
