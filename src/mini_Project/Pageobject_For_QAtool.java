package mini_Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobject_For_QAtool
{
	//Element path
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]") public WebElement Element_Loc;
	
	//Textbox Loc
	@FindBy(id="item-0") public WebElement Textbox_Loc;
	//Elements in textbox 
	@FindBy(id="userName-label") public WebElement FullName_Label_Loc;
	@FindBy(id="userName") public WebElement Full_Name_Editbox_Loc;
	@FindBy(id="userEmail-label") public WebElement Email_Label_Loc;
	@FindBy(id="userEmail") public WebElement Email_Editbox_Loc;
	@FindBy(id="currentAddress-label") public WebElement CurrentAddress_Label_Loc;
	@FindBy(id="currentAddress") public WebElement CurrentAddress_Editbox_Loc;
	@FindBy(id="permanentAddress-label") public WebElement PermanentAddress_Label_Loc; 
	@FindBy(id="permanentAddress") public WebElement PermanentAddress_Editbox_Loc;
	@FindBy(id="submit") public WebElement Submit_Btn_Loc;
	
	//Output area
	
	@FindBy(xpath="//div[@id='output']") public WebElement Output;
	
	//CheckBox Loc
	@FindBy(id="item-1") public WebElement Checkbox_Loc;
	@FindBy(xpath = "(//button[contains(@aria-label,'Toggle')])[1]") public WebElement Home_Toggle_Btn;
	@FindBy(xpath = "//label[@for='tree-node-home']") public WebElement Home_CB;
	@FindBy(xpath="//label[@for='tree-node-home']/span/*") public WebElement Home_SS;
	@FindBy(xpath = "(//button[contains(@aria-label,'Toggle')])[2]") public WebElement Desktop_Toggle_Btn;
	@FindBy(xpath = "//label[@for='tree-node-desktop']") public WebElement Desktop_CB;
	@FindBy(xpath = "//label[@for='tree-node-desktop']/span/*") public WebElement Desktop_SS;
	@FindBy(xpath = "//label[@for='tree-node-notes']") public WebElement Notes_CB;
	@FindBy(xpath = "//label[@for='tree-node-notes']/span/*") public WebElement Notes_SS;
	@FindBy(xpath = "//label[@for='tree-node-commands']") public WebElement Commands_CB;
	@FindBy(xpath = "//label[@for='tree-node-commands']/span/*") public WebElement Commands_SS;
	@FindBy(xpath = "(//button[contains(@aria-label,'Toggle')])[3]") public WebElement Documents_Toggle_Btn;
	@FindBy(xpath = "//label[@for='tree-node-documents']") public WebElement Documents_CB;
	@FindBy(xpath = "//label[@for='tree-node-documents']/span/*") public WebElement Documents_SS;
	@FindBy(xpath = "(//button[contains(@aria-label,'Toggle')])[4]") public WebElement WorkSpace_Toggle_Btn;
	@FindBy(xpath = "//label[@for='tree-node-workspace']") public WebElement WorkSpace_CB;
	@FindBy(xpath = "//label[@for='tree-node-workspace']/span/*") public WebElement WorkSpace_SS;
	@FindBy(xpath = "//label[@for='tree-node-react']") public WebElement React_CB;
	@FindBy(xpath = "//label[@for='tree-node-react']/span/*") public WebElement React_SS;
	@FindBy(xpath = "//label[@for='tree-node-angular']") public WebElement Angular_CB;
	@FindBy(xpath = "//label[@for='tree-node-angular']/span/*") public WebElement Angular_SS;
	@FindBy(xpath = "//label[@for='tree-node-veu']") public WebElement Veu_CB;
	@FindBy(xpath = "//label[@for='tree-node-veu']/span/*") public WebElement Veu_SS;
	@FindBy(xpath = "(//button[contains(@aria-label,'Toggle')])[5]") public WebElement Office_Toggle_Btn;
	@FindBy(xpath = "//label[@for='tree-node-office']") public WebElement Office_CB;
	@FindBy(xpath = "//label[@for='tree-node-office']/span/*") public WebElement Office_SS;
	@FindBy(xpath = "//label[@for='tree-node-public']") public WebElement Public_CB;
	@FindBy(xpath = "//label[@for='tree-node-public']/span/*") public WebElement Public_SS;
	@FindBy(xpath = "//label[@for='tree-node-private']") public WebElement Private_CB;
	@FindBy(xpath = "//label[@for='tree-node-private']/span/*") public WebElement Private_SS;
	@FindBy(xpath = "//label[@for='tree-node-classified']") public WebElement Classified_CB;
	@FindBy(xpath = "//label[@for='tree-node-classified']/span/*") public WebElement Classified_SS;
	@FindBy(xpath = "//label[@for='tree-node-general']") public WebElement General_CB;
	@FindBy(xpath = "//label[@for='tree-node-general']/span/*") public WebElement General_SS;
	@FindBy(xpath = "(//button[contains(@aria-label,'Toggle')])[6]") public WebElement Downloads_Toggle_Btn;
	@FindBy(xpath = "//label[@for='tree-node-downloads']") public WebElement Downloads_CB;
	@FindBy(xpath = "//label[@for='tree-node-downloads']/span/*") public WebElement Downloads_SS;
	@FindBy(xpath = "//label[@for='tree-node-wordFile']") public WebElement WordFile_CB;
	@FindBy(xpath = "//label[@for='tree-node-wordFile']/span/*") public WebElement WordFile_SS;
	@FindBy(xpath = "//label[@for='tree-node-excelFile']") public WebElement ExcelFile_CB;
	@FindBy(xpath = "//label[@for='tree-node-excelFile']/span/*") public WebElement ExcelFile_SS;
	
	
	
}
