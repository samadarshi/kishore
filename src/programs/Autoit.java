package programs;

import java.io.IOException;

public class Autoit {

	public static void main(String[] args) throws IOException {
		System.out.println("main starts");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver-v0.17.0-win64/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.get("");
		
		Runtime r=  Runtime.getRuntime();
		r.exec("C:\\Users\\samad\\Documents\\tiger.exe");

	}

}
