package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
		// * 2. Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//			Enter Password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
//			Click Login
			driver.findElement(By.className("decorativeSubmit")).click();
//			Click CRM/SFA
			driver.findElement(By.linkText("CRM/SFA")).click();
//			Click Contacts tab
			driver.findElement(By.linkText("Contacts")).click();
//			Click Create contact
			driver.findElement(By.linkText("Create Contact")).click();
//			 
		 //* 7. Enter FirstName Field Using id Locator
			driver.findElement(By.id("firstNameField")).sendKeys("Mubina");		  
		 //* 8. Enter LastName Field Using id Locator
			driver.findElement(By.id("lastNameField")).sendKeys("Shahul");
		 //* 9. Enter FirstName(Local) Field Using id Locator
		  driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mubin");
		 //* 10. Enter LastName(Local) Field Using id Locator
		  driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("shahul");
		 //* 11. Enter Department Field Using any Locator of Your Choice
		  driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software");
		 //* 12. Enter Description Field Using any Locator of your choice 
		  driver.findElement(By.id("createContactForm_description")).sendKeys("IT");
		 //* 13. Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Mubinashahul23@gmail.com");
		 //* 14. Select State/Province as NewYork Using Visible Text
		  WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select drop1 = new Select(element);
		 drop1.selectByVisibleText("New York");
		  // * 15. Click on Create Contact
		  driver.findElement(By.className("smallSubmit")).click();
		 //* 16. Click on edit button 
		  driver.findElement(By.linkText("Edit")).click();
		 // * 17. Clear the Description Field using .clear
		  WebElement description = driver.findElement(By.id("updateContactForm_description"));
		  description.clear();
		  //* 18. Fill ImportantNote Field with Any text
		  driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("IT");
		 // * 19. Click on update button using Xpath locator
		  driver.findElement(By.xpath("//input[@type ='submit' and @value='Update']")).click();
		 // * 20. Get the Title of Resulting Page.
		  String title = driver.getTitle();
		  System.out.println(title);
		


	}

}
