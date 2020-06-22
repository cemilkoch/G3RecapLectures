package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_08_LinkConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.linkedin.com/login");
		
		Thread.sleep(3000);
		
//		By forgotPassword = By.linkText("Forgot password?");
		By joinNow = By.partialLinkText("Join n");
		
		ElementUtil.getElement(driver, joinNow).click();
		
		

	}

}
