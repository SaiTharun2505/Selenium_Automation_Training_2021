package day3;

import day2.ChromeBrowser;
import day2.Instance_method;

public class Test_outside_package {

	public static void main(String[] args) {
		Instance_method call=new Instance_method();
		
		call.method1();
		call.method2();
		Instance_method.method3();
		Instance_method.method4();
		
		ChromeBrowser call1=new ChromeBrowser();
		//call1.Enter_Url("http://facebook.com");
		call1.Instagram();

	}

}
