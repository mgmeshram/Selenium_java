package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SubmitForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/samples/elements.php");
		Thread.sleep(Duration.ofSeconds(3));
		
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("Mrunali");
		Thread.sleep(Duration.ofSeconds(1));
		
		WebElement upass=driver.findElement(By.id("password"));
		upass.sendKeys("Mrunali");
		Thread.sleep(Duration.ofSeconds(1));
		
		//WebElement gender=driver.findElement(By.className(""));
		WebElement female=	driver.findElement(By.id("female"));
		female.click();
		Thread.sleep(Duration.ofSeconds(1));
		
		WebElement sport=driver.findElement(By.id("sports"));
		sport.click();
		
//		WebElement music=driver.findElement(By.id("music"));
//		sport.click();
		
		WebElement c = driver.findElement(By.id("country"));
		Select country= new Select(c);
		country.selectByIndex(1);
		Thread.sleep(Duration.ofSeconds(1));
		
		
		WebElement h=driver.findElement(By.id("skills"));
		Select hobies=new Select(h);
		hobies.selectByIndex(0);
		hobies.selectByVisibleText("Python");
		Thread.sleep(Duration.ofSeconds(3));
		
		WebElement com=driver.findElement(By.id("comments"));
		com.sendKeys("My first form");
		Thread.sleep(Duration.ofSeconds(3));
		
		
		WebElement ch=driver.findElement(By.id("fileUpload"));
		ch.sendKeys("C:\\Users\\cdac\\Desktop\\mrunali.txt");
		Thread.sleep(Duration.ofSeconds(3));
		
		WebElement Dob=driver.findElement(By.id("dob"));
		Dob.sendKeys("13/10/1993");
		Thread.sleep(Duration.ofSeconds(3));
		
		WebElement submit=driver.findElement(By.id("submitBtn"));
		submit.click();
		driver.close();
	}

}
