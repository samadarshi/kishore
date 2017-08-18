//Alert Popup


package programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopup 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		Alert ale = driver.switchTo().alert();
		Thread.sleep(2000);
		ale.accept();
		driver.close();

	}


}
