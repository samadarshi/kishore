package programs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		System.out.println("main starts");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.seleniumhq.org/download/");
	//	driver.findElement(By.xpath("//a[.='Download']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='3.4.0']")).click();
		Thread.sleep(3000);
		Runtime R=Runtime.getRuntime();
		R.exec("C:\\Users\\samad\\Desktop\\Lion.exe");
// Opening selenium-server-standalone-3.4.0.jar
	}

}
