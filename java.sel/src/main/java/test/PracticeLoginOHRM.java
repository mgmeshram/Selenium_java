package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLoginOHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(Duration.ofSeconds(5));
		
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys("Admin");
		
		WebElement upass=driver.findElement(By.name("password"));
		upass.sendKeys("admin123");
		
		WebElement button=driver.findElement(By.className("orangehrm-login-button"));
		button.click();
		Thread.sleep(Duration.ofSeconds(5));

	}

}
