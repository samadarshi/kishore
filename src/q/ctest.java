package q;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ctest
{
@Test(invocationCount=5)
//(priority=-2)
public void Aest1()
{
	System.out.println("create customer");
}

@Test(enabled=false)
public void Cest2()
{
	System.out.println("modify customer");
}

@Test
//(priority=-1)
public void Best3()
{
	System.out.println("delete customer");
}

@BeforeMethod
public void befmettest()
{
	System.out.println("login");
}

@AfterMethod
public void affmettest()
{
	System.out.println("loout");
}
@BeforeClass
public void beforclasstest()
{
	System.out.println("openbrowser");
	
}
@AfterClass
public void afterclasstest()
{
	System.out.println("close the browser");
	
}

}
