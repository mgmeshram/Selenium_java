package test;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.manage().window().minimize();
//		Thread.sleep(3000);
//		
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		
//		driver.manage().window().fullscreen();
//		Thread.sleep(3000);
//		
//		System.out.println(driver.manage().window().getPosition());
//		System.out.println(driver.manage().window().getSize());
//		
//		Point p= new Point(100,50);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(3000);
//		
//		Dimension D=new Dimension(300,500);
//		driver.manage().window().setSize(D);
//		Thread.sleep(3000);
//		
//		log enteries
		
		Set<String> s=driver.manage().logs().getAvailableLogTypes();
		System.out.println(s);
		System.out.println(driver.manage().logs().get("browser"));
		driver.quit();
		
		
	}

}
