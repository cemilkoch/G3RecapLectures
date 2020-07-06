package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sel_15_DropDown_2 {

	static WebDriver driver;
	static WebElement element;
	static By dropDown = By.id("testingDropdown");
	static String url = "https://www.testandquiz.com/selenium/testing.html";
	static List<WebElement> options;

	public static void main(String[] args) {

		driver = ElementUtil.launchBrowser(driver, "chrome");

		ElementUtil.launchURL(driver, url);

		element = ElementUtil.getElement(driver, dropDown);
		
//		Select select = new Select(element);
//		options = select.getOptions();
//		
//		for (int i = 0; i < options.size(); i++) {
//			System.out.println(options.get(i).getText());
//		}
		
		getAllOptions(element);

	}
	
	static void getAllOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
	}

}
