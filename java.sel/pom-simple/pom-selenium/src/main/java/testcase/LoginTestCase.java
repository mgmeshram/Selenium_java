package testcase;

import org.openqa.selenium.WebDriver;

import page.LoginPage;

public class LoginTestCase {

	private LoginPage login;
	public LoginTestCase(WebDriver driver) {
		login = new LoginPage(driver);
	}
	
	public void validLogin() {
		login.login("admin", "admin");
	}
	
	public void invalidLogin() {
		login.login("admin123S", "admin");	
	}
}
