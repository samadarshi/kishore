package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/samad/Desktop/samhtml/page1.html");
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("t2"));
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("t3")).sendKeys("Shoban");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t2")).sendKeys("kishore sir");

		
	}
	

}
