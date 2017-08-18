package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Rad {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/samad/Desktop/samu.html");
	//	WebElement a = driver.findElement(By.xpath("//input[@name='gender'] [@value='1']"));
		//WebElement a = driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement a = driver.findElement(By.xpath("(//input[@type='button'])[1] "));
		// (//input[@type='button'])[1] 
		//driver.findElement(By.id("");
       boolean b = a.isEnabled();
       if(b)
	   {
		   System.out.println("image is diplayed==pass");
	   }
	   else
	   {
		   System.out.println("image is not diplayed==fail");
		   
	   }
	   driver.close();
	}
	
	

}
