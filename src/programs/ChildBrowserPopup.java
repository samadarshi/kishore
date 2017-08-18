//child browser popup

package programs;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopup
{

	public static void main(String[] args)
	{
		System.out.println("main starts");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Set<String> ha = driver.getWindowHandles();
		System.out.println(driver.getTitle());;

		for (String str : ha) {
			driver.switchTo().window(str);
	//		System.out.println(driver.getTitle());;
         
			if(driver.getTitle().equals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"))
			{
				driver.close();
			}
		}
	}

}
