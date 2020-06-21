package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.partialLinkText("Alert with T")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("Textbox")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Cemil");
		Thread.sleep(3000);
		alert.accept();

	}

}
