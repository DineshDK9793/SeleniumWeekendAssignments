package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Dinesh");
		driver.findElement(By.id("lastNameField")).sendKeys("Kanna");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Dinu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("DK");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Working on the Manual Testing and looking for the change in Automation Testing");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("Looking for Automation Testing (Selenium) ... ");
		driver.findElement(By.name("submitButton")).click();
		
		//driver.close();
		
	}
}
