package programs;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class COMPO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		
	    WebElement link = driver.findElement(By.linkText("Create a Page"));
	    
	   Actions act =new Actions(driver);
	    act.contextClick(link).sendKeys(Keys.CONTROL).click().perform();
	    	}

}
