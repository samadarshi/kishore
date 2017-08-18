package ad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class VerifyUrl {

	public static void main(String[] args)
	{
		String s1="IQPC Corporate";
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
        driver.get("https://www.iqpc.com/");
		
		String s2 = driver.getTitle();
		
		System.out.println("driver info "+s1);
		System.out.println("Driver info "+s2);
		if (s1.contains(s2))
		{
			System.out.println("pass");
		} 
		else 
		{
			System.out.println("fail");

		}
	}
	

}
