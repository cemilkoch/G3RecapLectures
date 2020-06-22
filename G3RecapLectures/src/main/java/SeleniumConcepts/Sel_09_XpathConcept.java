package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_09_XpathConcept {

	public static void main(String[] args) throws InterruptedException {
		
		// Xpath is designed to allow the navigation of XML documents.
		// / absolute Xpath from the beginning of HTML node
		// // relative Xpath any node of the HTML document
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.linkedin.com/login");
		
//		WebElement userName = driver.findElement(By.xpath("//input[@aria-label='Email or Phone']"));
//		userName.sendKeys("cemil@sample.com");
//		
//		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
//		password.sendKeys("1234@test!");
//		
//		WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(),'Sign')]"));
//		signInButton.click();
		
		By username = By.xpath("//input[@aria-label='Email or Phone']");
		By password = By.xpath("//input[@aria-label='Password']");
		
		ElementUtil.getElement(driver, username).sendKeys("cemil@sample.com");
		ElementUtil.getElement(driver, password).sendKeys("123@test!");
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
