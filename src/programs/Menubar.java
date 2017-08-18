package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Menubar {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.actimind.com/");
	
		WebElement menu = driver.findElement(By.xpath("//span[.='Showroom']"));
			Actions act = new Actions(driver);
           act.moveToElement(menu).perform();
          WebElement v = driver.findElement(By.xpath("(//a[@href='showroom-actitime-mobile.html'])[2]"));
			v.click();
	}

}
