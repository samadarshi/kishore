package programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddendivpopup {


	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main starts");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8085/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("(//a)[1]")).click();
		Thread.sleep(3000);
		String xp = "//td[@class='x-btn-center']";
		driver.findElement(By.xpath(xp)).click();
    	Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.=28])[2]")).click();
	     Thread.sleep(2000);
		//ale.dismiss();
		
		System.out.println("Hidden div popup handled");
		driver.close();
		
		


}

}
