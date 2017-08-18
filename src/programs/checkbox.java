package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/samad/Desktop/html/exp.html");
		WebElement a = driver.findElement(By.xpath("//input[@type='checkbox' and @id='7']"));
		a.click();

	 Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox' and @id='8']")).click();

	
	
	}

}
