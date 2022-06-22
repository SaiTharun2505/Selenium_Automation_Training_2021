package mini_Project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Checkbox_Verification
{
	JavascriptExecutor JS;
	@Test(priority=0,description="Verification on Checkbox Button")
	  public void Tc001() 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Checkbox_Loc.isDisplayed(), "Checkbox Button is not Displayed at Webpage");
		  Reporter.log("Checkbox Button is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Checkbox_Loc.isEnabled(), "Checkbox Button is not Enabled at Webpage");
		  Reporter.log("Checkbox Button is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Checkbox_Loc.getText().equals("Check Box"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Checkbox_Loc.getText(),true);
		  objects.Checkbox_Loc.click();
	  }
	
	@Test(priority=1,description="Verification on Home Toggle Button")
	  public void Tc002() 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);		  
		  Assert.assertTrue(objects.Home_Toggle_Btn.isDisplayed(), "Home toggle Button is not Displayed at Webpage");
		  Reporter.log("Home Toggle Button is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Home_Toggle_Btn.isEnabled(), "Home toggle Button is not Enabled at Webpage");
		  Reporter.log("Home Toggle Button is Enabled at Webpage",true);
		  objects.Home_Toggle_Btn.click();
		  
	  }
	
	@Test(priority=2,description="Verification on Home Checkbox Button")
	  public void Tc003() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Home_CB.isDisplayed(), "Home Check Box is not Displayed at Webpage");
		  Reporter.log("Home Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Home_CB.isEnabled(), "Home Check Box is not Enabled at Webpage");
		  Reporter.log("Home Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Home_CB.getText().equals("Home"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Home_CB.getText(),true);		  
		  Assert.assertTrue(objects.Home_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Home check box is selected, it should not be selected by default");
		  Reporter.log("By Default Home check box is not selected, it should not be selected by default",true);
		  objects.Home_CB.click();
		  Assert.assertTrue(objects.Home_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Home check box it is not selected");
		  Reporter.log("By clicking on Home check box it is selected ",true);
		  objects.Home_CB.click();
		  
	  }
	
	@Test(priority=3,description="Verification on Desktop Toggle Button")
	  public void Tc004() 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Desktop_Toggle_Btn.isDisplayed(), "Desktop toggle Button is not Displayed at Webpage");
		  Reporter.log("Desktop Toggle Button is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Desktop_Toggle_Btn.isEnabled(), "Desktop toggle Button is not Enabled at Webpage");
		  Reporter.log("Desktop Toggle Button is Enabled at Webpage",true);
		  objects.Desktop_Toggle_Btn.click();
		  
	  }
	

	@Test(priority=4,description="Verification on Desktop Checkbox Button")
	  public void Tc005() throws Exception 
	  {
      	  Thread.sleep(5000);
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Desktop_CB.isDisplayed(), "Desktop Check Box is not Displayed at Webpage");
		  Reporter.log("Desktop Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Desktop_CB.isEnabled(), "Desktop Check Box is not Enabled at Webpage");
		  Reporter.log("Desktop Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Desktop_CB.getText().equals("Desktop"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Desktop_CB.getText(),true);
		  Assert.assertTrue(objects.Desktop_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Desktop check box is selected, it should not be selected by default");
		  Reporter.log("By Default Desktop check box is not selected, it should not be selected by default",true);
		  objects.Desktop_CB.click();
		  Assert.assertTrue(objects.Desktop_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Desktop check box it is not selected");
		  Reporter.log("By clicking on Desktop check box it is selected ",true);
		  objects.Desktop_CB.click(); 
		  
	  }
	

	@Test(priority=5,description="Verification on Desktop Checkbox Button")
	  public void Tc006() throws Exception 
	  {
		Thread.sleep(5000);
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Notes_CB.isDisplayed(), "Notes Check Box is not Displayed at Webpage");
		  Reporter.log("Notes Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Notes_CB.isEnabled(), "Notes Check Box is not Enabled at Webpage");
		  Reporter.log("Notes Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Notes_CB.getText().equals("Notes"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Notes_CB.getText(),true);
		  Assert.assertTrue(objects.Notes_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Notes check box is selected, it should not be selected by default");
		  Reporter.log("By Default Notes check box is not selected, it should not be selected by default",true);
		  objects.Notes_CB.click();
		  Assert.assertTrue(objects.Notes_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Notes check box it is not selected");
		  Reporter.log("By clicking on Notes check box it is selected ",true);
		  objects.Notes_CB.click(); 
		  
		  
	  }
	

	@Test(priority=6,description="Verification on Commands Checkbox Button")
	  public void Tc007() throws Exception 
	  {
		Thread.sleep(5000);
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Commands_CB.isDisplayed(), "Commands Check Box is not Displayed at Webpage");
		  Reporter.log("Commands Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Commands_CB.isEnabled(), "Commands Check Box is not Enabled at Webpage");
		  Reporter.log("Commands Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Commands_CB.getText().equals("Commands"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Commands_CB.getText(),true);
		  Assert.assertTrue(objects.Commands_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Commands check box is selected, it should not be selected by default");
		  Reporter.log("By Default Commands check box is not selected, it should not be selected by default",true);
		  objects.Commands_CB.click();
		  Assert.assertTrue(objects.Commands_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Commands check box it is not selected");
		  Reporter.log("By clicking on Commands check box it is selected ",true);
		  objects.Commands_CB.click(); 
		 
	  }
	
	
	@Test(priority=7,description="Verification on Documents Toggle Button")
	  public void Tc008() 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Documents_Toggle_Btn.isDisplayed(), "Documents toggle Button is not Displayed at Webpage");
		  Reporter.log("Documents Toggle Button is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Documents_Toggle_Btn.isEnabled(), "Documents toggle Button is not Enabled at Webpage");
		  Reporter.log("Documents Toggle Button is Enabled at Webpage",true);
		  objects.Documents_Toggle_Btn.click();
		  
	  }
	

	@Test(priority=8,description="Verification on Documents Checkbox Button")
	  public void Tc009() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Documents_CB.isDisplayed(), "Documents Check Box is not Displayed at Webpage");
		  Reporter.log("Documents Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Documents_CB.isEnabled(), "Documents Check Box is not Enabled at Webpage");
		  Reporter.log("Documents Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Documents_CB.getText().equals("Documents"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Documents_CB.getText(),true);
		  Assert.assertTrue(objects.Documents_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Documents check box is selected, it should not be selected by default");
		  Reporter.log("By Default Documents check box is not selected, it should not be selected by default",true);
		  objects.Documents_CB.click();
		  Assert.assertTrue(objects.Documents_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Documents check box it is not selected");
		  Reporter.log("By clicking on Documents check box it is selected ",true);
		  objects.Documents_CB.click(); 
		 
	  }
	

	@Test(priority=9,description="Verification on WorkSpace Toggle Button")
	  public void Tc0010() 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.WorkSpace_Toggle_Btn.isDisplayed(), "WorkSpace toggle Button is not Displayed at Webpage");
		  Reporter.log("WorkSpace Toggle Button is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.WorkSpace_Toggle_Btn.isEnabled(), "WorkSpace toggle Button is not Enabled at Webpage");
		  Reporter.log("WorkSpace Toggle Button is Enabled at Webpage",true);
		  objects.WorkSpace_Toggle_Btn.click();
		  
	  }
	
	@Test(priority=10,description="Verification on WorkSpace Checkbox Button")
	  public void Tc0011() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.WorkSpace_CB.isDisplayed(), "WorkSpace Check Box is not Displayed at Webpage");
		  Reporter.log("WorkSpace Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.WorkSpace_CB.isEnabled(), "WorkSpace Check Box is not Enabled at Webpage");
		  Reporter.log("WorkSpace Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.WorkSpace_CB.getText().equals("WorkSpace"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.WorkSpace_CB.getText(),true);
		  Assert.assertTrue(objects.WorkSpace_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default WorkSpace check box is selected, it should not be selected by default");
		  Reporter.log("By Default WorkSpace check box is not selected, it should not be selected by default",true);
		  objects.WorkSpace_CB.click();
		  Assert.assertTrue(objects.WorkSpace_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on WorkSpace check box it is not selected");
		  Reporter.log("By clicking on WorkSpace check box it is selected ",true);
		  objects.WorkSpace_CB.click(); 
		 	  
	  }
	
	@Test(priority=11,description="Verification on React Checkbox Button")
	  public void Tc0012() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.React_CB.isDisplayed(), "React Check Box is not Displayed at Webpage");
		  Reporter.log("React Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.React_CB.isEnabled(), "React Check Box is not Enabled at Webpage");
		  Reporter.log("React Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.React_CB.getText().equals("React"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.React_CB.getText(),true);
		  Assert.assertTrue(objects.React_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default React check box is selected, it should not be selected by default");
		  Reporter.log("By Default React check box is not selected, it should not be selected by default",true);
		  objects.React_CB.click();
		  Assert.assertTrue(objects.React_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on React check box it is not selected");
		  Reporter.log("By clicking on React check box it is selected ",true);
		  objects.React_CB.click(); 
		  
	  }
	
	@Test(priority=12,description="Verification on Angular Checkbox Button")
	  public void Tc0013() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Angular_CB.isDisplayed(), "Angular Check Box is not Displayed at Webpage");
		  Reporter.log("Angular Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Angular_CB.isEnabled(), "Angular Check Box is not Enabled at Webpage");
		  Reporter.log("Angular Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Angular_CB.getText().equals("Angular"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Angular_CB.getText(),true);
		  Assert.assertTrue(objects.Angular_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Angular check box is selected, it should not be selected by default");
		  Reporter.log("By Default Angular check box is not selected, it should not be selected by default",true);
		  objects.Angular_CB.click();
		  Assert.assertTrue(objects.Angular_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Angular check box it is not selected");
		  Reporter.log("By clicking on Angular check box it is selected ",true);
		  objects.Angular_CB.click(); 
		  JS=((JavascriptExecutor)Element_Textbox_Verification.driver);
		  JS.executeScript("window.scrollBy(0,400)");
		  Thread.sleep(3000);
		  
	  }
	
	@Test(priority=13,description="Verification on Veu Checkbox Button")
	  public void Tc0014() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Veu_CB.isDisplayed(), "Veu Check Box is not Displayed at Webpage");
		  Reporter.log("Veu Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Veu_CB.isEnabled(), "Veu Check Box is not Enabled at Webpage");
		  Reporter.log("Veu Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Veu_CB.getText().equals("Veu"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Veu_CB.getText(),true);
		  Assert.assertTrue(objects.Veu_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Veu check box is selected, it should not be selected by default");
		  Reporter.log("By Default Veu check box is not selected, it should not be selected by default",true);
		  objects.Veu_CB.click();
		  Assert.assertTrue(objects.Veu_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Veu check box it is not selected");
		  Reporter.log("By clicking on Veu check box it is selected ",true);
		  objects.Veu_CB.click(); 
		 	  
	  }
	 
	@Test(priority=14,description="Verification on Office Toggle Button")
	  public void Tc0015() 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Office_Toggle_Btn.isDisplayed(), "Office toggle Button is not Displayed at Webpage");
		  Reporter.log("Office Toggle Button is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Office_Toggle_Btn.isEnabled(), "Office toggle Button is not Enabled at Webpage");
		  Reporter.log("Office Toggle Button is Enabled at Webpage",true);
		  objects.Office_Toggle_Btn.click();
		  
	  }
	 
	@Test(priority=15,description="Verification on Office Checkbox Button")
	  public void Tc0016() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Office_CB.isDisplayed(), "Office Check Box is not Displayed at Webpage");
		  Reporter.log("Office Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Office_CB.isEnabled(), "Office Check Box is not Enabled at Webpage");
		  Reporter.log("Office Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Office_CB.getText().equals("Office"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Office_CB.getText(),true);
		  Assert.assertTrue(objects.Office_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Office check box is selected, it should not be selected by default");
		  Reporter.log("By Default Office check box is not selected, it should not be selected by default",true);
		  objects.Office_CB.click();
		  Assert.assertTrue(objects.Office_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Office check box it is not selected");
		  Reporter.log("By clicking on Office check box it is selected ",true);
		  objects.Office_CB.click(); 
		 	  
	  }
	
	@Test(priority=16,description="Verification on Public Checkbox Button")
	  public void Tc0017() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Public_CB.isDisplayed(), "Public Check Box is not Displayed at Webpage");
		  Reporter.log("Public Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Public_CB.isEnabled(), "Public Check Box is not Enabled at Webpage");
		  Reporter.log("Public Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Public_CB.getText().equals("Public"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Public_CB.getText(),true);
		  Assert.assertTrue(objects.Public_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Public check box is selected, it should not be selected by default");
		  Reporter.log("By Default Public check box is not selected, it should not be selected by default",true);
		  objects.Public_CB.click();
		  Assert.assertTrue(objects.Public_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Public check box it is not selected");
		  Reporter.log("By clicking on Public check box it is selected ",true);
		  objects.Public_CB.click(); 
		  
		  
	  }
	 
	@Test(priority=17,description="Verification on Private Checkbox Button")
	  public void Tc0018() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Private_CB.isDisplayed(), "Private Check Box is not Displayed at Webpage");
		  Reporter.log("Private Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Private_CB.isEnabled(), "Private Check Box is not Enabled at Webpage");
		  Reporter.log("Private Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Private_CB.getText().equals("Private"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Private_CB.getText(),true);
		  Assert.assertTrue(objects.Private_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Private check box is selected, it should not be selected by default");
		  Reporter.log("By Default Private check box is not selected, it should not be selected by default",true);
		  objects.Private_CB.click();
		  Assert.assertTrue(objects.Private_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Private check box it is not selected");
		  Reporter.log("By clicking on Private check box it is selected ",true);
		  objects.Private_CB.click(); 
		   
	  }
	 
	@Test(priority=18,description="Verification on Classified Checkbox Button")
	  public void Tc0019() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Classified_CB.isDisplayed(), "Classified Check Box is not Displayed at Webpage");
		  Reporter.log("Classified Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Classified_CB.isEnabled(), "Classified Check Box is not Enabled at Webpage");
		  Reporter.log("Classified Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Classified_CB.getText().equals("Classified"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Classified_CB.getText(),true);
		  Assert.assertTrue(objects.Classified_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Classified check box is selected, it should not be selected by default");
		  Reporter.log("By Default Classified check box is not selected, it should not be selected by default",true);
		  objects.Classified_CB.click();
		  Assert.assertTrue(objects.Classified_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Classified check box it is not selected");
		  Reporter.log("By clicking on Classified check box it is selected ",true);
		  objects.Classified_CB.click(); 
		 	  
	  }
	
	@Test(priority=19,description="Verification on General Checkbox Button")
	  public void Tc0020() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.General_CB.isDisplayed(), "General Check Box is not Displayed at Webpage");
		  Reporter.log("General Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.General_CB.isEnabled(), "General Check Box is not Enabled at Webpage");
		  Reporter.log("General Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.General_CB.getText().equals("General"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.General_CB.getText(),true);
		  Assert.assertTrue(objects.General_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default General check box is selected, it should not be selected by default");
		  Reporter.log("By Default General check box is not selected, it should not be selected by default",true);
		  objects.General_CB.click();
		  Assert.assertTrue(objects.General_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on General check box it is not selected");
		  Reporter.log("By clicking on General check box it is selected ",true);
		  objects.General_CB.click(); 
		 	  
	  }
	 
	 
	@Test(priority=20,description="Verification on Downloads Toggle Button")
	public void Tc0021() 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Downloads_Toggle_Btn.isDisplayed(), "Downloads toggle Button is not Displayed at Webpage");
		  Reporter.log("Downloads Toggle Button is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Downloads_Toggle_Btn.isEnabled(), "Downloads toggle Button is not Enabled at Webpage");
		  Reporter.log("Downloads Toggle Button is Enabled at Webpage",true);
		  objects.Downloads_Toggle_Btn.click();
			  
	  }
	
	
	@Test(priority=21,description="Verification on Downloads Checkbox Button")
	  public void Tc0022() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.Downloads_CB.isDisplayed(), "Downloads Check Box is not Displayed at Webpage");
		  Reporter.log("Downloads Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.Downloads_CB.isEnabled(), "Downloads Check Box is not Enabled at Webpage");
		  Reporter.log("Downloads Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.Downloads_CB.getText().equals("Downloads"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.Downloads_CB.getText(),true);
		  Assert.assertTrue(objects.Downloads_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default Downloads check box is selected, it should not be selected by default");
		  Reporter.log("By Default Downloads check box is not selected, it should not be selected by default",true);
		  objects.Downloads_CB.click();
		  Assert.assertTrue(objects.Downloads_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on Downloads check box it is not selected");
		  Reporter.log("By clicking on Downloads check box it is selected ",true);
		  objects.Downloads_CB.click(); 
		 	  
	  }
	 
	
	@Test(priority=22,description="Verification on WordFile Checkbox Button")
	  public void Tc0023() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.WordFile_CB.isDisplayed(), "WordFile Check Box is not Displayed at Webpage");
		  Reporter.log("WordFile Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.WordFile_CB.isEnabled(), "WordFile Check Box is not Enabled at Webpage");
		  Reporter.log("WordFile Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.WordFile_CB.getText().equals("Word File.doc"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.WordFile_CB.getText(),true);
		  Assert.assertTrue(objects.WordFile_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default WordFile check box is selected, it should not be selected by default");
		  Reporter.log("By Default WordFile check box is not selected, it should not be selected by default",true);
		  objects.WordFile_CB.click();
		  Assert.assertTrue(objects.WordFile_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on WordFile check box it is not selected");
		  Reporter.log("By clicking on WordFile check box it is selected ",true);
		  objects.WordFile_CB.click(); 
		   
	  }
	 
	
	@Test(priority=23,description="Verification on ExcelFile Checkbox Button")
	  public void Tc0024() throws Exception 
	  {
		  Pageobject_For_QAtool objects=PageFactory.initElements(Element_Textbox_Verification.driver, Pageobject_For_QAtool.class);
		  Assert.assertTrue(objects.ExcelFile_CB.isDisplayed(), "ExcelFile Check Box is not Displayed at Webpage");
		  Reporter.log("ExcelFile Check Box is Diplayed at Webpage",true);
		  Assert.assertTrue(objects.ExcelFile_CB.isEnabled(), "ExcelFile Check Box is not Enabled at Webpage");
		  Reporter.log("ExcelFile Check Box is Enabled at Webpage",true);
		  Assert.assertTrue(objects.ExcelFile_CB.getText().equals("Excel File.doc"), "Expected Text is not displayed at webpage");
		  Reporter.log("Expected text is Displayed at webpage : "+objects.ExcelFile_CB.getText(),true);
		  Assert.assertTrue(objects.ExcelFile_SS.getAttribute("class").equals("rct-icon rct-icon-uncheck"), "By default ExcelFile check box is selected, it should not be selected by default");
		  Reporter.log("By Default ExcelFile check box is not selected, it should not be selected by default",true);
		  objects.ExcelFile_CB.click();
		  Assert.assertTrue(objects.ExcelFile_SS.getAttribute("class").equals("rct-icon rct-icon-check"), "By clicking on ExcelFile check box it is not selected");
		  Reporter.log("By clicking on ExcelFile check box it is selected ",true);
		  objects.ExcelFile_CB.click(); 
		  
	  }
	 


	
	
	
}
