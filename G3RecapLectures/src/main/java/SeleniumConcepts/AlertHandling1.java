package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Alerts are pop up boxes that you must interact with them.
		// Alert boxes take your focus away from the current browser.
		// Other parts of the web page can't be accessed until the alert is handled.
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.id("OKTab")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message :: " + text);
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
