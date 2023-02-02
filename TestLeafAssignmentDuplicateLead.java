package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafAssignmentDuplicateLead {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement((By.partialLinkText("CRM/SFA"))).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[@class='x-tab-strip-text '][contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']"))
				.sendKeys("yuvaraj@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"))
				.getText();
		System.out.println(text);
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a[@class='linktext'])[1]"))
				.click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']")).getText();
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		driver.close();

	}
}
