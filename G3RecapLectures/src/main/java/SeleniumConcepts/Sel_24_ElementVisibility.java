package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_24_ElementVisibility {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
		By signIn = By.xpath("//button[@class='btn__primary--large from__button--floating']");
		
		WebElement element = driver.findElement(signIn);
		
		// isDisplayed() method is used to verify the presence of an element within the web page
		boolean display = element.isDisplayed();
		System.out.println("Element displayed is : " + display);
		
		// isEnabled() method is used to verify if the web element is enabled or 
		// disabled within the webpage
		boolean enabled = element.isEnabled();
		System.out.println("Element enabled is : " + enabled);
		
		driver.quit();
		
		
		
		

	}

}
