package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.xpath("//input[(@id ='username')]")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[(@id ='password')]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Mischief");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Stray");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Man");

		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(findElement);
		select.selectByValue("LEAD_CONFERENCE");

		/* for each */
		List<WebElement> options = select.getOptions();
		for (WebElement webelement : options) {
			System.out.println(webelement.getText());

		}
		/* for */
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String str = webElement.getText();
			System.out.println(str);

		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}

}
