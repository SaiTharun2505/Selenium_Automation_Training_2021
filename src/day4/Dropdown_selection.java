package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_selection {


	public static void main(String[] args) throws Exception
	{
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");

		/*((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(4000);
		*/
		Select state_selection=new Select(driver.findElement(By.id("customState")));
		
		boolean flag=state_selection.isMultiple();
		System.out.println("Dropdown is multiple selection type: "+flag);
		

		
		if(flag) 
		{
			System.out.println("Dropdown is multiple type, User can select multiple options from Dropdown");
			state_selection.deselectAll();
			state_selection.selectByIndex(3);
			state_selection.selectByIndex(5);
			state_selection.selectByValue("telangana");
			state_selection.selectByVisibleText("Maharashtra");
			int options_selected=state_selection.getAllSelectedOptions().size();
			
			//Requirement of client ------->
			//Dropdown should accept only three options 
			
			if(options_selected==3) 	 
			{
				System.out.println("Test passed, User only able to select max 3 options");
			}
			else
			{
				System.out.println("number of options selected: "+options_selected);
				System.out.println("Test failed, Dropdown field accepting more than three options");
				
			}
			
		}
		else
		{
			System.out.println("Dropdown is single selection type, User can select only single option from Dropdown");
			state_selection.selectByVisibleText("Telangana");
			String state_selected=state_selection.getFirstSelectedOption().getText();
			//String State_name ="Telangana";
			if(state_selected.equals("Telangana"))
			{
				System.out.println("Test pass, Displayed selected option :"+state_selected);
			}
			else
			{
				System.out.println("Test fail, Displayed other than selected option"+state_selected);
			}
		}
		
		Select District_selection=new Select(driver.findElement(By.id("customCity")));
		District_selection.selectByVisibleText("Nizamabad");
		String District_selected=District_selection.getFirstSelectedOption().getText();
		
		if(District_selected.equals("Nizamabad")) 
		{
			System.out.println("Test pass, Displayed selected option :"+District_selected);
		}
		else
		{
			System.out.println("Test fail, Displayed other than selected option"+District_selected);
		}
		WebElement Locality=driver.findElement(By.id("customLocality"));
		Locality.sendKeys("Indian");
		Thread.sleep(3000);
		String Ltext=Locality.getText();
		System.out.println("Locality:"+Ltext);
		driver.close();
		
	}

}
