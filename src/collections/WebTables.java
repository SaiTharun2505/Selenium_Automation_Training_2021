package collections;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "UpdatedDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@class='table table-theme1 table-global_indices']"));
		List<WebElement> Rows=table.findElements(By.tagName("tr"));
		System.out.println("No of Rows in the table ===> "+Rows.size());
		//String Header_Cell[];
		String[] Header_Cell=new String[5];
		for (int i = 0; i < Rows.size(); i++)
		{
			WebElement Row=Rows.get(i);
			String Expected_Header="Index";
			String Actual_Content=Row.getText();
			
			if (Actual_Content.contains(Expected_Header)) {
				
				List<WebElement> Header_Cells=Row.findElements(By.tagName("th"));
				
				Header_Cell[0]=Header_Cells.get(0).getText();
				Header_Cell[1]=Header_Cells.get(1).getText();
				Header_Cell[2]=Header_Cells.get(2).getText();
				Header_Cell[3]=Header_Cells.get(3).getText();
				Header_Cell[4]=Header_Cells.get(4).getText();
				
				
				}
				
			//String Expected_Company="PSE Composite";
			//if (Actual_Content.contains(Expected_Company))
			{
				//System.out.println("Expected Company is in Top 5 List =====>");
				List<WebElement> Cells=Row.findElements(By.tagName("td"));
				for (int j = 0; j < Cells.size(); j++) {
					WebElement Cell=Cells.get(j);
					String Cell_Text=Cell.getText();
					System.out.println(Header_Cell[j]+" ================> "+Cell_Text);
				}
				System.out.println("\n");
				
			}
			
		}
	}

}
