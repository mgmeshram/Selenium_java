package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverGetANavigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Current Url is: "+driver.getCurrentUrl());
		driver.quit();
//		System.out.println("Current Url is: "+driver.getCurrentUrl());
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.com/");
		System.out.println(driver1.getPageSource());
		System.out.println("Page title: "+driver1.getTitle());
		driver1.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(3000);
		driver1.navigate().back();
		Thread.sleep(3000);
		driver1.navigate().forward();
		Thread.sleep(3000);
		driver1.navigate().refresh();
		Thread.sleep(3000);
		driver1.quit();
	
	}

}
