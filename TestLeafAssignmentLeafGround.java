package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafAssignmentLeafGround {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Gaurav Singh");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("AppendingNewName");
		WebElement findElement = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']"));
		if (findElement.isEnabled() == false) {
			System.out.println("Disabled - Verify if text box is disabled button");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		String text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("gs14sms@gmail.com", Keys.TAB);
		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='grid formgrid']//textarea"));
		System.out.println("Was the elemet selected: " + findElement2.isSelected());
		driver.findElement(By.xpath("//div[@class='grid formgrid']//textarea")).sendKeys("Mystry kills");
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("I have edited the text!!!");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys("", Keys.ENTER);
		Thread.sleep(2000);

		System.out.println(
				driver.findElement(By.xpath("//span[@id='j_idt106:thisform:j_idt110_error-detail']")).getText());
		Point location = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		System.out.println("current location: " + location);
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		location = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		System.out.println("new location: " + location);

		driver.findElement(By.xpath("//div[@class='ui-autocomplete ui-autocomplete-multiple']/ul")).click();
		WebElement findElement3 = driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Gaurav Singh';", findElement3);

		driver.findElement(By.xpath(
				"//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']"))
				.click();
		driver.findElement(By.xpath(
				"//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']"))
				.click();
		System.out.println(driver.findElement(By.xpath(
				"//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']"))
				.isDisplayed());
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']//div[@class='ql-editor ql-blank']"))
				.sendKeys("THis is customized data set");

		driver.close();
	}
}
