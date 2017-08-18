package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BTest
{
	@Test(priority=-1)
	public void newTest1()
	{
		//System.out.println("Running new test1");
		Reporter.log("Running new test1");
	}
	
	@Test(invocationCount=10 ,priority=0)
	
	public void newTest2()
	{
		
		System.out.println("Running new test2");
	}
	
	
}
