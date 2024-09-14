package com.stepdefinition;

import java.util.List;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectmanager.PageObjectManager;
import pomclass.LoginPage;

public class StepDefinition extends BaseClass {

//	public static WebDriver driver;

//	public static LoginPage log;
	public static PageObjectManager pom;
	private static final Logger logger = LogManager.getLogger(StepDefinition.class);

	@Given("^user Launch The Url Of The Adactin Application$")
	public void user_Launch_The_Url_Of_The_Adactin_Application() throws Throwable {

		// driver.get("https://adactinhotelapp.com/");
		
		logger.info("Navigate to the homepage");

		launchUrl("https://adactinhotelapp.com/");
	}

//	@When("^user Enter The Username In The Respective Field$")
//	public void user_Enter_The_Username_In_The_Respective_Field() throws Throwable {
//	    
//		driver.findElement(By.id("username")).sendKeys("heama1892");
//		
//	}
//
//	@When("^user Enter The Password In The Respective Field$")
//	public void user_Enter_The_Password_In_The_Respective_Field() throws Throwable {
//	   
//		driver.findElement(By.id("password")).sendKeys("123456");
//	}

	// Scenario

//	@When("^user Enter The Username \"([^\"]*)\"In The Respective Field$")
//	public void user_Enter_The_Username_In_The_Respective_Field(String username) throws Throwable {
//		driver.findElement(By.id("username")).sendKeys(username);
//	}
//
//	@When("^user Enter The Password \"([^\"]*)\" In The Respective Field$")
//	public void user_Enter_The_Password_In_The_Respective_Field(String password) throws Throwable {
//		driver.findElement(By.id("password")).sendKeys(password);
//	}

	// Scenario Outline

//	@When("^user Enter The Username \"([^\"]*)\"In The Respective Field$")
//	public void user_Enter_The_Username_In_The_Respective_Field(String username) throws Throwable {
//		driver.findElement(By.id("username")).sendKeys(username);
//	}
//
//	@When("^user Enter The Password \"([^\"]*)\" In The Respective Field$")
//	public void user_Enter_The_Password_In_The_Respective_Field(String password) throws Throwable {
//		driver.findElement(By.id("password")).sendKeys(password);
//	}

	@When("^user Enter The Following Credentials In The Respective Field$")
	public void user_Enter_The_Following_Credentials_In_The_Respective_Field(DataTable dataTable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		logger.info("Entering Username and Password");

		List<Map<String, String>> asMaps = dataTable.asMaps(String.class, String.class);

		String username = asMaps.get(0).get("Username");
		String password = asMaps.get(0).get("Password");
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);

		// log = new LoginPage(driver);
		pom = new PageObjectManager(driver);

		sendValues(pom.getLogin().getUsername(), username);
		sendValues(pom.getLogin().getPassword(), password);
	}

	@Then("^user Clicks The Loginbutton and Its Navigates The Search hotel Page$")
	public void user_Clicks_The_Loginbutton_and_Its_Navigates_The_Search_hotel_Page() throws Throwable {

//		driver.findElement(By.id("login")).click();
//		driver.quit();
		
		logger.info("Clicking the login button");

		clickOnElement(pom.getLogin().getLoginbutton());

	}

}
