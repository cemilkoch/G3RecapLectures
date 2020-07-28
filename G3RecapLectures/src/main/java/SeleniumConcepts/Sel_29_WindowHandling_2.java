package SeleniumConcepts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_29_WindowHandling_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.findElement(By.id("newTabBtn")).click();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		Thread.sleep(2000);

		// Switch to newly opened tab
		driver.switchTo().window(tabs.get(1));

		driver.findElement(By.id("firstName")).sendKeys("Cemil");

		System.out.println("Tab's title : " + driver.getTitle());

		driver.close();

		// Switch back to main old tab
		driver.switchTo().window(tabs.get(0));

		System.out.println("Old Tab's title : " + driver.getTitle());

		driver.quit();

	}

}
