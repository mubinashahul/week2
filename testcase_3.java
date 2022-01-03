package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase_3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver ch = new ChromeDriver();
		ch.get("http://leaftaps.com/opentaps/control/login");
		ch.manage().window().maximize();
//		Enter UserName
		ch.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		Enter Password
		ch.findElement(By.id("password")).sendKeys("crmsfa");
//		Click Login
		ch.findElement(By.className("decorativeSubmit")).click();
//		Click CRM/SFA
		ch.findElement(By.linkText("CRM/SFA")).click();
//		Click Leads tab
		ch.findElement(By.linkText("Leads")).click();
//		Click create lead tab
		ch.findElement(By.linkText("Create Lead")).click();
//			 7. Enter all the fields in CreateLead page
//      company name, first name , ln, currency, ownership  
		ch.findElement(By.id("createLeadForm_companyName")).sendKeys("AHS");
		ch.findElement(By.id("createLeadForm_firstName")).sendKeys("Mubina");
		ch.findElement(By.id("createLeadForm_lastName")).sendKeys("Shahul");
		ch.findElement(By.id("createLeadForm_birthDate")).sendKeys("5/23/99");
		WebElement d = ch.findElement(By.id("createLeadForm_currencyUomId"));
		Select cur = new Select(d);
		cur.selectByVisibleText("INR - Indian Rupee");
		WebElement d1 = ch.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own = new Select (d1);
		own.selectByIndex(2);
//		own.selectByValue("");)
			
		//		 Enter all the fields in contact information   
//		phone, mail id
		ch.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9025242755");
		ch.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Mubinashahul23@gmail.com");
		
//	   	 Enter all the fields in primary address	
		// address1, address2, city,state, zipcode
		ch.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("TH Road");
		ch.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("New Washermenpet");
		ch.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		ch.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600081");
//		WebElement drop = ch.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
//		Select state = new Select(drop);
//		state.selectByValue("IN-TN");
//		
		WebElement drop1 = ch.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select county = new Select(drop1);
		county.selectByVisibleText("India");
		
//		 Get the Firstname and print it
		System.out.println("The First Name is "+ch.findElement(By.id("createLeadForm_firstName")).getAttribute("value"));
		System.out.println("The last Name is "+ch.findElement(By.id("createLeadForm_lastName")).getAttribute("value"));

		//		 Click on create Lead Button	
		ch.findElement(By.className("smallSubmit")).click();
		
//		 Get and Verify the Title of the resulting Page(View Lead)

		System.out.println("The Title is " +  ch.getTitle());
		if (ch.getTitle().contains("View")) {
			System.out.println("Matched");
		}
		else
		{
			System.out.println("not matched");
		}
//		ch.findElement(By.linkText("My Home")).click();
		ch.close();
	}

}
