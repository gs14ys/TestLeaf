package week4.dayOne;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowsScenario {

	public static void main(String[] args) throws Exception {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		/* Scenario1: Click and Confirm new Window Opens */
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		String title = driver.switchTo().window(window.get(1)).getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(window.get(0));

		/* Scenario2: Find the number of opened tabs */
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println("Total number of tabs: " + windowHandles1.size());
		driver.switchTo().window(window.get(0));

		/* Scenario3: Close all windows except Primary */
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> window2 = new ArrayList<String>(windowHandles2);

		driver.switchTo().window(window2.get(1));
		driver.close();
		driver.switchTo().window(window2.get(0));

		/* Scenario4: Wait for 2 new tabs to open */
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> window3 = new ArrayList<String>(windowHandles3);

		Thread.sleep(3000);
		driver.switchTo().window(window3.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(window3.get(0));

	}
}
