package SeleniumConcepts;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sel_17_DropDownWithoutSelect {

	
	static WebDriver driver;
	static WebElement element;
	static By selectDropDown = By.xpath("//select[@id='testingDropdown']/option");
	static String url = "https://www.testandquiz.com/selenium/testing.html";
	static List<WebElement> elements;
	
	public static void main(String[] args) {
		
		
		driver = ElementUtil.launchBrowser(driver, "chrome");

		ElementUtil.launchURL(driver, url);

		elements = driver.findElements(selectDropDown);
		
		System.out.println(elements.size());
		
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().equals("Performance Testing")) {
				elements.get(i).click();
			}
		}
		
		
		
		
		
	}

}
