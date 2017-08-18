package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ewait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8085/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Logout']"))).click();;
        driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Logout']")).click();
       driver.close();
       
      
		

	}

}
