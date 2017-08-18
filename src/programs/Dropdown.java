package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/samad/Desktop/samhtml/dropdown.html");
		WebElement option = driver.findElement(By.name("sel2"));

		Select s=new Select(option);
	//	s.selectByValue("c");
//		s.selectByVisibleText("c");
	//	Thread.sleep(2000);
	//	s.selectByVisibleText("java");
//		Thread.sleep(2000);
  //  	s.selectByVisibleText("manual testing");
//		Thread.sleep(2000);
//		s.selectByVisibleText("selenium");
  //  	s.selectByValue("b");
		
	/*	for (int i = 0; i <= 3; i++) {
			s.selectByIndex(i);
			Thread.sleep(2000);
		}*/
//		 
	
		s.selectByIndex(0);
		//Thread.sleep(2000);
		s.selectByIndex(1);
		//Thread.sleep(2000);
	s.selectByIndex(2);
	//	Thread.sleep(2000);
		s.selectByIndex(3);	
		
	//	s.deselectByVisibleText("java");
	//	s.deselectByValue("b");
//		for(int i=0;i<4;i++){
//		 if(i%2==1){
//			s.deselectByIndex(i);
//		 }
//		}
	//	s.deselectByIndex(2);

//WebElement text1 = s.getFirstSelectedOption();	
//System.out.println(text1.getText());

List<WebElement> text2 = s.getAllSelectedOptions();
ArrayList<String> ele= new ArrayList<String>();
Collections.sort(ele);
for (WebElement f : text2)
{
	System.out.println(f.getText());
	
	
}
System.out.println( text2.size());

for (int i = 0; i < text2.size(); i++) {
	String qwe = text2.get(i).getText();
	
	System.out.println(qwe);
boolean boo = s.isMultiple();
System.out.println(boo);
	
}
	}

}
