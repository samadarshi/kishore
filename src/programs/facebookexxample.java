package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookexxample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		int count=alllinks.size();
		System.out.println(count);
		WebElement v = null;
		for(int i=0;i<count;i++)
		{
		 v = alllinks.get(i);
		
	String s = v.getText();
	System.out.println(s);
	}

	}

}
