package programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen {

	public static void main(String[] args) throws InterruptedException, Exception
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	 
	  driver.get("http://localhost:8085/login.do");
	  TakesScreenshot t= (TakesScreenshot) driver;
	  Thread.sleep(2000);
	 File srcFile = t.getScreenshotAs(OutputType.FILE);
	 // System.out.println(V);
	 File destFile=new File("D:/th.png");
	 FileUtils.copyFile(srcFile, destFile);
	  

	}

}
