package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("samadarshi.medar30@gmail.com");
		
		driver.findElement(By.className("CwaK9")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("wrong");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		String expmsg="Wrong password. Try again.";
		
		Thread.sleep(4000);
		WebElement a = driver.findElement(By.xpath("(//div[contains(.,'again')])[12]"));
		
		 String actmsg = a.getText();
		 
		 System.out.println("actual msg is "+actmsg);
		 System.out.println("expect msg is "+expmsg);
		 
		 if (actmsg.equals(expmsg)) 
		 {
			 System.out.println("verification pass");
			
		} 
		 else 
		 {
              System.out.println("fail");
		}
		 
		driver.close();
		

	}

}
