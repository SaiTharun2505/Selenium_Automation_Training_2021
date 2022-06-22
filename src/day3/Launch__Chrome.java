package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch__Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driverchrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		//To maximize the window 
		
		driver.manage().window().maximize();
		
		//To open facebook registration page & To get title of webpage & printing the title
		driver.get("https://www.google.com/search?q=facebookregistrationpage&rlz=1C1NDCM_enIN939IN939&oq=facebookregistrationpage&aqs=chrome..69i57j0i13l3j0i8i13i30l6.11781j0j7&sourceid=chrome&ie=UTF-8");
		String title=driver.getTitle();
		System.out.println(title);
		
		//	driver.findElementById("email").sendKeys("9542950884");
		//Click on the facebook registration link and to get the title of the page and printing the title
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div[1]/div/div[1]/a/h3")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		
		//Finding the firstname WebElement and doing some action on that WebElement and checking that webelement is displayed and enabled

		WebElement firstname=driver.findElement(By.name("firstname"));
		boolean a=firstname.isDisplayed();
		System.out.println("first element is displayed: "+a);
		boolean b=firstname.isEnabled();
		System.out.println("first element is enabled: "+b);
		firstname.sendKeys("saitharun");
		//Finding the second Webelment and sending some data to that text field
		
		WebElement c=driver.findElement(By.name("lastname"));
		c.sendKeys("sakkarams");
		c.sendKeys(Keys.BACK_SPACE); //PERFORMING KEYS ACTION
		WebElement d=driver.findElement(By.name("reg_email__"));
		d.sendKeys("sakkaramsaitharun.144@gmail.com");
		d.sendKeys(Keys.CONTROL+"a");
		d.sendKeys(Keys.CONTROL+"c");
		
		WebElement e=driver.findElement(By.name("reg_email_confirmation__"));
		e.sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.name("reg_passwd__")).sendKeys("lovely");
		driver.findElement(By.name("birthday_day")).sendKeys("25");
		driver.findElement(By.name("birthday_month")).sendKeys("May");
		driver.findElement(By.name("birthday_year")).sendKeys("1997");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();	
		WebElement f=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/label/input"));
		f.click();
		boolean g=f.isSelected();
		System.out.println("radio button male is: "+g);
		driver.findElement(By.name("email")).sendKeys("9542950884");
		driver.findElement(By.name("pass")).sendKeys("Chinnu@143");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/form/table/tbody/tr[2]/td[3]/label")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/i")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();
		//driver.close();
	}

}
