package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement ContinueShop = driver.findElement(By.xpath("//button[text() = 'Continue shopping']"));
		ContinueShop.click();
		Thread.sleep(Duration.ofSeconds(5));
		
		Actions actions = new Actions(driver);
		WebElement freshHov = driver.findElement(By.xpath("//button[@aria-label='Fresh Details']"));
		actions.moveToElement(freshHov).perform();
		Thread.sleep(Duration.ofSeconds(5));
		
		
		WebElement fresh = driver.findElement(By.xpath("//img[@alt='Amazon Fresh']"));
		fresh.click();
		Thread.sleep(Duration.ofSeconds(5));

		
		WebElement skipele = driver.findElement(By.xpath("//button[@data-action='a-popover-close']"));
		skipele.click();
		Thread.sleep(Duration.ofSeconds(5));
		
		WebElement combo = driver.findElement(By.xpath("//span[text()='Combo packs']"));
		actions.scrollToElement(combo).perform();
		Thread.sleep(Duration.ofSeconds(5));
		
		driver.quit();
	}
}
