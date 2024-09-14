package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch(String browser) {

		// CHROME Chrome ChrOme

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void sendValues(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static void quitBrowser() {

		driver.quit();
	}

	public static void navigateMethods(String method) {
		
		if (method.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (method.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (method.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	public static void navigateUrl(String url) {
		
		driver.navigate().to(url);
	}
}
