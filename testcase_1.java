package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver ch = new ChromeDriver();
		ch.get("http://leaftaps.com/opentaps/control/main/");
		ch.manage().window().maximize();
//		Enter UserName
		ch.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		Enter Password
		ch.findElement(By.id("password")).sendKeys("crmsfa");
//		Click Login
		ch.findElement(By.className("decorativeSubmit")).click();
//		Click CRM/SFA
		ch.findElement(By.linkText("CRM/SFA")).click();
//		Click Contacts tab
		ch.findElement(By.linkText("Contacts")).click();
//		Click Create contact
		ch.findElement(By.linkText("Create Contact")).click();
//		Enter First Name
		ch.findElement(By.id("firstNameField")).sendKeys("Mubina");
//		Enter Last Name
		ch.findElement(By.id("lastNameField")).sendKeys("Shahul");
// Enter the Email
		WebElement email = ch.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("Mubinashahul23@gmail.com");
		
//		Click create contact
		ch.findElement(By.className("smallSubmit")).click();
//		Print the first name and browser title 
		String title = ch.getTitle();
		System.out.println(title);
		WebElement in = ch.findElement(By.id("viewContact_firstName_sp"));
		String txt = in.getText();
		System.out.println(txt);
//		WebElement n = ch.findElement(By.id("viewContact_lastName_sp"));
//		String txt1 = n.getText();
//		System.out.println(txt1 +" "+txt);
	
//		 driver.findElement(By.xpath("//a[contains( text(),'CRM/SFA')]")).click();
			WebElement first = ch.findElement(By.xpath("//span[contains (text(),'First name')]"));
			String field = first.getText();
			System.out.println(field +" :  "+txt);
		
	

//		Close the browser
		ch.close();
	}

}
