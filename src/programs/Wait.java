package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.fb.com");
		
		driver.findElement(By.id("email")).sendKeys("samadarshi.medar30@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("samadarshi30");
		driver.findElement(By.id("u_0_r")).click();
		
		Thread.sleep(3000);
		
       driver.manage().window().maximize();
       driver.close();
       
      
		
	}

}
