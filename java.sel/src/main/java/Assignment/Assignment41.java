package Assignment;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment41 {

	public static void main(String[] args) throws InterruptedException {
		int count=0;
		int visibleLinks=0;
		int invisibleLinks=0;
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(5));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			count++;
		}
		System.out.println("Total Count: "+count);
		
		for(WebElement link:links) {
			if(link.isDisplayed()) {
				visibleLinks++;
			}
			else {
				invisibleLinks++;
			}
			
		}
		System.out.println("visibleLinks:"+visibleLinks);
		System.out.println("invisibleLinks:"+invisibleLinks);
		driver.close();

	}

}
