package SeleniumConcepts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_02_NavigationConcept {

	public static void main(String[] args) throws Exception {
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/cemilkoc/Documents/DRIVERS/chromedriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.youtube.com");
		
		Thread.sleep(2000);

		driver.navigate().to("http://www.booking.com");

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().refresh();

		
		driver.quit();

		// GET METHOD
		// Driver get method is used to open a URL and it will wait until the page
		// is loaded fully. WebDriver will wait until the page has fully loaded before
		// returning control to your test

		// NAVIGATE().TO METHOD
		// Driver.navigate().to() method navigates to a URL and it will not wait until
		// the webpage is loaded
		// It keeps browser history and cookies, so we can use forward and backward
		// methods.

	}

}
