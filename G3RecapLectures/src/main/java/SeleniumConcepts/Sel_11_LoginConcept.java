package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_11_LoginConcept {
	
	static WebDriver driver;
	//btn__primary--large from__button--floating
	static By username = By.id("username");
	static By password = By.id("password");
	static By signInButton = By.className("btn__primary--large");

	public static void main(String[] args) {
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		String url = "https://www.linkedin.com/login";
		
		ElementUtil.launchURL(driver, url);
		
		ElementUtil.sendKeys(driver, username, "cemil@sample.com");
		ElementUtil.sendKeys(driver, password, "123@test!");
		ElementUtil.getElement(driver, signInButton).click();
		
		String text = driver.findElement(By.id("error-for-username")).getText();
		System.out.println(text);

	}

}
