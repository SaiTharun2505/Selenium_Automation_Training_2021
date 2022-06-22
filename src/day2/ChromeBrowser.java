package day2;

public class ChromeBrowser
{
	public ChromeBrowser()
	{
		//double click on google chrome  
		System.out.println("Chrome Browser opened");
	}
	public void Enter_Url(String url)
	{
		System.out.println( url + " url entered successfully");
	}
	public void Siteopen()
	{
		System.out.println("Site Opened");
	}
	public void Enter_Login_details(String UserName, String Password)
	{
		System.out.println("Sign in Successful with Username " +UserName+ " and Password " +Password+ " and Instagram page launched");
	}
	public String UserName="Saitharun";
	String GetUsername()
	{
		return UserName;
	}
	public void Instagram()
	{
		Enter_Url("http://instagram.com//");
		Enter_Url("http://facebook.com//");
		Siteopen();
		Enter_Login_details("Saitharun25", "xxxxxxxxx");
		Enter_Login_details("pavan_02","xxxxxxxxxx" );
	}

	public static void main(String[] args)
	{
	   ChromeBrowser obj=new ChromeBrowser();
	   obj.Instagram();
	   String Name=obj.GetUsername();
	   System.out.println("Username is : "+Name);

    }
}