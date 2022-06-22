package collections;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments{

	public static void main(String[] args) throws Exception  {

		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/location/telangana/hyderabad");
		driver.manage().window().maximize();
		
		WebElement State_Selection=driver.findElement(By.id("customState"));
		List<WebElement> All_Options=State_Selection.findElements(By.tagName("option"));
		System.out.println("Size of Options in the State List is: "+All_Options.size());
		
		List<String> list=new ArrayList<String>();
		list.add("Please select state first");
		list.add("Port Blair");
		list.add("South Andaman");
		list.add("Visakhapatnam");
		list.add("Papum Pare");
		list.add("Goalpara");
		list.add("Bhojpur");
		list.add("Chandigarh");
		list.add("Bilaspur");
		list.add("Naroli");
		list.add("Silvassa");
		list.add("Diu");
		list.add("New Delhi");
		list.add("Margao");
		list.add("Anand");
		list.add("Bahadurgarh");
		list.add("Dharamshala");
		list.add("Doda");
		list.add("Jammu");
		list.add("Chaibasa");
		list.add("Bengaluru");
		list.add("Alappuzha");
		list.add("Anuppur");
		list.add("Alibaug");
		list.add("Churachandpur");
		list.add("East Khasi Hills");
		list.add("Lawngtlai");
		list.add("Kohima");
		list.add("Balasore");
		list.add("Karaikal");
		list.add("Amritsar");
		list.add("Ajmer");
		list.add("Gangtok");
		list.add("Ariyalur");
		list.add("Nizamabad");
		list.add("North Tripura");
		list.add("Prayagraj");
		list.add("Chamoli");
		list.add("Diamond Harbour");
		
		
		for (int i =0; i < All_Options.size(); i++) 
		{
			WebElement Single_Option=All_Options.get(i);
			String State_List=Single_Option.getText();
			System.out.println(State_List);
			new Select(State_Selection).selectByIndex(i);
			Thread.sleep(3000);
			
			WebElement City_Selection=driver.findElement(By.id("customCity"));
			List<WebElement> All_City_Options=City_Selection.findElements(By.tagName("option"));
			
			for (int j = 0; j < All_City_Options.size(); j++) 
			{
				WebElement Single_City_Option=All_City_Options.get(j);
				String City_Name=Single_City_Option.getText();
				if (City_Name.contains(list.get(i)))
				{
					System.out.println("Size of options in the City List: "+All_City_Options.size());
					System.out.println("Test Pass ===> Expected city is in the list : "+City_Name);
				}
				
			}
			
			
			
			
			
		}
			
		
	}

}
