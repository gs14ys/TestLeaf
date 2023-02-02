package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafAssignmentContact {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement((By.partialLinkText("CRM/SFA"))).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Gaurav");
		driver.findElement(By.id("lastNameField")).sendKeys("Singh");
		driver.findElement(By.id("lastNameField")).sendKeys("Singh");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("max");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Payne");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Test Engineer");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is my place to automate!!!");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("gs14sms@gmail.com");
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select selectDropdownForState = new Select(findElement);
		selectDropdownForState.selectByVisibleText("Connecticut");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is my place to automate!!!");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		System.out.println("Finished!!!!");
		driver.close();

	}
}
