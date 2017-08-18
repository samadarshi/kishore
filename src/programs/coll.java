package programs;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class coll {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/samad/Desktop/samhtml/dropdown.html");
		WebElement option = driver.findElement(By.name("sel2"));

		Select s=new Select(option);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
	
		List<WebElement> text2 = s.getOptions();
		System.out.println(text2 );

	TreeSet<String> l= new TreeSet<String>();
		
		for (WebElement elet : text2) {
	    String t = elet.getText();
	    l.add(t);
			System.out.println(t);
			System.out.println(l);
		}
		
		
		

	
	}

}
