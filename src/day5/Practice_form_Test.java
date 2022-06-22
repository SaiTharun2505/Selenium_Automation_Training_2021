package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;


public class Practice_form_Test {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[2]/div[2]")).click();
	
		//Textbox Using Id Locator
		System.out.println("=======================Executing Textbox=========================");
		
		Thread.sleep(3000);
	    driver.findElement(By.id("item-0")).click();
	    String TB_Expected_Url="https://demoqa.com/text-box";
	    String TB_Actual_Url=driver.getCurrentUrl();
	    
	    if(TB_Actual_Url.equals(TB_Expected_Url))
	    {	
	    	System.out.println("Expected Url is displayed");
			driver.findElement(By.id("userName")).sendKeys("Saitharun25");
			driver.findElement(By.id("userEmail")).sendKeys("sakkaramsaitharun.144@gmail.com");
			driver.findElement(By.id("currentAddress")).sendKeys("1-38/2, Basheerabad, Kammarpally, Nizamabad, 503225");
			driver.findElement(By.id("permanentAddress")).sendKeys("1-38/2, Basheerabad, Kammarpally, Nizamabad, 503225");
			Thread.sleep(2000);
			WebElement submit=driver.findElement(By.id("submit")); //Used to resolve Element click intercepted Exception
			((JavascriptExecutor)driver).executeScript("arguments[0].click()",submit);
			Thread.sleep(10000);
			
		    String Name=driver.findElement(By.id("name")).getText();
			String Email=driver.findElement(By.id("email")).getText();
			String newline = System.getProperty("line.separator");
			System.out.println(Name +newline+ Email);
			
			String Current_Address=driver.findElement(By.id("currentAddress")).getText();
			String Permanent_Adress=driver.findElement(By.id("permanentAddress")).getText();
			System.out.println( Current_Address +newline+ Permanent_Adress);
			
			System.out.println("--------------------Textbox Executed Successfully---------------------");
	    }
	    else
	    {
	    	System.out.println("Expected Url is not displayed");
	    }
		//Checkbox using Attribute cssSelector Locator
		
		System.out.println("================executing checkbox======================");
		
		driver.findElement(By.id("item-1")).click();
		
		String CB_Expected_Url="https://demoqa.com/checkbox";
		String CB_Actual_Url=driver.getCurrentUrl();
		
		if(CB_Actual_Url.equals(CB_Expected_Url))
		{
			System.out.println("Expected Url is displayed");
			//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/ol/li/span/button")).click(); //Using Full Xpath 
			driver.findElement(By.cssSelector("button[aria-label='Toggle']")).click();
			//driver.findElement(By.xpath("//span[@class='rct-title'][contains(.,'Desktop')]")).click(); //Using Relative Xpath
			driver.findElement(By.cssSelector("label[for='tree-node-desktop']")).click();
			Thread.sleep(3000);
			String checkbox=driver.findElement(By.cssSelector("div[class='display-result mt-4']")).getText();
			System.out.println(checkbox);
			driver.findElement(By.cssSelector("label[for='tree-node-documents']")).click();
			Thread.sleep(3000);
			String checkbox1=driver.findElement(By.cssSelector("div[class='display-result mt-4']")).getText();
			System.out.println(checkbox1);
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("label[for='tree-node-downloads']")).click();
			String checkbox2=driver.findElement(By.cssSelector("div[class='display-result mt-4']")).getText();
			System.out.println(checkbox2);
			driver.findElement(By.cssSelector("label[for='tree-node-home']")).click();
			
