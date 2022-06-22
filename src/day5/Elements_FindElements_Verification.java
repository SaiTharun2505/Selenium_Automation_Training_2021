package day5;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_FindElements_Verification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement Parent=driver.findElement(By.className("accordion"));
		List<WebElement> List_of_Elements=Parent.findElements(By.className("element-group"));
		int Size=List_of_Elements.size();
		
		for (int i = 1; i <= Size; i++) 
		{
			
			String Elements_Xpath[]= {null,"(//ul[@class='menu-list'])[1]", "(//ul[@class='menu-list'])[2]", "(//ul[@class='menu-list'])[3]",
					"(//ul[@class='menu-list'])[4]", "(//ul[@class='menu-list'])[5]", "(//ul[@class='menu-list'])[6]"};
			
			WebElement Elements_List=driver.findElement(By.xpath(Elements_Xpath[i]));
			List<WebElement> All_Elements=Elements_List.findElements(By.className("text"));
			System.out.println("List Count Under Elements : "+All_Elements.size());
			
			for (int j = 0; j < All_Elements.size(); j++) 
			{
				WebElement Single_Element=All_Elements.get(j);
				String Each_Elements_Text=Single_Element.getAttribute("innerHTML");
				System.out.println(Each_Elements_Text);
			}
		}
		
		/*WebElement Elements_List=driver.findElement(By.xpath("(//ul[@class='menu-list'])[1]"));
		List<WebElement> All_Elements=Elements_List.findElements(By.className("text"));
		System.out.println("List Count Under Elements : "+All_Elements.size());
		
		for (int i = 0; i < All_Elements.size(); i++) 
		{
			WebElement Single_Element=All_Elements.get(i);
			String Each_Elements_Text=Single_Element.getAttribute("innerHTML");
			System.out.println(Each_Elements_Text);
		}
		
		WebElement Forms_List=driver.findElement(By.xpath("(//ul[@class='menu-list'])[2]"));
		List<WebElement> All_Forms=Forms_List.findElements(By.className("text"));
		System.out.println("List Count Under Elements : "+All_Forms.size());
		
		for (int i = 0; i < All_Forms.size(); i++) 
		{
			WebElement Single_Form=All_Forms.get(i);
			String Each_Form_Elements_Text=Single_Form.getAttribute("innerHTML");
			System.out.println(Each_Form_Elements_Text);
		}
		
		WebElement Alerts_List=driver.findElement(By.xpath("(//ul[@class='menu-list'])[3]"));
		List<WebElement> All_Alerts=Alerts_List.findElements(By.className("text"));
		System.out.println("List Count Under Elements : "+All_Alerts.size());
		
		for (int i = 0; i < All_Alerts.size(); i++) 
		{
			WebElement Single_Alert=All_Alerts.get(i);
			String Each_Alert_Elements_Text=Single_Alert.getAttribute("innerHTML");
			System.out.println(Each_Alert_Elements_Text);
		
		}
		
		WebElement Widgets_List=driver.findElement(By.xpath("(//ul[@class='menu-list'])[4]"));
		List<WebElement> All_Widgets=Widgets_List.findElements(By.className("text"));
		System.out.println("List Count Under Elements : "+All_Widgets.size());
		
		for (int i = 0; i < All_Widgets.size(); i++) 
		{
			WebElement Single_Widget=All_Widgets.get(i);
			String Each_Widget_Elements_Text=Single_Widget.getAttribute("innerHTML");
			System.out.println(Each_Widget_Elements_Text);
		}
		
		WebElement Interactions_List=driver.findElement(By.xpath("(//ul[@class='menu-list'])[5]"));
		List<WebElement> All_Interactions=Interactions_List.findElements(By.className("text"));
		System.out.println("List Count Under Elements : "+All_Interactions.size());
		
		for (int i = 0; i < All_Interactions.size(); i++) 
		{
			WebElement Single_Interaction=All_Interactions.get(i);
			String Each_Interaction_Elements_Text=Single_Interaction.getAttribute("innerHTML");
			System.out.println(Each_Interaction_Elements_Text);
		}
		
		WebElement Book_Store_List=driver.findElement(By.xpath("(//ul[@class='menu-list'])[6]"));
		List<WebElement> All_Book_Store=Book_Store_List.findElements(By.className("text"));
		System.out.println("List Count Under Elements : "+All_Book_Store.size());
		
		for (int i = 0; i < All_Book_Store.size(); i++) 
		{
			WebElement Single_Book_Store=All_Book_Store.get(i);
			String Each_Book_Store_Elements_Text=Single_Book_Store.getAttribute("innerHTML");
			System.out.println(Each_Book_Store_Elements_Text);
		}*/
	}

}
