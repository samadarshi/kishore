package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		//WebElement a = driver.findElement(By.xpath("//input[@id='email']"));
		// a.sendKeys("samadarshi.medar30@gmail.com");
		
	WebElement e = driver.findElement(By.id("email"));
          String text = e.getAttribute("id");	
          Thread.sleep(2000);
          System.out.println(text);

	Thread.sleep(2000);
	driver.quit();
	
	}

}
