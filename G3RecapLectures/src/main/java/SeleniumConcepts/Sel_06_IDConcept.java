package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_06_IDConcept {

	public static void main(String[] args) throws InterruptedException {
		
		// ID' s are unique for each element so it is very common way to locate elements
		// using ID locator.
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
//		// FIRST USAGE
//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("cemil@sample.com");
//		
//		Thread.sleep(2000);
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("1234@test");
//		
//		Thread.sleep(2000);
		
		//btn__primary--large from__button--floating
		//WebElement signInButton = driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
//		WebElement signInButton = driver.findElement(By.className("from__button--floating"));
//		signInButton.click();
		
		
		// SECOND USAGE
		//driver.findElement(By.id("username")).sendKeys("cemil@sample.com");
		
		// THIRD USAGE
		By username = By.id("username");
//		WebElement usernameElement = driver.findElement(username);
//		usernameElement.sendKeys("cemil@sample.com");
		
		// FOURTH USAGE
		//ElementUtil.getElement(driver, username).sendKeys("cemil@sample.com");
		
		ElementUtil.sendKeys(driver, username, "cemil@sample.com");
		
		

	}

}
