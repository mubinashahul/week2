package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase_2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://leaftaps.com/opentaps/control/main/");
		cd.manage().window().maximize();
		cd.findElement(By.id("username")).sendKeys("DemoSalesManager");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Contacts")).click();
		cd.findElement(By.linkText("Find Contacts")).click();
		cd.findElement(By.linkText("Email")).click();
		cd.findElement(By.name("emailAddress")).sendKeys("Mubinashahul23@gmail.com");
		
//		cd.findElement(By.partialLinkText("Find Contacts")).click();
		cd.findElement(By.tagName("button")).click();
//		cd.findElement(By.className("x-btn-text")).click();

		
		//		cd.findElement(By.xpath("//button[@class='x-btn-text' and contains(text(),'Find Contacts')]")).click();
//		cd.close();
		
//		cd.findElement(By.linkText("Email")).click();
//		cd.findElement(By.id("ext-gen219")).click();		
//		cd.findElement(By.className("x-btn-text")).click();
//		WebElement button = cd.findElement(By.className("x-btn-text"));
//		button.click();
//		cd.close();
		
//		WebElement butt = cd.findElement(By.xpath("//button[@class='x-btn-text'and contains(text(),'Find Contacts']"));
//		butt.click();
	}

}
