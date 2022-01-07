package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		//8	Click on Phone
		driver.findElement(By.linkText("Phone")).click();
		//9	Enter phone number
		driver.findElement(By.xpath("//input [@name='phoneNumber']")).sendKeys("9025242755");
		//10	Click find leads button
		driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		//11	Capture lead ID of First Resulting lead
		Thread.sleep(300);
		WebElement leadid = driver.findElement(By.xpath("//div [@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		String id = leadid.getText();
		System.out.println("Lead ID " + id);
		//Thread.sleep(300);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("//div [@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		//13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
		//14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//15	Enter captured lead ID
		driver.findElement(By.xpath("//input [@type='text' and @name='id']")).sendKeys(id);
		//16	Click find leads button
		driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		Thread.sleep(300);
		String msg = driver.findElement(By.className("x-paging-info")).getText();
		//System.out.println(msg);
		if(msg.equals("No records to display")) {
			System.out.println(msg+" is Text Matched");
		}
		else {
			System.out.println(msg+" is Not matched");
		}
		//18	Close the browser (Do not log out)
		driver.close();
		
	}

}
