package pom;

import org.openqa.selenium.WebDriver;

import pom.LoginPage;

public class LoginTestCase {

	private LoginPage login;
	public LoginTestCase(WebDriver driver) {
		login = new LoginPage(driver);
	}
	
	public void validLogin() {
		try{login.login("admin", "admin");
		login.logout();
		System.out.println("succesfull login");
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
			
		}
	}
	
	public void invalidLogin() {
		try {
			login.login("admin123", "admin");
			System.out.println("uncessfull login ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
