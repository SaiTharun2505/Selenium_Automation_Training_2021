package jUnit_Framework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Using_BeforeAndAfter_Class {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("Class PreCondition");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostCondition");
	}

	@Test
	public void test()
	{
		System.out.println("Test Execution");
		
	}

}
