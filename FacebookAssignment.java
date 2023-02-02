package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gaurav");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8828168144");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("qwer1234");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

		Select selectDropDown = new Select(day);
		selectDropDown.selectByValue("14");

		Select selectDropDown1 = new Select(month);
		selectDropDown1.selectByValue("9");

		Select selectDropDown2 = new Select(year);
		selectDropDown2.selectByValue("1991");

		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.close();

	}
}
