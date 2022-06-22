package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Footer_text=driver.findElement(By.id("pageFooterChildren"));
		String All_Footer_links=Footer_text.getText();
		System.out.println(All_Footer_links);
		/*
		 * Sign UpLog InMessengerFacebook LiteWatchPeoplePagesPage categoriesPlacesGamesLocationsMarketplaceFacebook PayGroupsJobsOculusPortalInstagram
		 * 
		 */
		
		String Exp_Link1="Sign Up";
		String Exp_Link2="Log In";
		String Exp_Link3="Messenger";
		String Exp_Link4="Facebook Lite";
		String Exp_Link5="Watch";
		String Exp_Link6="People";
		String Exp_Link7="Pages";
		String Exp_Link8="Page categories";
		String Exp_Link9="Places";
		String Exp_Link10="Games";
		String Exp_Link11="Locations";
		String Exp_Link12="Marketplace";
		String Exp_Link13="Facebook Pay";
		String Exp_Link14="Groups";
		String Exp_Link15="India";
		String Exp_Link16="Telangana";
		String Exp_Link17="Hyderabad";
		String Exp_Link18="Nizaabad";
		if(All_Footer_links.contains(Exp_Link1))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link1);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}
		if(All_Footer_links.contains(Exp_Link2))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link2);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}
		if(All_Footer_links.contains(Exp_Link3))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link3);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}
		if(All_Footer_links.contains(Exp_Link4))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link4);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link5))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link5);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link6))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link6);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link7))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link7);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link8))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link8);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link9))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link9);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link10))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link10);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		
		if(All_Footer_links.contains(Exp_Link11))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link11);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link12))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link12);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link13))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link13);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link14))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link14);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}	
		if(All_Footer_links.contains(Exp_Link15))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link15);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}
		if(All_Footer_links.contains(Exp_Link16))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link16);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}
		if(All_Footer_links.contains(Exp_Link17))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link17);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}
		if(All_Footer_links.contains(Exp_Link18))
		{
			System.out.println("Test Pass; Expected link is displayed-----> "+Exp_Link18);
		}
		else
		{
			System.out.println("Test Fail; Expected link is not dislpayed");
		}

	}

}
