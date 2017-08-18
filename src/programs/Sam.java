package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sam {
static	WebDriver driver;
	static{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
	 driver= new FirefoxDriver();
		System.out.println("main starts");
		//driver.navigate().to("https://www.facebook.com");0
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//Thread.sleep(2000);
	//	driver.findElement(By.id("email")).sendKeys("samadarshi.medar30@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("samadarshi30");
		//driver.findElement(By.id("u_0_r")).click();
		
		System.out.println("main ends");
		
		//
	}

}
