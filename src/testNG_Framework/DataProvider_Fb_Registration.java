package testNG_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider_Fb_Registration {
 
  @DataProvider
  public Object[][] dp()
  {
	  
    return new Object[][] {
      new Object[] { "Saitharun", "Sakkaram","sakkaramsaitharun.144@gmail.com","sakkaramsaitharun.144@gmail.com","Asdfghjk","25","May","1998"},
      new Object[] { "Saitharun", "Sakkaram","sakkaramsaitharun.2505@gmail.com","sakkaramsaitharun.2505@gmail.com","Asdfghjk","30","Jun","1997"},
   
    
    };
  }
}
