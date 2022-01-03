package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		//setup the driver
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//get the URL
		driver.get("http://leaftaps.com/opentaps/control/main/");
		//maximize the browser
		driver.manage().window().maximize();
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		//Login
		 driver.findElement(By.xpath("//input[@id= 'username']")).sendKeys("DemoSalesManager");
		 driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();
		 
		 //Navigation
		 driver.findElement(By.xpath("//a[contains( text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[contains( text(),'Leads')]")).click();
		 driver.findElement(By.xpath("//a[contains( text(),'Create Lead')]")).click();
		 driver.findElement(By.xpath("//input[@id= 'createLeadForm_companyName']")).sendKeys("AHS");
		 driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstName']")).sendKeys("Mubi");
		 driver.findElement(By.xpath("//input[@id= 'createLeadForm_lastName']")).sendKeys("S");
		 WebElement d = driver.findElement(By.xpath("//select [@id = 'createLeadForm_dataSourceId']"));
		 Select sel = new Select (d);
		 sel.selectByVisibleText("Partner");
		 driver.findElement(By.xpath("//input[@class ='smallSubmit']")).click();
		 	
		 
		 
		 
//		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		 driver.findElement(By.id("password")).sendKeys("crmsfa");
//		 driver.findElement(By.className("decorativeSubmit")).click();
//		 driver.findElement(By.linkText("CRM/SFA")).click();	
//		 driver.findElement(By.linkText("Leads")).click();	
//		 driver.findElement(By.linkText("Create Lead")).click();	
//		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Access");
//		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mubina");
//		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shahul");
//		 WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
//		 Select dropdown = new Select (dd);
//		 dropdown.selectByVisibleText("Other");
//		 driver.findElement(By.className("smallSubmit")).click();
		 

	}

}
