package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		System.out.println("Hello world");
		driver.get("file:///C:/Users/samad/Desktop/samhtml/course.html");
		String title=driver.getTitle();
		System.out.println(title);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
	}
	
	

}
