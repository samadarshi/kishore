package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyimage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/samad/Desktop/samhtml/samu.html");
		WebElement a = driver.findElement(By.xpath("//img"));
		Thread.sleep(3000);
       boolean b = a.isDisplayed();
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
