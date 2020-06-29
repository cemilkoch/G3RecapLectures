package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sel_13_FindElementsConcept {

	static WebDriver driver;
	static List<WebElement> listElements;
	
	
	public static void main(String[] args) {
		
		// findElement() Method
		// This is used to access any single element on the web page
		// It will return the first matching element specified by the locator
		// Throws NoSuchElementException if there isn't any match
		
		// findElements() method
		// This will return a whole list of all elements matching the specified locator
		// If there isn't any match it returns an empty list
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		ElementUtil.launchURL(driver, "https://www.linkedin.com");
		
		listElements = driver.findElements(By.tagName("a"));
		System.out.println(listElements.size());
		
		
		for (int i = 0; i < listElements.size() ; i++) {
			String text = listElements.get(i).getText();
			//System.out.println(text);
			if (!text.isEmpty()) {
				System.out.println(text);
			}
			if (text.equals("Careers")) {
				listElements.get(i).click();
				break;
			}
			
			
		}
	}

}
