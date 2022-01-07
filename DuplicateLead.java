package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws Throwable {
		//http://leaftaps.com/opentaps/control/main
		 
		//1	Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//2	Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//8	Click on Email
		driver.findElement(By.linkText("Email")).click();
		//9	Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("peterparker@gmail.com");
		//10	Click find leads button
		driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		//11	Capture name of First Resulting lead
		Thread.sleep(300);
		WebElement leadid = driver.findElement(By.xpath("//div [@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		String id = leadid.getText();
		System.out.println("Lead ID " + id);
		//Thread.sleep(300);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("//div [@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Captured company name is " + companyName);
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Captured first name is " + firstName);

		//13	Click Duplicate Lead
		driver.findElement(By.xpath("//a [text()='Duplicate Lead']")).click();
		//14	Verify the title as 'Duplicate Lead'
		if(driver.getTitle().contains("Duplicate Lead")) {
			System.out.println(driver.getTitle()+" is Matched");
		}
		else {
			System.out.println(driver.getTitle()+"is not matched");
		}
		
		//15	Click Create Lead
		driver.findElement(By.className("smallSubmit")).click();
		//16	Confirm the duplicated lead name is same as captured name
		String firstNameCopy = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Captured first name copy is " + firstNameCopy);
		
		String companyNameCopy = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Captured Duplicate company name is " + companyNameCopy);
		
		if(firstName.equals(firstNameCopy)) {
			System.out.println("Name verified, matching " + firstName + " and " + firstNameCopy);
		}
		else {
			System.out.println("Name verified, not matching" + firstName + " and " + firstNameCopy);
		}
	
		if(companyName.equals(companyNameCopy)) {
			System.out.println("Company Name verified " + companyName + " and " + companyNameCopy + " is matching");
		}
		else {
			System.out.println("Company Name verified " + companyName + " and " + companyNameCopy + " is not matching");
		}
			
		driver.close();
		}
}