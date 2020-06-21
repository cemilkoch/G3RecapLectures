package SeleniumConcepts;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "/Users/cemilkoc/Documents/DRIVERS/chromedriver");
		// SetProperty method enables to set properties for the desired browser
		// 2 attributes : "Driver", "Driver's path"

		// Setting up the browser
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		// Get Title
		String title = driver.getTitle();
		System.out.println("Title is :: " + title);
		
		// Verify Title
		if (title.equals("My Store")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		
		System.out.println();
		
		// Get Current URL
		String url = driver.getCurrentUrl();
		System.out.println("URL is :: " + url);
		
		// Verify URL
		if (url.equals("http://automationpractice.com/index.php")) {
			System.out.println("Correct URL");
		}else {
			System.out.println("Incorrect URL");
		}
		
		Thread.sleep(3000);
		//driver.close(); // Closes the current browser
		driver.close();	// Closes all the browser instances
		//FirefoxDriver driver = new FirefoxDriver();
		
		
		
		
	}

}
