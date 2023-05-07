package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebook {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);
		
		driver.get("https://en-gb.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Dinesh");
		driver.findElement(By.name("lastname")).sendKeys("DK");
		driver.findElement(By.name("reg_email__")).sendKeys("9789024448");
		driver.findElement(By.id("password_step_input")).sendKeys("Test");
		
		WebElement day = driver.findElement(By.id("day"));
		Select selDay = new Select(day);
		selDay.selectByVisibleText("9");
		
		WebElement month = driver.findElement(By.id("month"));
		Select selMonth = new Select(month);
		selMonth.selectByVisibleText("Jul");
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select selYear = new Select(year);
		selYear.selectByVisibleText("1993");
		
		driver.findElement(By.name("sex")).click();
		driver.close();
		
	}
}
