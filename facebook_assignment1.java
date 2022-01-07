package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_assignment1 {

	public static void main(String[] args) {
		
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://www.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		System.out.println("Current URL is : "+ driver.getCurrentUrl());
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				// Step 6: Click on Create New Account button
//		 driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Mubina");
//		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("Shahul");
//		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']")).sendKeys("9025242755");
// Step 10: Enterthe password
		driver.findElement(By.xpath("//input [@type='password' and @aria-label='New password']")).sendKeys("Mubi");	
//		
		// Step 11: Handle all the three drop downs
		WebElement dropdown1 = driver.findElement(By.xpath("//select [@name='birthday_day' and @id='day']"));
		Select d = new Select(dropdown1);
		d.selectByVisibleText("23");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select [@name='birthday_month' and @id='month']"));
		Select m = new Select(dropdown2);
		m.selectByValue("5");
		
		WebElement dropdown3 = driver.findElement(By.xpath("//select [@name='birthday_year' and @id='year']"));
		Select yy = new Select(dropdown3);
		yy.selectByVisibleText("1999");
		
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//input [@type='radio' and @value='1']")).click();
		
		//		 A normal click will do for this step) 
	}

}
