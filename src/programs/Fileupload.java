//file upload popup
package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {

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
		driver.findElement(By.xpath("//div[@class='popup_menu_icon warning_icon']")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.xpath(" //input[@value='2']")).click();
		
	
		
		driver.findElement(By.xpath("(//input[@class='inputChooseFile'])[1]")).sendKeys("C:\\Users\\samad\\Desktop\\pics\\wonder_woman_gal_gadot_hd-HD.jpg");
		
		driver.findElement(By.xpath("//div[@id='FormModifiedDivButton']")).click();
		String s1 ="actiTIME - Logo & Color Scheme";
		String s2=driver.getTitle();
		if (s1.equals(s2)) 
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case fail");
		}
	     System.out.println(s1);
	}
	

}
