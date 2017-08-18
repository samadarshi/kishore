//file download popup

package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Filedownloadpopup {

	public static void main(String[] args) throws InterruptedException {
		
		// browser. helperApps. neverAsk. saveToDisk
		FirefoxProfile profile= new FirefoxProfile();
		String key = "browser.helperApps.neverAsk.saveToDisk";
		String value = "application/jar";
		//,"application/zip";
		profile.setPreference(key, value);
		
		System.out.println("main starts");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.xpath("//a[.='Download']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='3.4.0']")).click();
	}

}
