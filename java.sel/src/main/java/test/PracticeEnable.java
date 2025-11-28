package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEnable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/espocrm/");
		Thread.sleep(Duration.ofSeconds(5));
		
		WebElement uname=driver.findElement(By.id("field-userName"));
		uname.sendKeys("admin");
		Thread.sleep(Duration.ofSeconds(3));
		
		WebElement upass=driver.findElement(By.id("field-password"));
		upass.sendKeys("admin");
		Thread.sleep(Duration.ofSeconds(3));
		
		WebElement login=driver.findElement(By.id("btn-login"));
		login.click();
		Thread.sleep(Duration.ofSeconds(5));
		
		WebElement acc= driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div[2]/div[1]/ul/li[3]/a/span[2]"));
//		WebElement acc= driver.findElement(By.id("navbar\\"));
		acc.click();
		Thread.sleep(Duration.ofSeconds(5));
		
		WebElement ch=driver.findElement(By.className("select-all-container"));
		ch.click();
		Thread.sleep(Duration.ofSeconds(5));
		
		
		
	
		
		
	

	}

}
