package programs;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		
	    WebElement link = driver.findElement(By.linkText("Forgotten account?"));
	    
	   Actions act =new Actions(driver);
	    act.contextClick(link).perform();
	    Robot R= new Robot();
	    R.keyPress(KeyEvent.VK_T);
	  Thread.sleep(3000);
	 
//	  R.keyPress(KeyEvent.VK_W);
//	 Thread.sleep(3000);
//	  R.keyPress(KeyEvent.VK_P);
//	 Thread.sleep(3000);
	}

}
