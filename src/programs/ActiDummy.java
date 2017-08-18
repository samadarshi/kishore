package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiDummy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost:8085/login.do;jsessionid=gu4hjbj7p7ov");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='textField'])[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("danager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		driver.close();
		
		

	}

}
