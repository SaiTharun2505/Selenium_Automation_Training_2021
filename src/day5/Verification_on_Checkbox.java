package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_on_Checkbox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[2]/div[2]")).click();
		Thread.sleep(3000);
		
		//Checkbox
		driver.findElement(By.id("item-1")).click();
		//Verifying Page Url
		String CB_Expected_Url="https://demoqa.com/checkbox";
		String CB_Actual_Url=driver.getCurrentUrl();
		
		if(CB_Actual_Url.equals(CB_Expected_Url))
		{
			System.out.println("Test Pass; Expected Url is displayed"+CB_Actual_Url);
			
			//Clicking toggle button
			
			driver.findElement(By.cssSelector("button[aria-label='Toggle']")).click();
			
			//Verifying desktop checkbox
			
			WebElement Desktop_CB=driver.findElement(By.cssSelector("label[for='tree-node-desktop']"));
			boolean Desktop_CB_Display_Status=Desktop_CB.isDisplayed();
			System.out.println("As Expected Desktop Check box Displayed :"+Desktop_CB_Display_Status);
			
			boolean Desktop_CB_Enable_Status=Desktop_CB.isEnabled();
			System.out.println("As Expected Desktop Check box Enabled :"+Desktop_CB_Enable_Status);
			
			if(!Desktop_CB.isSelected())
			{
				System.out.println("Test Pass; As Expected Checkbox was unchecked by default----> "+!Desktop_CB.isSelected());
			}
			else
			{
				System.out.println("Test Fail; Checkbox was selected by default");
			}
			
		/*	WebElement Desktop_CB_1=driver.findElement(By.cssSelector("label[for='tree-node-desktop']>span>svg"));
			String Act_Run_Time_Value=Desktop_CB_1.getAttribute("class");
			String Exp_Run_Time_Value="rct-icon rct-icon-uncheck";
			
			//Verifying Desktop Checkbox before selection
			
			if(Act_Run_Time_Value.equals(Exp_Run_Time_Value))
			{
				System.out.println("Test Pass; As Expected Checkbox was unchecked by default----> "+Act_Run_Time_Value);
			}
			else
			{
				System.out.println("Test Fail; Check box Was Selected by Default---> "+Act_Run_Time_Value);
			}
			*/
			Thread.sleep(3000);
			
			Desktop_CB.click();
			
			Thread.sleep(3000);
			
			//Verifying Desktop Checkbox After selection
			
			WebElement Desktop_CB_2=driver.findElement(By.cssSelector("label[for='tree-node-desktop']>span>svg"));
			String Act_Run_Time_Value_After=Desktop_CB_2.getAttribute("class");
			String Exp_Run_Time_Value_After="rct-icon rct-icon-check";
			
			if(Act_Run_Time_Value_After.equals(Exp_Run_Time_Value_After))
			{
				System.out.println("Test Pass; As Expected checkbox was selected by clicking----> "+Act_Run_Time_Value_After);
			}
			else
			{
				System.out.println("Test Fail; Checkbox was not selected by clicking on it----> "+Act_Run_Time_Value_After);
			}
			Thread.sleep(3000);
			
			String checkbox=driver.findElement(By.cssSelector("div[class='display-result mt-4']")).getText();
			System.out.println(checkbox);
			
			Thread.sleep(3000);
			
			//Deselecting Desktop Checkbox
			
			Desktop_CB.click();
		
			//Verifying Document Checkbox
			
			WebElement Document_CB=driver.findElement(By.cssSelector("label[for='tree-node-documents']"));
			boolean Document_CB_Display_Status=Document_CB.isDisplayed();
			System.out.println("As Expected Document Check box Displayed :"+Document_CB_Display_Status);
			
			boolean Document_CB_Enable_Status=Document_CB.isEnabled();
			System.out.println("As Expected Document Check box Enabled :"+Document_CB_Enable_Status);
			
			WebElement Document_CB_1=driver.findElement(By.cssSelector("label[for='tree-node-documents']>span>svg"));
			String Act_Run_Time_Value_Document=Document_CB_1.getAttribute("class");
			String Exp_Run_Time_Value_Document="rct-icon rct-icon-uncheck";
			
			//Verifying Document Checkbox before selection
			
			if(Act_Run_Time_Value_Document.equals(Exp_Run_Time_Value_Document))
			{
				System.out.println("Test Pass; As Expected Document Checkbox was unchecked by default----> "+Act_Run_Time_Value_Document);
			}
			else
			{
				System.out.println("Test Fail; Document Check box Was Selected by Default---> "+Act_Run_Time_Value_Document);
			}
			Thread.sleep(3000);
		
			Document_CB.click();
			
			Thread.sleep(3000);
			
			//Verifying document checkbox After Selection
			
			WebElement Document_CB_2=driver.findElement(By.cssSelector("label[for='tree-node-documents']>span>svg"));
			String Act_Run_Time_Value__Document_After=Document_CB_2.getAttribute("class");
			String Exp_Run_Time_Value_Document_After="rct-icon rct-icon-check";
			
			if(Act_Run_Time_Value__Document_After.equals(Exp_Run_Time_Value_Document_After))
			{
				System.out.println("Test Pass; As Expected checkbox was selected by clicking----> "+Act_Run_Time_Value__Document_After);
			}
			else
			{
				System.out.println("Test Fail; Checkbox was not selected by clicking on it----> "+Act_Run_Time_Value__Document_After);
			}
			Thread.sleep(3000);
			
			String checkbox1=driver.findElement(By.cssSelector("div[class='display-result mt-4']")).getText();
			System.out.println(checkbox1);
			
			Thread.sleep(3000);
			
			//Deselecting Document Checkbox
			
			Document_CB.click();
			
			//Verifying Download Checkbox
			
			WebElement Download_CB=driver.findElement(By.cssSelector("label[for='tree-node-downloads']"));
			boolean Download_CB_Display_Status=Download_CB.isDisplayed();
			System.out.println("As Expected Download Check box Displayed :"+Download_CB_Display_Status);
			
			boolean Download_CB_Enable_Status=Download_CB.isEnabled();
			System.out.println("As Expected Download Check box Enabled :"+Download_CB_Enable_Status);
			
			WebElement Download_CB_1=driver.findElement(By.cssSelector("label[for='tree-node-downloads']>span>svg"));
			String Act_Run_Time_Value_Download=Download_CB_1.getAttribute("class");
			String Exp_Run_Time_Value_Download="rct-icon rct-icon-uncheck";
			
			//Verifying Download Checkbox before selection
			
			if(Act_Run_Time_Value_Download.equals(Exp_Run_Time_Value_Download))
			{
				System.out.println("Test Pass; As Expected Download Checkbox was unchecked by default----> "+Act_Run_Time_Value_Download);
			}
			else
			{
				System.out.println("Test Fail; Download Check box Was Selected by Default---> "+Act_Run_Time_Value_Download);
			}
			Thread.sleep(3000);
		
			Download_CB.click();
			
			Thread.sleep(3000);
			
			//Verifying download checkbox After Selection
			
			WebElement Download_CB_2=driver.findElement(By.cssSelector("label[for='tree-node-downloads']>span>svg"));
			String Act_Run_Time_Value__Download_After=Download_CB_2.getAttribute("class");
			String Exp_Run_Time_Value_Download_After="rct-icon rct-icon-check";
			
			if(Act_Run_Time_Value__Download_After.equals(Exp_Run_Time_Value_Download_After))
			{
				System.out.println("Test Pass; As Expected checkbox was selected by clicking----> "+Act_Run_Time_Value__Download_After);
			}
			else
			{
				System.out.println("Test Fail; Checkbox was not selected by clicking on it----> "+Act_Run_Time_Value__Download_After);
			}
			Thread.sleep(3000);
			
			//Deselecting Download checkbox
			
			Download_CB.click();
			
			//Verifying Home Checkbox
			
			WebElement Home_CB=driver.findElement(By.cssSelector("label[for='tree-node-home']"));
			boolean Home_CB_Display_Status=Home_CB.isDisplayed();
			System.out.println("As Expected Home Check box Displayed :"+Home_CB_Display_Status);
			
			boolean Home_CB_Enable_Status=Home_CB.isEnabled();
			System.out.println("As Expected Home Check box Enabled :"+Home_CB_Enable_Status);
			
			WebElement Home_CB_1=driver.findElement(By.cssSelector("label[for='tree-node-home']>span>svg"));
			String Act_Run_Time_Value_Home=Home_CB_1.getAttribute("class");
			String Exp_Run_Time_Value_Home="rct-icon rct-icon-uncheck";
			
			//Verifying Home Checkbox before selection
			
			if(Act_Run_Time_Value_Home.equals(Exp_Run_Time_Value_Home))
			{
				System.out.println("Test Pass; As Expected Home Checkbox was unchecked by default----> "+Act_Run_Time_Value_Home);
			}
			else
			{
				System.out.println("Test Fail; Home Check box Was Selected by Default---> "+Act_Run_Time_Value_Home);
			}
			Thread.sleep(3000);
		
			Home_CB.click();
			
			Thread.sleep(3000);
			
			//Verifying Home checkbox After Selection
			
			WebElement Home_CB_2=driver.findElement(By.cssSelector("label[for='tree-node-home']>span>svg"));
			String Act_Run_Time_Value__Home_After=Home_CB_2.getAttribute("class");
			String Exp_Run_Time_Value_Home_After="rct-icon rct-icon-check";
			
			if(Act_Run_Time_Value__Home_After.equals(Exp_Run_Time_Value_Home_After))
			{
				System.out.println("Test Pass; As Expected checkbox was selected by clicking----> "+Act_Run_Time_Value__Home_After);
			}
			else
			{
				System.out.println("Test Fail; Checkbox was not selected by clicking on it----> "+Act_Run_Time_Value__Download_After);
			}

			
			String checkbox3=driver.findElement(By.cssSelector("div[class='display-result mt-4']")).getText();
			System.out.println(checkbox3);

			
			
					
			//Thread.sleep(3000);
			//driver.findElement(By.cssSelector("label[for='tree-node-home']")).click();
			
			System.out.println("------------------Checkbox executed successfully----------------------");
		}
		else
		{
			System.out.println("Expected Url is not displayed");
		}

		
	}

}
