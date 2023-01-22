package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Michael");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Wordroff");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Fredrick");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Cricketer");
		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("There is a test match at Sharajah between India and Pakistan");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gs14sms@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());

		driver.findElement(By.partialLinkText("Duplicate")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Ranji-Maharashtra");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jackie");
		driver.findElement(By.className("smallSubmit")).click();

		System.out.println(driver.getTitle());

	}
}