			System.out.println("------------------Checkbox executed successfully----------------------");
		}
		else
		{
			System.out.println("Expected Url is not displayed");
		}
		
		//Radio button Using Relative Xpath Locator
		
		System.out.println("====================Executing radio buttons===========================");
		
		driver.findElement(By.id("item-2")).click();
		
		String RB_Expected_Url="https://demoqa.com/radio-button";
		String RB_Actual_Url=driver.getCurrentUrl();
		
		if(RB_Actual_Url.equals(RB_Expected_Url))
		{	
			System.out.println("Expected Url is displayed");
			driver.findElement(By.xpath("//label[@class='custom-control-label'][contains(.,'Impressive')]")).click();
			Thread.sleep(2000);
			String radio=driver.findElement(By.xpath("//p[@class='mt-3'][contains(.,'You have selected Impressive')]")).getText();
			System.out.println(radio);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@class='custom-control-label'][contains(.,'Yes')]")).click();
			String radio1=driver.findElement(By.xpath("//label[@class='custom-control-label'][contains(.,'Yes')]")).getText();
			System.out.println(radio1);
			Thread.sleep(3000);
		
			System.out.println("---------------Radio buttons Executed successfully----------------");
		}
		else
		{
			System.out.println("Expected Url is not displayed");
		}
		//Webtables
		
		System.out.println("================Executing webtebles=================");

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		WebElement webtable=driver.findElement(By.id("item-3"));
		executor.executeScript("arguments[0].click()", webtable);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/button")).click();
		driver.findElement(By.id("firstName")).sendKeys("rahul");
		driver.findElement(By.id("lastName")).sendKeys("daidi");
		driver.findElement(By.id("userEmail")).sendKeys("rahul@gmail.com");
		driver.findElement(By.id("age")).sendKeys("23");
		driver.findElement(By.id("salary")).sendKeys("12000");
		driver.findElement(By.id("department")).sendKeys("Soil Mechanisam");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[7]/div/button")).click();
		Thread.sleep(3000);
		
		
		System.out.println("================Webtables executed successfully==============");
	
		//button Using Relative css & cssposition
		
		System.out.println("=================Executing buttons===================");
		
		WebElement buttons = driver.findElement(By.id("item-4"));
		
		executor.executeScript("arguments[0].click();", buttons);
		
			//Double Click
		
		Actions actions=new Actions(driver);
		WebElement Double_Click=driver.findElement(By.cssSelector("div[class='col-12 mt-4 col-md-6'] button"));
		actions.doubleClick(Double_Click).perform();
		Thread.sleep(2000);
		String Click1=driver.findElement(By.cssSelector("div[class='col-12 mt-4 col-md-6'] p")).getText();
		System.out.println(Click1);
		Thread.sleep(2000);
		
			//Right Click
		
		WebElement Right_Click=driver.findElement(By.cssSelector("div[class='col-12 mt-4 col-md-6'] button[id='rightClickBtn']"));
		actions.contextClick(Right_Click).perform();
		Thread.sleep(2000);
		String Click2=driver.findElement(By.cssSelector("#rightClickMessage")).getText();
		System.out.println(Click2);
		Thread.sleep(2000);
		
			//Click 
		
		driver.findElement(By.cssSelector("div[class='col-12 mt-4 col-md-6'] div:nth-child(3) button")).click();
		Thread.sleep(2000);
		String Click=driver.findElement(By.cssSelector("#dynamicClickMessage")).getText();
		System.out.println(Click);
		Thread.sleep(3000);
		
		System.out.println("-------------------buttons executed succesfully-----------------");
		
		//Links
		
		System.out.println("===================Executing Links=====================");
		
		WebElement links = driver.findElement(By.id("item-5"));
		//JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", links);
		
		driver.findElement(By.cssSelector("a[id='created']")).click();
		Thread.sleep(2000);
		String Text1=driver.findElement(By.id("linkResponse")).getText();
		System.out.println(Text1);
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[id='no-content']")).click();
		Thread.sleep(2000);
		String Text2=driver.findElement(By.id("linkResponse")).getText();
		System.out.println(Text2);
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[id='moved']")).click();
		Thread.sleep(2000);
		String Text3=driver.findElement(By.id("linkResponse")).getText();
		System.out.println(Text3);
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[id='bad-request']")).click();
		Thread.sleep(2000);
		String Text4=driver.findElement(By.id("linkResponse")).getText();
		System.out.println(Text4);
		Thread.sleep(6000);
		WebElement unauth=driver.findElement(By.cssSelector("a[id='unauthorized']"));
		executor.executeScript("arguments[0].click();", unauth);
		Thread.sleep(2000);
		String Text5=driver.findElement(By.id("linkResponse")).getText();
		System.out.println(Text5);
		Thread.sleep(6000);
		WebElement forbid= driver.findElement(By.cssSelector("a[id='forbidden']"));
		executor.executeScript("arguments[0].click();",forbid);
		Thread.sleep(2000);
		String Text6=driver.findElement(By.id("linkResponse")).getText();
		System.out.println(Text6);
		Thread.sleep(6000);
		WebElement invalid=driver.findElement(By.cssSelector("a[id='invalid-url']"));
		executor.executeScript("arguments[0].click();",invalid);
		Thread.sleep(2000);
		String Text7=driver.findElement(By.id("linkResponse")).getText();
		System.out.println(Text7);
		
		System.out.println("--------------Links Executed successfully---------------");
		
		
		//Download and Upload files
		
		WebElement Uploads=driver.findElement(By.xpath("//li[@id='item-7']"));
		executor.executeScript("arguments[0].click();", Uploads);
		//driver.findElement(By.xpath("//li[@id='item-7']")).click();
		driver.findElement(By.xpath("//a[.='Download']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("E:\\PROFESSIONAL\\Resume\\SaitharunSakkaram.docx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[2]/div[2]")).click();
		Thread.sleep(3000);
		//Practice from
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[2]/div[2]")).click();
		driver.findElement(By.cssSelector("div[class='accordion']>div:nth-child(2)>div>ul>li")).click();
		
		//Finding Elements in pracrtice form using xpath
	//	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[2]/span/div")).click();
	//	driver.findElement(By.xpath("//span[@class='text'][contains(.,'Practice Form')]")).click();
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
			
			driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("E:\\PROFESSIONAL\\Resume\\SaitharunSakkaram.docx");
			
			driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("1-38/2, Basheerabad, Kammarpally, Nizamabad, 503225");
			Thread.sleep(3000);
			WebElement State=driver.findElement(By.id("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[10]/div[2]/div/div/div[1]"));
			State.sendKeys("Uttar Pradesh");
			Thread.sleep(2000);
			State.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement City=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[10]/div[3]/div/div/div[1]/div[2]/div/input"));
			City.sendKeys("Agra");
			Thread.sleep(2000);
			City.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='submit']")).click();
			Thread.sleep(5000);
			String Submit_Statement=driver.findElement(By.id("example-modal-sizes-title-lg")).getText();
			System.out.println(Submit_Statement);
		}	
		else
		{
			System.out.println("Expected Url is not dislpayed");
		}
	

	}

}
