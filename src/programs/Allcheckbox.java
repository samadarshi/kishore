package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allcheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/samad/Desktop/samhtml/exp.html");
		String s1="//input[@type='checkbox']";
		List<WebElement> allcb = driver.findElements(By.xpath(s1));
		
	
		
	/*	for (WebElement cb : allcb) 
		{
			cb.click();
			Thread.sleep(1000);
		}*/
		
		/*for(int i=allcb.size()-1;i>=0;i--)
		{
			allcb.get(i).click();

	    }*/
		
		/*for (WebElement cb : allcb) 
		{
			cb.click();
			Thread.sleep(3000);
		}*/
		
		
		for(int i=0;i<15;i++)
		{
			if(i==0 || i==14)
			{
				allcb.get(i).click();
				Thread.sleep(1000);
			}
			
		}

}
}