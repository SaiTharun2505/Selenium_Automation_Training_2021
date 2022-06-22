package pageObjectModel.Object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook_Dropdown
{
	@FindBy(xpath = "//select[@name='birthday_day']/option") public List<WebElement> Date;
	@FindBy(xpath = "//select[@name='birthday_month']/option") public List<WebElement> Month;
	@FindBy(xpath = "//select[@name='birthday_year']/option") public List<WebElement> Year;
	
	public void DropDown_Selection(List<WebElement> DropDown_name, String DropDown_Data)
	{
		for (WebElement Each_Option : DropDown_name)
		{
			String Selected_Option=Each_Option.getText();
			if (Selected_Option.equals(DropDown_Data)) 
			{
				Each_Option.click();
				break;
				
			}
		}
	}
}
