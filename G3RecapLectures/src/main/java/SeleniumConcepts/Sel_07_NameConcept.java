package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_07_NameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.linkedin.com/login");
		
		// 1
//		WebElement username = driver.findElement(By.name("session_key"));
//		username.sendKeys("cemil@sample.com");
//		
//		WebElement password = driver.findElement(By.name("session_password"));
//		password.sendKeys("1234@sample!");
//		
//		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
//		signInButton.click();

		// 2
		//driver.findElement(By.name("session_key")).sendKeys("cemil@sample.com");
		
		// 3
		By username = By.name("session_key");
		WebElement userName = driver.findElement(username);
		userName.sendKeys("cemil@sample.com");
		
		// 4
		ElementUtil.getElement(driver, username).sendKeys("cemil@sample.com");
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
