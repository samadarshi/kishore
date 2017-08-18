package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.name("identifier")).sendKeys("samadarshi.medar30");
		
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[3]")).click();
		
        driver.findElement(By.xpath("")).sendKeys("usawait4me");
		

	}

}
