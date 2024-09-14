package pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pomclass.LoginPage;

public class PageObjectManager {

	public WebDriver driver;

	// Declare the object page as aprivate
	// Generate the getters
	// // Create constructor to initialize the webdriver and elements by using
	// pagefactory

	private LoginPage login;

	public LoginPage getLogin() {
		login = new LoginPage(driver);
		return login;
	}

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}
