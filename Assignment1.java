package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("DemoSalesManager");

		// directly calling the next method - this is best way to use
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("PharmEasy");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gaurav");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Singh");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Baba");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test Engineering");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is test data for entering test field");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gs14sms@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote"))
				.sendKeys("This is an important assignment for selenium");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
