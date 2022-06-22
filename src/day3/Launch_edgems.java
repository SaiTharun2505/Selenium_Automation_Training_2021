package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_edgems {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/r.php");
		String title1=driver.getTitle();
		System.out.println(title1);
		//driver.findElementByXPath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input").sendKeys("saitharun");
		driver.findElement(By.name("firstname")).sendKeys("saitharun");
		driver.findElement(By.name("lastname")).sendKeys("sakkaram");
		driver.findElement(By.name("reg_email__")).sendKeys("sakkaramsaitharun.144@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sakkaramsaitharun.144@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("automation");
		driver.findElement(By.name("birthday_day")).sendKeys("25");
		driver.findElement(By.name("birthday_month")).sendKeys("May");
		driver.findElement(By.name("birthday_year")).sendKeys("1997");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		driver.close();
			}

}
