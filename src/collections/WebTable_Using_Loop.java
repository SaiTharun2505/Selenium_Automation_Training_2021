package collections;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Using_Loop {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/exchange-traded-funds-etf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@id='bestETFLong']"));
		List<WebElement> Rows=table.findElements(By.tagName("tr"));
		Rows.remove(0);
		
		WebElement Next_Btn=driver.findElement(By.id("bestETFLong_next"));
		String Actual_Class_Attribute=Next_Btn.getAttribute("class");
	
		while (!Actual_Class_Attribute.contains("disabled"))
		{

			table=driver.findElement(By.xpath("//table[@id='bestETFLong']"));
			Rows=table.findElements(By.tagName("tr"));
			Rows.remove(0);
			
			System.out.println(Rows.size());
			
			for (int i = 0; i < Rows.size(); i++) 
			{
				WebElement Row=Rows.get(i);
				List<WebElement> Cells=Row.findElements(By.tagName("td"));
				System.out.println(Cells.size());
				
				for (int j = 0; j < Cells.size(); j++) 
				{
					
					WebElement Cell=Cells.get(j);
					String Cell_Text=Cell.getText();
					System.out.println(Cell_Text);
				}
			}
	
			Next_Btn.click();
			Next_Btn=driver.findElement(By.id("bestETFLong_next"));
			Actual_Class_Attribute=Next_Btn.getAttribute("class");
			System.out.println(Actual_Class_Attribute);
			
			Thread.sleep(5000);
		}
		table=driver.findElement(By.xpath("//table[@id='bestETFLong']"));
		Rows=table.findElements(By.tagName("tr"));
		Rows.remove(0);
		
		for (int i = 0; i < Rows.size(); i++) 
		{
			WebElement Row=Rows.get(i);
			List<WebElement> Cells=Row.findElements(By.tagName("td"));
			System.out.println(Cells.size());
			
			for (int j = 0; j < Cells.size(); j++) 
			{
				
				WebElement Cell=Cells.get(j);
				String Cell_Text=Cell.getText();
				System.out.println(Cell_Text);
			}
		}
			
	}

}
