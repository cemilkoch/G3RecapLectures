package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("CancelTab")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		Thread.sleep(3000);
		
		String text1 = driver.findElement(By.id("demo")).getText();
		System.out.println(text1);
		
		//driver.quit();
		

	}

}
