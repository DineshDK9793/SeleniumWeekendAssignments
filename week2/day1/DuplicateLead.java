package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant Techonology Solutions (CTS)");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kanna");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dinu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("DK");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Manual and Automation Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dinesh.july9@gmail.com");
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selState = new Select(stateDropdown);
		selState.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Create Lead : "+driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		WebElement compName = driver.findElement(By.id("createLeadForm_companyName"));
		compName.clear();
		compName.sendKeys("CTS");
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("Dinesh Kanna");
		
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.clear();
		lastName.sendKeys("G");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Duplicate Lead : "+driver.getTitle());
		driver.close();
	}
}
