package week4.dayOne;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		List<WebElement> listOfPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		String priceOfPhone = listOfPrice.get(1).getText();
		List<WebElement> ratingNumber = driver.findElements(By.xpath("//span[@class='a-size-base s-underline-text']"));
		String rating = ratingNumber.get(1).getText();
		System.out.println("priceOfPhone: " + priceOfPhone + " UserRating: " + rating);

		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));

		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./snaps/mobilePhone.png");
		FileUtils.copyFile(screenshotAs, file);

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		String subTotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		if (subTotal.equalsIgnoreCase(priceOfPhone)) {
			System.out.println("Price Matched!!!!");
		} else {
			System.out.println("Price did not Matched!!!!");

		}

	}
}
