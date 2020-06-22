package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_10_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.linkedin.com/login");
		
		// CSS SELECTOR
		// #id
		// classNames (.)
		// tag[attribute='value']
		// tag[attribute='value'][attribute='value']
		
		//WebElement username = driver.findElement(By.cssSelector("input[aria-label='Email or Phone']"));
		WebElement username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("cemil@sample.com");
		
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("123@test!");
		
		WebElement signInButton = driver.findElement(By.cssSelector(".btn__primary--large"));
		signInButton.click();

		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
