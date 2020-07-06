package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sel_16_DropDown_3 {

	static WebDriver driver;
	static WebElement element;
	static By dropDown = By.id("testingDropdown");
	static String url = "https://www.testandquiz.com/selenium/testing.html";
	
	public static void main(String[] args) {

		driver = ElementUtil.launchBrowser(driver, "chrome");

		ElementUtil.launchURL(driver, url);

		element = ElementUtil.getElement(driver, dropDown);
		
		Select select = new Select(element);
		boolean status = select.isMultiple();
		System.out.println(status);
		
	}
	
}
