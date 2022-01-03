package seleniumproject;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {

	public static void main(String[] args) {
		//setup the driver
				WebDriverManager.chromedriver().setup();
				//launch the browser
				ChromeDriver driver = new ChromeDriver();
				//get the URL
				driver.get("http://leaftaps.com/opentaps/control/main/");
				//maximi
			
	}

}
